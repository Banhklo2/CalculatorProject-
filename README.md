# Java 계산기 과제

2개의 양의 정수를 입력받고, 사칙연산을 수행하는 계산기 프로그램이다.  
사용자가 `exit`을 입력하기 전까지 반복적으로 연산을 수행하며,  
**Step2에서는 Main과 Calculator 클래스를 분리하여 객체지향 구조로 개선**했다.

---

## ✨ 핵심 목표

- 양의 정수 입력 처리 (0 포함, 음수 입력 시 재입력 요청)
- 사칙연산 처리 (`+`, `-`, `*`, `/`)
- 예외 처리  
  - 분모가 0일 경우 오류 메시지 출력
- 반복 실행  
  - `exit` 입력 시 프로그램 종료
- (Step2) `Calculator` 객체를 통해 연산 수행
- (Step2) 계산 결과를 `List`에 저장 및 삭제 기능 구현

---

## 📁 프로젝트 구조

```text
CalculatorProject
└── src
    └── com.example.calculator
        ├── Main.java
        └── Calculator.java
        └── Operator.java
