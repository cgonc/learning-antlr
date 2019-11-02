grammar LexerRules;

stats   : stat* ;
stat    : exp* ';' ;
exp     : ID | for;

ID      : [a-zA-Z0-9]+;
WS      : [ \t\r\n]+ -> skip ;

for     : 'for' ;