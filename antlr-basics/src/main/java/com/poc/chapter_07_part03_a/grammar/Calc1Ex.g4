grammar Calc1Ex;
result : expression ;
expression : expression MULT expression       # Mult
           | expression ADD expression        # Add
           | INT                              # Int;


MULT: '*' ;
ADD : '+' ;
INT : [0-9]+ ;
WS : [ \t\n]+ -> skip ;