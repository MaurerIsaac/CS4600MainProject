// ProjectLang.g4
grammar ProjectLang;

options {
  language = Java;
}

/*
 Parser rules
*/

program
  : statement* EOF
  ;

/* A 'line' in your EBNF is essentially a statement (some statements include blocks and thus do not require trailing ';') */
statement
  : varDecl ';'                                     # VarDeclStmt
  | assignment ';'                                  # AssignmentStmt
  | ifStat                                          # IfStmt
  | whileStat                                       # WhileStmt
  | forStat                                         # ForStmt
  | breakStat ';'                                   # BreakStmt
  | continueStat ';'                                # ContinueStmt
  | functionDecl                                    # FunctionDeclStmt
  | returnStat ';'                                  # ReturnStmt
  | printStat ';'                                   # PrintStmt
  | exprStmt ';'                                    # ExprStmt
  ;

/* variable declaration: 'assign' <type> [ '[' <value> ']' ] <var-name> [ '=' <expression> ] */
varDecl
  : ASSIGN_KW type ( '[' expression ']' )? Identifier ( '=' expression )?
  ;

/* l-value can be identifier with optional indexing / field access */
lvalue
  : primaryLValue
  ;

/* allow bare expressions as a statement (e.g., function calls) */
exprStmt
  : expression
  ;

/* assignment with '=' */
assignment
  : lvalue '=' expression
  ;

/* if / else */
ifStat
  : IF '(' expression ')' block ( ELSE block )?
  ;

/* while */
whileStat
  : WHILE '(' expression ')' block
  ;

/* for: for '(' <assign> ';' <condition> ';' <assign> ')' '{' <code> '}' 
   We accept optional init/cond/iter to be flexible, but keep assign-style init/iter in examples. */
forStat
  : FOR '(' (varDecl | assignment)? ';' expression? ';' (assignment | varDecl)? ')' block
  ;

/* break / continue */
breakStat
  : BREAK_KW
  ;

continueStat
  : CONTINUE_KW
  ;

/* function definition: function <type> <var-name> '(' [ <parameters> ] ')' '{' <code> '}' */
functionDecl
  : FUNCTION_KW type Identifier '(' parameterList? ')' block
  ;

/* parameter list: <type> <var-name> { ',' <type> <var-name> } */
parameterList
  : parameter ( ',' parameter )*
  ;

parameter
  : type Identifier
  ;

/* function call expression handled in primary */
functionCall
  : Identifier '(' argumentList? ')'
  ;

/* arguments */
argumentList
  : expression ( ',' expression )*
  ;

/* return [ <value> ] */
returnStat
  : RETURN_KW expression?
  ;

/* print(value) */
printStat
  : PRINT_KW '(' expression ')'
  ;

/* block: '{' statements '}' */
block
  : '{' statement* '}'
  ;

/* Expressions and precedence
   lowest precedence at the top (logical OR), highest at bottom (primary)
*/
expression
  : logicalOrExpression
  ;

logicalOrExpression
  : logicalAndExpression ( OR_KW logicalAndExpression )*
  ;

logicalAndExpression
  : equalityExpression ( AND_KW equalityExpression )*
  ;

equalityExpression
  : relationalExpression ( ( '==' | '!=' ) relationalExpression )*
  ;

relationalExpression
  : additiveExpression ( ( '<' | '<=' | '>' | '>=' ) additiveExpression )*
  ;

additiveExpression
  : multiplicativeExpression ( ( '+' | '-' ) multiplicativeExpression )*
  ;

multiplicativeExpression
  : unaryExpression ( ( '*' | '/' | '%' ) unaryExpression )*
  ;

/* unary includes 'not', unary +/-, and cast ( '(' type ')' value ) */
unaryExpression
  : NOT_KW unaryExpression
  | '+' unaryExpression
  | '-' unaryExpression
  | castExpression
  | primaryExpression
  ;

/* explicit cast: '(' <type> ')' <value>  -- implemented as '(' type ')' primaryExpression */
castExpression
  : '(' type ')' primaryExpression
  ;

/* primaryExpression includes literals, identifier (with field/index chains), array literal, function call, parenthesized expressions */
primaryExpression
  : primaryLValue                               // identifier, possibly with indexing/field-access and function-call ambiguity resolved
  | literal
  | arrayLiteral
  | functionCall
  | '(' expression ')'
  ;

/* primaryLValue: Identifier with optional chains of indexing or field access
   e.g., arr[2].field[3].foo
*/
primaryLValue
  : Identifier ( ( '[' expression ']' ) | ( '.' Identifier ) )*
  ;

/* array literal: '[' { <value> ',' } [ <value> ] ']'  -> implemented as comma-separated list */
arrayLiteral
  : '[' ( expression ( ',' expression )* )? ']'
  ;

/* literals */
literal
  : IntLiteral
  | FloatLiteral
  ;

/* type: int | float | user-defined struct name or array types (we keep it simple: base types are keywords) */
type
  : INT_KW
  | FLOAT_KW
  | Identifier                                   // could be struct name
  ;

/*
 Lexer rules
*/

/* Keywords and fixed tokens - put before ID so they take precedence */
ASSIGN_KW : 'assign' ;
FUNCTION_KW : 'function' ;
RETURN_KW : 'return' ;
IF : 'if' ;
ELSE : 'else' ;
WHILE : 'while' ;
FOR : 'for' ;
BREAK_KW : 'break' ;
CONTINUE_KW : 'continue' ;
PRINT_KW : 'print' ;
STRUCT_KW : 'struct' ;

/* Types */
INT_KW : 'int' ;
FLOAT_KW : 'float' ;

/* Boolean operators spelled out */
AND_KW : 'and' ;
OR_KW  : 'or' ;
NOT_KW : 'not' ;

/* Literals and identifiers */
FloatLiteral
  : DIGIT+ '.' DIGIT+ 
  ;

IntLiteral
  : DIGIT+
  ;

/* Identifiers (var-name) */
Identifier
  : LETTER ( LETTER | DIGIT | '_' )*
  ;

/* Operators and punctuation */
EQ  : '==' ;
NEQ : '!=' ;
LE  : '<=' ;
GE  : '>=' ;
LT  : '<' ;
GT  : '>' ;
PLUS : '+' ;
MINUS : '-' ;
STAR : '*' ;
SLASH : '/' ;
PERCENT : '%' ;
ASSIGN : '=' ;
LPAREN : '(' ;
RPAREN : ')' ;
LBRACE : '{' ;
RBRACE : '}' ;
LBRACK : '[' ;
RBRACK : ']' ;
COMMA : ',' ;
SEMI : ';' ;
DOT : '.' ;

/* Comments and whitespace */
LINE_COMMENT
  : '//' ~[\r\n]* -> skip
  ;

BLOCK_COMMENT
  : '/*' .*? '*/' -> skip
  ;

/* Whitespace */
WS
  : [ \t\r\n]+ -> skip
  ;

/* Fragments */
fragment DIGIT : [0-9] ;
fragment LETTER : [a-zA-Z] ;
