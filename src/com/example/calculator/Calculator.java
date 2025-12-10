package com.example.calculator;

import java.util.ArrayList;
import java.util.List;

public class Calculator<T extends Number> {

    // 1. 속성
    private T num1;
    private T num2;
    private Operator operator;

    private final List<Double> results = new ArrayList<>();

    // 2. 생성자
    public Calculator() {
    }

    // 3. 기능 (Setter)
    public void setNum1(T num1) {
        this.num1 = num1;
    }

    public void setNum2(T num2) {
        this.num2 = num2;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    // 계산 기능
    public double calculate() {

        double a = num1.doubleValue();
        double b = num2.doubleValue();
        double result = 0;

        switch (operator) {
            case PLUS:
                result = a + b;
                break;
            case MINUS:
                result = a - b;
                break;
            case MULTIPLY:
                result = a * b;
                break;
            case DIVIDE:
                if (b == 0) {
                    System.out.println("분모에는 0이 들어갈 수 없습니다!");
                    return 0;
                }
                result = a / b;
                break;
        }

        // 결과를 리스트에 저장
        results.add(result);

        return result;
    }

    // 지금까지 계산된 결과 리스트를 돌려주는 Getter
    public List<Double> getResult() {
        return results;
    }

    // 결과 리스트 통째로 바꾸는 Setter
    public void setResult(List<Double> result) {
        results.clear();
        results.addAll(result);
    }

    // 가장 먼저 저장된 결과를 삭제하는 메서드
    public Double removeFirstResult() {
        if (results.isEmpty()) {
            return null;
        }
        return results.remove(0);
    }
}
