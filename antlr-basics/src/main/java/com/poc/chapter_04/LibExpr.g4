grammar LibExpr;
import CommonLexerRules;

program : statement+;
statement : expression NEWLINE
            | ID '=' expression NEWLINE
            | NEWLINE
            ;
expression : expression ('*'|'/') expression
            | expression ('+'|'-') expression
            | INT
            | ID
            | '(' expression ')';


