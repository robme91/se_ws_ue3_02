import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
class GeneratedPlayfield {
static List<List<String>> getPlayfield() {
List<List<String>> playfield = new ArrayList<>();
playfield.add(new ArrayList<>(Arrays.asList("w","w","w","s","s","s","s")));
playfield.add(new ArrayList<>(Arrays.asList("w","s","w","w","w","w","w")));
playfield.add(new ArrayList<>(Arrays.asList("w","s","w","w","w","w","w")));
playfield.add(new ArrayList<>(Arrays.asList("w","s","w","s","s","s","s")));
playfield.add(new ArrayList<>(Arrays.asList("w","s","w","w","w","w","w")));
playfield.add(new ArrayList<>(Arrays.asList("w","s","w","w","w","w","w")));
playfield.add(new ArrayList<>(Arrays.asList("w","w","s","s","w","w","w")));
playfield.add(new ArrayList<>(Arrays.asList("w","w","s","s","s","s","s")));
return playfield;
}
}
