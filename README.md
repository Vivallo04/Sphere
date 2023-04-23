# Sphere

The Sphere Programming Language is a toy language that compiles to arduino! 
It may not be easier than arduino, but it's a fun project to work on. Its purpose
is to see the arduino code in a different way. 

---
## Requirements
- Java 16 (JDK)
- Powershell (Windows)
- Bash (Linux)
- ANTLR4 (just for development)

---
## How to use
### Windows or Linux

1. Clone the repository
2. Open the project in your favorite IDE
3. Run the build.gradle file
4. Run the `build.ps1` file (Windows) or the `build.sh` file (Linux)

### Download the compiler
1. Download the latest release
2. Extract the zip file
3. Run the `build.ps1` file (Windows) or the `build.sh` file (Linux)

---
## Sphere Syntax
### Variables

Current supported types are:
- Integers
- Booleans
- Strings

```
-- Define a variable
-- Def(@<name>, <type>, <value>*);

Def(@x, integer, 10);
Def(@w, integer);
Def(@y, boolean, True);'
Def(@z, string, "Hello World");
```

### Print

```
-- Print(<expression>);
=>(1243);
=>("Hello World");
=>(True);
=>(@x);
```

### Grammar
The current grammar is wider than the one shown below. 
The one below is the one that is currently implemented.
```agsl
<program> ::= { <definition> } <statement> { <statement> }
<definition> ::= "Def" "(" <identifier> "," <type> [ "," <expression> ] ")" ";"
<type> ::= "integer" 
           | "boolean"

<statement> ::= <assignment> 
                | <function_call> 
                | <output>

<assignment> ::= <identifier> "(" [ <expression> ] ")" "=" <expression> ";"
<function_call> ::= <identifier> "(" [ <expression> ] ")" ";"
<output> ::= "=>" "(" <expression> ")" ";"
<expression> ::= <term> { ( "+" | "-" | "*" | "/" ) <term> }
<term> ::= <factor> 
            | <identifier> 
            | <integer> 
            | <boolean> 
            | "(" <expression> ")"

<factor> ::= <identifier> 
            | <integer> 
            | <boolean>

<identifier> ::= "@" <letter> { <letter> | <digit> }
<integer> ::= <digit> { <digit> }
<boolean> ::= "True" | "False"
<letter> ::= "A" | "B" | ... | "Y" | "Z" | "a" | "b" | ... | "y" | "z"
<digit> ::= "0" | "1" | "2" | "3" | "4" | "5" | "6" | "7" | "8" | "9"
```