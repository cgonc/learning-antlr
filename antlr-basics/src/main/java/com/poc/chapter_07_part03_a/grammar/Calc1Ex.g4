grammar Calc1Ex;
result : expression ;
expression : expression operation=MULT expression       # Mult
           | expression operation=ADD expression        # Add
           | INT                                        # Int
           ;

MULT: '*' ;
ADD : '+' ;
INT : [0-9]+ ;
WS : [ \t\n]+ -> skip ;