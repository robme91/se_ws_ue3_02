import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Codegenerator for battleship .csv files
 * Created by Robin on 14.11.2016.
 */
public class GameFieldGenerator extends GameFieldBaseListener {

    private static final String INFILE_PATH = "field.csv";
    private static final String OUTFILE_PATH = "src/GeneratedGameField.java";

    private static List<String> charLines = new ArrayList<>();
    private String currentLine = "";


    /**
     * Starts the playfield generator. reads the level file gameField.csv
     * and generates a java class of it
     * @param args not used
     */
    public static void main(String[] args)  {
        try {
            parseFile();
            writeFile(buildGenClass(), OUTFILE_PATH);
            System.out.println("Class generated without problems");
        }catch(Exception e){
            System.err.println("Playfield could not be generated from File: ");
            e.printStackTrace();
        }
    }

    /**
     * Parses the file with generated gamefield lexer and parser
     * @throws IOException If something goes wrong with the parser or lexer
     */
    private static  void parseFile () throws IOException{
        // Get gamefield lexer
        GameFieldLexer lexer = new GameFieldLexer(new ANTLRInputStream(new FileReader(INFILE_PATH)));

        // Get a list of matched tokens
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // Pass the tokens to the parser
        GameFieldParser parser = new GameFieldParser(tokens);

        // Specify our entry point
        GameFieldParser.FileContext fileContext = parser.file();

        // Walk it and attach our listener
        ParseTreeWalker walker = new ParseTreeWalker();
        GameFieldBaseListener listener = new GameFieldGenerator();
        walker.walk(listener, fileContext);
    }

    @Override
    public void enterValue(GameFieldParser.ValueContext ctx) {
        if(!ctx.getText().equals("s") && !ctx.getText().equals("w")){
            throw new IllegalArgumentException("Wrong character");
        }else{
            currentLine += "\"" + ctx.getText() + "\"" + ",";
        }
    }

    @Override
    public void exitRow(GameFieldParser.RowContext ctx) {
        currentLine = currentLine.substring(0,currentLine.length()-1);
        if(charLines.size() > 1){
            if(charLines.get(0).length() != currentLine.length()){
                throw new IllegalArgumentException("Lines have different length");
            }
        }
        charLines.add(currentLine);
        currentLine = "";
    }

    /**
     * Build a String list which contains per String one line of the
     * generating class.
     * @return A List of Strings which represents the lines of the generating class
     */
    private static List<String> buildGenClass(){
        final List<String> linesOutfile = new ArrayList<>();
        linesOutfile.add("import java.util.ArrayList;");
        linesOutfile.add("import java.util.Arrays;");
        linesOutfile.add("import java.util.List;");
        linesOutfile.add("class GeneratedPlayfield {");
        linesOutfile.add("static List<List<String>> getPlayfield() {");
        linesOutfile.add("List<List<String>> playfield = new ArrayList<>();");
        charLines.forEach(
                line -> linesOutfile.add("playfield.add(new ArrayList<>(Arrays.asList(" + line + ")));"));
        linesOutfile.add("return playfield;");
        linesOutfile.add("}");
        linesOutfile.add("}");
        return linesOutfile;
    }

    /**
     * Writes a text file from a list of strings.
     *
     * @param lines List of Strings
     * @param path  Filepath
     */
    private static void writeFile(List<String> lines, String path) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(path));
            for (String line : lines) {
                bw.write(line);
                bw.write(System.getProperty("line.separator"));
            }
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

