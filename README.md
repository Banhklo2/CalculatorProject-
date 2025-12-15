# 🧮 CalculatorProject

**2개의 숫자와 연산자를 입력받아 사칙연산을 수행하는 Java 계산기 프로젝트**  
Step별로 기능을 확장하며 **객체지향 분리 → Enum → 제네릭 → 람다&스트림**까지 연습했습니다.

---

## ✅ 주요 기능

- 두 수 입력 후 사칙연산 수행 (`+`, `-`, `*`, `/`)
- 사용자가 종료 입력을 하기 전까지 반복 실행
- 계산 결과를 `List`에 저장
- 가장 먼저 저장한 결과 삭제 기능 (FIFO)
- (Step3) `Enum`으로 연산자 관리
- (Step3) `Generic(T extends Number)`으로 다양한 숫자 타입 처리
- (Step3) 람다&스트림으로 조건 기반 결과 조회/가공

---

## 🧩 Step별 목표

### Step 1. 기본 계산기
- 입력 → 연산 → 출력의 기본 흐름 구현

### Step 2. 객체지향 구조로 개선
- `Main`과 `Calculator` 클래스를 분리
- 상태(숫자/연산자/결과 리스트)를 객체로 관리

### Step 3. 확장형 계산기
- `Operator enum`으로 연산자 타입을 안전하게 제한
- `Calculator<T extends Number>`로 타입 확장
- Stream으로 결과 리스트를 필터링/조회

---

## 🗂️ 프로젝트 구조

```text
CalculatorProject/
 ├─ src/
 │  └─ com/example/calculator/
 │      ├─ Main.java
 │      ├─ Calculator.java
 │      └─ Operator.java
 └─ README.md
