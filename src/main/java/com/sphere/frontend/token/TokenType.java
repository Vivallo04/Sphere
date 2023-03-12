package com.sphere.frontend.token;

public enum TokenType {
    ASTERISK(204),
    EOF(-1),
    EQ(201),
    EQEQ(206),
    GT(210),
    GTEQ(211),
    IDENT(2),
    LT(208),
    LTEQ(209),
    MINUS(203),
    NEWLINE(0),
    NOTEQ(207),
    NUMBER(1),
    PLUS(202),
    SLASH(205),
    STRING(3),

    // Keywords
    ENDIF(108),
    ENDWHILE(111),
    GOTO(102),
    IF(106),
    INPUT(104),
    LABEL(101),
    LET(105),
    PRINT(103),
    REPEAT(110),
    THEN(107),
    WHILE(109);

    public int value;
    TokenType(int value) {
        this.value = value;
    }
}
