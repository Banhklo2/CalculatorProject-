package com.example.calculator;

public enum Operator {
    PLUS('+'),
    MINUS('-'),
    MULTIPLY('*'),
    DIVIDE('/');

    // 각 연산자 기호를 저장할 필드
    private final char symbol;

    // enum 생성자
    Operator(char symbol) {
        this.symbol = symbol;
    }

    // 저장된 연산자 기호를 꺼내는 메서드
    public char getSymbol() {
        return symbol;
    }

    // 문자('+', '-', '*', '/')를 Enum 값으로 바꿔주는 기능
    public static Operator fromChar(char ch) {
        switch (ch) {
            case '+':
                return PLUS;
            case '-':
                return MINUS;
            case '*':
                return MULTIPLY;
            case '/':
                return DIVIDE;
            default:
                return null;
        }
    }
}
