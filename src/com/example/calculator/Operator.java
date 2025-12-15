package com.example.calculator;

public enum Operator {
    // Enum 상수들 : 실제로는 Operator 객체 4개를 만들어두는 것과 같음
    PLUS('+'),
    MINUS('-'),
    MULTIPLY('*'),
    DIVIDE('/');

    // 각 연산자 기호를 저장할 필드 (한 번 정해지면 바뀌지 않게 final)
    private final char symbol;

    // enum 생성자 : 각 상수(PLUS 등)가 생성될 때 symbol 값을 세팅함
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
                // 지원하지 않는 연산자 null 반환
                return null;
        }
    }
}
