grammar Expr;

prog : statement+;
statement : expression NEWLINE
            | ID '=' expression NEWLINE
            | NEWLINE
            ;
expression : expression ('*'|'/') expression
            | expression ('+'|'-') expression
            | INT
            | ID
            | '(' expression ')';

ID : [a-zA-Z]+ ;
INT : [0-9]+ ;
NEWLINE : '\r'? '\n' ;
WS : [ \t]+ -> skip ;



