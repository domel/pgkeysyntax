grammar PGKeys;	
pgkeys : 'FOR' scope ('EXCLUSIVE' | 'MANDATORY' | 'EXCLUSIVE MANDATORY' | 'EXCLUSIVE SINGLETON' | 'MANDATORY SINGLETON' | 'IDENTIFIER') descriptor ;
scope : (var | dnode | varprop) ('WITHIN' statement ('WHERE' varprop op STRING)? )? ;
descriptor : vars | varprops | varsplusvarprops ('WITHIN' statement)? ;

var : STRING ;
dnode : '(' var ':' STRING ')' ;
stmtnode : ( ( var ':' STRING) | ( ':' STRING) | var )* ;
stmtedge : ( var ':' STRING) | ( ':' STRING) | var ; 
varprop : var '.' STRING ;
vars : var (',' var)* ;
varprops : varprop (',' varprop)* ;
varsplusvarprops : vars (',' varprops)* | varprop (',' vars)* | vars (',' varprops ',' vars)* ;
statement : '(' stmtnode ')-[' stmtedge ']->(' stmtnode ')' ;
op : '>' | '<' | '=' | '<>' | '!=' | '>=' | '<=' ;

STRING: CHAR+ ;
CHAR : 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' ;
WS : [ \t\n]+ -> skip ;

