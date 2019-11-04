grammar CSV;

file: hdr row+;
hdr : row;
row : element (',' element)* NL;
element : TEXT | STRING |;

TEXT : ~[,\n\r"]+ ;
STRING : '"' ('""'|~'"')* '"' ; // quote-quote is an escaped quote
NL : '\r'? '\n' ;