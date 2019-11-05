grammar JSON;

json : object | array ;

object : LCP pair (COL pair)* RCP
       | LCP RCP // empty object
       ;
pair: STRING SC value ;

array : LSP value (COL value)* RSP
         | LSP RSP // empty array
         ;
value : STRING
      | NUMBER
      | object // recursion
      | array // recursion
      | TRUE // keywords
      | FALSE
      | NULL ;

STRING : '"' (ESC | ~["\\])* '"' ;
fragment ESC : '\\' (["\\/bfnrt] | UNICODE) ;
fragment UNICODE : 'u' HEX HEX HEX HEX ;
fragment HEX : [0-9a-fA-F] ;

NUMBER : '-'? INT '.' INT EXP? // 1.35, 1.35E-9, 0.3, -4.5
       | '-'? INT EXP // 1e10 -3e4
       | '-'? INT // -3, 45
       ;
fragment INT : '0' | [1-9] [0-9]* ; // no leading zeros
fragment EXP : [Ee] [+\-]? INT ; // \- since - means "range" inside [...]

WS : [ \t\n\r]+ -> skip ;

LCP : '{' ;
RCP : '}' ;
LSP : '[' ;
RSP : ']' ;
SC : ':';
COL : ',' ;
TRUE : 'true';
FALSE : 'false' ;
NULL : 'null';