grammar JSONsimple;

object : '{' field* (',' field)* '}' ;
field : ID ':' ID ;

ID  : [(a-z|1-9)]+ ;
WS  : [ \t\r\n]+ -> skip ;
