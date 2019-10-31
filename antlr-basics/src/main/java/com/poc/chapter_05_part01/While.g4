grammar While;

statement : 'while' parExpression ;

parExpression
    :   '(' expression ')'
    ;

expression : 'true';
