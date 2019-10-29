grammar Csv;

file : (row NL)* ;
row : ID (',' ID )* ;

ID  : [(a-z|1-9)]+ ;
NL   :  '\r'? '\n' ;
WS  : [ \t\r\n]+ -> skip ;