grammar Expr;
s : e ;
e : e op=MULT e    # Mult
  | e op=ADD e     # Add
  | INT            # Int
  ;

MULT: '*' ;
ADD : '+' ;
INT : [0-9]+ ;
WS : [ \t\n]+ -> skip ;