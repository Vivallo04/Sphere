grammar Sphere;

program: line* EOF;

line
    : mainFunction    // @Principal
    | statement
    | proc            // Proc
    | print           // =>(1+1)
    | while           // While
    | alterFunction   // Alter()
    | moveFunction    // Move()
    | randomFunction  // Random()
    | repeat          // Repeat
    | until           // Until
    | setupBlock      // Setup
    | loopBlock       // Loop
    | caseFunction    // Case
    ;

statement
    : (assignment    // Def
    | functionCall   // Call
    | reAssignment   // @var(1+1)
    | variable       // @var
    | notFunction    // Not(@var)
    | isTrueFunction // IsTrue(@var)
    | print          // =>(1+1)
    ) SEMI COMMENT?;

block: '(' line* ')';
while: While expression block SEMI;
repeat: Repeat '(' (expression | statement)* Break ')' SEMI;
until: Until block expression  SEMI;
proc: Proc ID block SEMI;
assignment: Def '(' (variable (',' type) (',' constant)?) ')';
reAssignment: '@' ID '(' NOT? (constant | '@'ID | ('@'ID | INTEGER) (addOp | multOp) ('@'ID | INTEGER)) ')';
functionCall: Call '(' expression ')';
printExpr: constant | variable | expression;
variable: '@' ID;
type: 'integer' | 'boolean' | 'string';
constant: INTEGER | BOOL | STRING;

// Built in functions
alterFunction: Alter '(' variable ',' (INTEGER | variable (multOp | addOp) variable | variable)  ')' SEMI;
notFunction: Not '(' variable ')';
isTrueFunction: IsTrue '(' '@'? ID ')';
moveFunction: Move '(' moveOp ')' SEMI;
randomFunction: Random '()' SEMI;
mainFunction: '@' Principal  (block)? SEMI;
caseFunction: Case 'When' '(' expression ')' 'Then' block SEMI;


setupBlock: Setup block SEMI;
loopBlock: Loop block SEMI;
print: '=>' '(' (printExpr (',' printExpr)*)? ')' SEMI;

multOp: '*' | '/' ;
addOp: '+' | '-';
relOp: '==' | '!=' | '<' | '>' | '<=' | '>=';
moveOp: 'ATR' | 'ADL' | 'ADE' | 'AIZ' | 'IZQ' | 'DER' | 'DDE' | 'DIZ';

expression
    : constant                        #constantExpression
    | variable                        #variableExpression
    | ID                              #identifierExpression
    | INTEGER                         #integerExpression
    | '(' expression ')'              #parenthesizedExpression
    | NOT expression                  #notExpression
    | isTrueFunction                  #isTrueExpression
    | alterFunction                   #alterExpression
    | expression multOp expression    #multiplicativeExpression
    | expression addOp expression     #additiveExpression
    | variable relOp expression       #relationalExpression
    | expression relOp variable       #relationalExpression
    | mainFunction                    #mainFunctionExpression
    ;


// Data Types or syntax
BOOL: 'True' | 'False';
INTEGER: ('-'[1-9][0-9]*) | [1-9][0-9]*;
STRING: '"' ~["\r\n]* '"';
NOT: 'NOT';
SEMI: ';';

// Language
Def: 'Def';
Proc: 'Proc';
Call: 'Call';
While: 'While';
Alter: 'Alter';
Not: 'Not';
IsTrue: 'IsTrue';
Move: 'Move';
Random: 'Random';
Repeat: 'Repeat';
Until: 'Until';
Void: 'Void';
Setup: 'Setup';
Loop: 'Loop';
Break: 'Break' SEMI;
Case: 'Case';
Principal: 'Principal';
ID: [a-zA-Z_][a-zA-Z0-9_]*;

COMMENT: '--' ~[\r\n]* [\r\n]? -> skip;
WS: [ \t\r\n]+ -> skip; // skip spaces, tabs, newlines


start: COMMENT+ (mainFunction | print | statement | assignment)* ;