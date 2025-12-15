package com.example.calculator;

import java.util.ArrayList;
import java.util.List;

public class Calculator<T extends Number> {

    // 1. 속성
    // 제너릭 타입 T
    private T num1;
    private T num2;
    // 연산자는 Enum 타입
    private Operator operator;

    // 결과를 저장하는 리스트 (계산 결과는 double로 통일)
    private final List<Double> results = new ArrayList<>();

    // 2. 생성자
    public Calculator() {
    }

    // 3. 기능 (Setter)
    // setter : main에서 입력받은 값을 calculator에 전달할 때 사용
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

        // T 타입은 직접 계산이 불가능하므로 double로 변환해서 계산
        double a = num1.doubleValue();
        double b = num2.doubleValue();
        double result = 0;

        // operator(Enum)에 따라 계산 수행
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

        // 계산 결과를 리스트에 저장
        results.add(result);

        // 계산 결과 반환
        return result;
    }

    // 지금까지 계산된 결과 리스트를 돌려주는 Getter
    public List<Double> getResult() {
        return results;
    }

    // 결과 리스트 통째로 바꾸는 Setter (기존 리스트를 비우고 새 값으로 교체)
    public void setResult(List<Double> result) {
        results.clear();
        results.addAll(result);
    }

    // 가장 먼저 저장된 결과를 삭제
    public Double removeFirstResult() {
        if (results.isEmpty()) {
            return null;
        }
        return results.remove(0);
    }

    // 람다&스트림 조회 기능: 기준값보다 큰 결과 출력
    public void printResultsGreaterThan(double value) {
        results.stream()
                .filter(r -> r > value)          // 조건 : value보다 큰 값만
                .forEach(System.out::println);   // 출력
    }
}
