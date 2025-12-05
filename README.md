# Java CH1 계산기 과제
2개의 양의 정수를 입력받고, 사칙연산을 수행하는 기본 계산기 프로그램이다.
사용자가 'exit'을 입력하기 전까지 반복적으로 연산을 수행한다.

## 핵심 목표

- 양의 정수 입력 (0 포함, 음수 입력 시 재입력 요청)
- 사칙연산 처리
- 예외 처리 (분모가 0일 경우 오류 메시지 출력)
- 반복 실행 (exit 입력 시 종료)
 
## 프로젝트 구조
CalculatorProject -> src -> com.example.calculator -> Main.java


## 구현 과정
### 프로젝트 생성
- IntelliJ IDEA → New Project
- Package 생성: `com.example.calculator`
- Class 생성: `Main.java`

### 주요 기능 구현
- 사용자 입력  
- if / switch문 활용  
- while 반복문 활용  
- exit 입력 시 종료  

### 실행 예시
첫 번째 숫자를 입력하세요:  
10  
두 번째 숫자를 입력하세요:  
5  
사칙연산 기호를 입력하세요:  
+  
15  
결과: 15  
더 계산하시겠습니까? (exit 입력 시 종료): exit  
계산기를 종료합니다!  
