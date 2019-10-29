grammar FunctionCall;

expr : '(' ID* (',' ID)* ')' ;
ID  : [(a-z|1-9)]+ ;

WS  : [ \t\r\n]+ -> skip ;