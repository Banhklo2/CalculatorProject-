package com.example.calculator;

import java.io.InputStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // 입력 도구 + 계산기 객체 생성
        Scanner scanner = new Scanner(System.in);
        Calculator<Double> calculator = new Calculator<Double>();

        // 반복문 (사용자가 exit 입력 전까지 무한 반복)
        while (true) {

            System.out.println("첫 번째 숫자를 입력하세요: ");
            int num1 = scanner.nextInt();
            if (num1 < 0) {
                System.out.println("양의 정수만 입력하세요!");
                continue;
            }

            System.out.println("두 번째 숫자를 입력하세요: ");
            int num2 = scanner.nextInt();
            if (num2 < 0) {
                System.out.println("양의 정수만 입력하세요!");
                continue;
            }

            // 사칙연산 기호 입력받기
            System.out.println("사칙연산 기호를 입력하세요: ");
            char operator = scanner.next().charAt(0);

            // Main에서 입력받은 값을 Calculator 객체에 값 전달 (Setter 사용)
            calculator.setNum1((double) num1);
            calculator.setNum2((double) num2);
            calculator.setOperator(Operator.fromChar(operator));

            // 계산 수행 및 결과 출력
            double result = calculator.calculate();
            System.out.println("결과: " + result);

            // 현재까지 저장된 결과 리스트 출력 (Getter 사용)
            System.out.println("현재까지 저장된 결과물: " + calculator.getResult());

            // 가장 먼저 저장된 결과 삭제 여부
            System.out.println("가장 먼저 저장된 결과를 삭제하시겠습니까? (y 입력 시 삭제)");
            String delete = scanner.next();

            if (delete.equalsIgnoreCase("y")) {
                Double removed = calculator.removeFirstResult();

                if (removed == null) {
                    System.out.println("삭제할 결과가 없습니다.");
                } else {
                    System.out.println("removed = " + removed);
                    System.out.println("삭제 후 결과물: " + calculator.getResult());
                }
            }

            // 람다&스트림 조회 기능 실행 여부
            System.out.println("기준값보다 큰 결과를 조회하시겠습니까? (y 입력 시 조회)");
            String search = scanner.next();

            if (search.equalsIgnoreCase("y")) {
                System.out.println("기준 값을 입력하세요: ");
                double value = scanner.nextDouble();

                System.out.println("기준값보다 큰 결과들:");
                calculator.printResultsGreaterThan(value);
            }

            // 종료 여부
            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            String exit = scanner.next();

            if (exit.equalsIgnoreCase("exit")) {
                System.out.println("계산기를 종료합니다!");
                return;
            }
        }
    }
}
