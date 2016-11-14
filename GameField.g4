grammar GameField;

// das spielfeld file
file : row* EOF ;

// jede zeile besteht aus einem values, wobei sobald ein weiterer value folgt immer ein separator dazwischen stehen muss
row : value (Separator value)* (LineBreak | EOF) ;

// wasser oder schiff wert
value : SimpleValue;

// Trenner
Separator : ';' ;

// mögliche Zeilenumbrüche
LineBreak : '\r'?'\n' | '\r' ;

// Anything but a line-breaking, separator or quoting character is allowed
SimpleValue : 'w' | 's' ;