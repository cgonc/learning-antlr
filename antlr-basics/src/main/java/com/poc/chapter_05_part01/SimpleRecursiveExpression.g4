grammar SimpleRecursiveExpression;

expr : ID '[' expr ']' | INT ;

ID  : [(a-z|A-Z)]+ ;
INT  : [0-9]+ ;
WS  : [ \t\r\n]+ -> skip ;