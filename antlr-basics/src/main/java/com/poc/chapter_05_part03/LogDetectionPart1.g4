grammar LogDetectionPart1;

file : NL+ ;
STUFF : ~'\n'+ -> skip ;
NL : '\n' ;