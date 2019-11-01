grammar JSONsimple;

object : '{' field* (',' field)* '}' ;
field : ID ':' value ;
value : (INT|ID|object);

INT : [0-9]+ ;
ID  : [(a-z|A-Z)]+ ;
WS  : [ \t\r\n]+ -> skip ;
