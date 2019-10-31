grammar Vector;

vector : '[' value* (',' value)* ']' ;
value: INT | vector;
INT  : [1-9]+ ;
WS  : [ \t\r\n]+ -> skip ;
