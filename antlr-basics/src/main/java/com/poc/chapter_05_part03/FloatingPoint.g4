grammar FloatingPoint;

stats   : stat* ;
stat    : exp* ';' ;
exp     : ID | FLOAT | STRING | STRINGESCAPED;


FLOAT : DIGIT+ '.' DIGIT*   // match 1.39 3.14159 etc...
      | '.' DIGIT+          // match .1 .14159
;

fragment

DIGIT   : [0-9] ;             // match single digit
STRING : '"' .*? '"' ; // match anything in "..."

STRINGESCAPED: '"' (ESC|.)*? '"' ;
fragment
ESC : '\\"' | '\\\\' ; // 2-char sequences \" and \\

ID      : [a-zA-Z0-9]+;
WS      : [ \t\r\n]+ -> skip ;
LINE_COMMENT : '//' .*? '\r'? '\n' -> skip ; // Match "//" stuff '\n'
COMMENT : '/*' .*? '*/' -> skip ; // Match "/*" stuff "*/"