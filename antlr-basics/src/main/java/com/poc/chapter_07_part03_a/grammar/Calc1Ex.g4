grammar Calc1Ex;
result : expression ;
expression : INT                                        # Int
           | expression operation=ADD expression        # Add
           | expression operation=MULT expression       # Mult
           ;

MULT: '*' ;
ADD : '+' ;
INT : [0-9]+ ;
WS : [ \t\n]+ -> skip ;