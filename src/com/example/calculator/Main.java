package com.example.calculator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // 반복문
        while (true) {
            System.out.println("첫 번째 숫자를 입력하세요: ");
            int num1 = scanner.nextInt();
            if (num1 < 0) {
                System.out.println("양의 정수만 입력해주세요!");
                continue;
            }

            System.out.println("두 번째 숫자를 입력하세요: ");
            int num2 = scanner.nextInt();
            if (num2 < 0) {
                System.out.println("양의 정수만 입력해주세요!");
                continue;
            }

            // 사칙연산 기호 입력받기
            System.out.println("사칙연산 기호를 입력하세요: ");
            String quo = scanner.next();

            // 결과 변수 선언
            int result = 0;

            // if문 활용
//        if (num1 >= 0 && num2 >= 0){
//
//            if (quo.equals("+")){
//                result = num1 + num2;
//            } else if (quo.equals("-")){
//                result = num1 - num2;
//            } else if (quo.equals("*")){
//                result = num1 * num2;
//            } else if (quo.equals("/")){
//                if (num2 == 0){
//                    System.out.println("분모에는 0이 들어갈 수 없습니다!");
//                    return;
//                }
//                result = num1 / num2;
//            }
//
//            System.out.println(num1 + quo + num2 + "=" + result);
//        }

            // switch문 활용
            switch (quo) {
                case "+":
                    System.out.println(result = num1 + num2);
                    break;
                case "-":
                    System.out.println(result = num1 - num2);
                    break;
                case "*":
                    System.out.println(result = num1 * num2);
                    break;
                case "/": {
                    if (num2 == 0) {
                        System.out.println("분모에는 0이 들어갈 수 없습니다!");
                        return;
                    }
                    System.out.println(result = num1 / num2);
                    break;
                }
            }

            System.out.println("결과: " + result);

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            String exit = scanner.next();

            if (exit.equals("exit")) {
                System.out.println("계산기를 종료합니다!");
                return;
            }
        }
    }
}


