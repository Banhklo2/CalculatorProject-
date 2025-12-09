package com.example.calculator;

import java.util.ArrayList;
import java.util.List;

public class Calculator {

    // 1. 속성
    int num1;
    int num2;
    char operator;

    private List<Integer> results = new ArrayList<>();

    // 2. 생성자
    public Calculator() {
    }

    // 3. 기능
    public void setNum1(int num1) {
        this.num1 = num1;
    }
    public void setNum2(int num2) {
        this.num2 = num2;
    }
    public void setOperator(char operator) {
        this.operator = operator;
    }

    public int calculate() {
        int result = 0;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("분모에는 0이 들어갈 수 없습니다!");
                    return 0;
                }
                result = num1 / num2;
                break;
        }

        // 결과를 리스트에 저장
        results.add(result);
        return result;
    }

    // 지금까지 계산된 결과 리스트를 돌려주는 Getter
    public List<Integer> getResult() {
        return results;
    }

    // 결과 리스트를 통째로 바꾸는 Setter
    public void setResult(List<Integer> result) {
        this.results = result;
    }

    // 가장 먼저 저장된 결과를 삭제하는 메서드
    public Integer removeFirstResult() {
        if (results.isEmpty()) {
            return null;
        }
        return results.remove(0);
    }
}
