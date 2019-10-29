grammar ClassDefinitionJava;

def : 'class' ID ('extends' ID)? '{' '}';
ID  : [(a-z|1-9)]+ ;

WS  : [ \t\r\n]+ -> skip ;