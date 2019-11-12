grammar PropertyFile;

file : prop+ ;
prop : ID '=' STRING NEWLINE ;
ID   : [a-z]+ ;
STRING : '"' .*? '"' ;

NEWLINE:'\r'? '\n' ; // return newlines to parser (end-statement signal)