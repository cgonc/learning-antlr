grammar AssocExpr;

stmt : expr EOF ;

expr : <assoc=right> expr '^' expr // ^ operator is right associative
    | expr '*' expr // match subexpressions joined with '*' operator
    | expr '+' expr // match subexpressions joined with '+' operator
    | INT // matches simple integer atom
    ;

INT : [0-9]+ ;
WS  : [ \t\r\n]+ -> skip ;