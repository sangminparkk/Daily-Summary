[위키독스링크](https://wikidocs.net/book/7150)


# 목차

<!-- TOC -->
- [목차](#목차)
- [01. Start 시작](#01-start-시작)
- [02. Data 자료](#02-data-자료)
- [03. Control flow statements 제어문](#03-control-flow-statements-제어문)
- [04. Function, Method, 함수 , 멤버 함수]()
- [05. data structure | 자료 구조 |]()
- [06. Class 객체]()
- [07. Exception 예외 처리]()
- [08. JAVA API]()
- [09. Collection Interface 컬렉션 인터페이스]()
- [10. Generic 제네릭]()
- [11. I/O Input Ouput 파일 입출력]()
- [12. Lambda 람다]()
- [13. Stream 스트림 처리]()
- [14. GUI 프로그래밍]()
- [15. JDBC]()
<!-- TOC -->


# 01. Start 시작
자바란? 여러 운영체제에서 동작하는 널리 사용되고 있는 객체지향 프로그래밍 언어입니다.

### Coding을 배울 때 공통적으로 중요한 것

1. 기본설정
2. 값(데이터, 변수, 오류) 출력 및 확인하기
3. 오류를 끈질기게 검토하기
4. 키워드나 용어에 익숙해지기 (특히 상반되는 2가지 개념)
5. 내가 해야할 것과 가져다 써야할 것 구분하기

### 프로그래밍언어 종류

* High-level : Java, Python, Javascript, C#, C, C++
* Low-level : machine language, Assembly Language
* Compiler : Java, C#, C, C++
* Interpreter : Python, Javascript

### Java Coding을 생에 처음 시작 할 때
1. project는 최상위 폴더다.
2. 항상 src 하위에 package나 class를 만든다.
3. package는 폴더다.
4. class는 파일이다.
5. class파일의 {}는 실행 영역 표시이다.
6. 무조건 main()의 {} 영역 안쪽에만 coding 한다 => 메소드 배우기 전까지
7. 모든 문장은 `;`로 끝나며 하나 이상의 고백은 무시된다.
8. 콘솔에서 컴파일 및 실행 : `javac`, `java`

### Compile
cmd or power shell에서 직접 실행 시키는 방법도 알고 있어야 한다.


# 02. Data 자료
코딩은 데이터를 잘 다루는 것이다.

## Data 자료
자료(資料, data, 데이터, 문화어: 데타)는 문자, 숫자, 소리, 그림, 영상, 단어 등의 형태로 된 의미 단위이다. 자료를 의미있게 정리하면 정보(information)가 된다.

## Coding에서 Data란?

* Data Analysis(데이터 분석) 측면
  * 정형 : 표로 되어 있는 데이터. (ex 엑셀, RDB)
  * 반정형 : 어느 정도 구조를 가지고 있는 데이터. (ex. JSON, XML, NoSQL)
  * 비정형 : 정형화되지 않은 데이터. (ex 동영상, 오디오, Email)
  * 질적 : 수치로 측정이 불가능한 자료 (ex. 성별, 혈액형)
  * 양적 : 수치로 측정이 가능한 자료 (ex. 온도, 가격)
  * 이산형 : 정수, 불량품 개수, 주사위에서 나온 숫자
  * 연속형 : 실수, 키, 몸무게


* Web Dev(웹개발) 측면
  * Data Type : 숫자형(정수, 실수), 문자형, 날짜형
  * DB : 데이터를 모아둔 집합
  * DBMS : DB를 체계적으로 관리하기 위한 시스템
  * NoSQL : 반정형 데이터를 모아둔 집합 및 시스템

## Output - print 출력
print 출력 : Coding을 배우는데 가장 중요한 기능
* System.out.println() : 줄 나눔이 있는 출력(엔터키포함)
* System.out.print() : 줄 나눔이 없는 출력(엔터키 미포함)
* System.out.printf() : `format`이 있는 출력

| 서식 | 설명                |
|----|-------------------|
| %b | boolean(true, false) |
| %d | 10진수 정수           |
| %o | 8진수 정수            |
| %x | 16진수 정수           |
| %f | 실수                |
| %e | 지수                |
| %c | 문자                |
| %s | 문자열               |
| %n | 줄 나눔              |

## 상수(Constant) vs 변수(Variable)
상수
* 변하지 않고, 항상 일정한 값을 갖는 수를 말한다. 변화하지 않는 값을 담을 변수를 선언할 때 사용하고, 값의 할당 후 변하지 않는 변수입니다.
* 리터럴 상수는 읽은 그대로의 의미가 있는 1,2,3,a,b,c 같은 숫자나 문자를 의미합니다.

변수
* 컴퓨터 소스 코드에서의 변수 이름은 일반적으로 데이터 저장 위치와 그 안의 내용물과 관련되어 있으며 이러한 것들은 프로그램 실행 도중에 변경될 수 있다.
* 프로그래밍에서의 변수는 값을 나타내는 문자나 문자들의 집합이며 실행 중인 컴퓨터 프로그램에서, **임의의 값을 저장한 메모리 주소**에 대응한다.

Identifier 식별자 
* 대상을 구분할 수 있는 이름

## 변수 
변수에서 중요한 것은 두가지이다.

1. 변수에 **데이터를 할당**하는 방법
2. 변수에 **할당한 데이터를 가져오는** 방법

### 변수 선언 및 초기화
```java
int num; // 변수 선언
int a = 2; // 변수 초기화 (선언 + 데이터 할당)
```

### 상수 선언 및 값 할당
선언시 대문자를 사용하며, 한번만 값을 할당해주면 된다.
```java
final double PI = 3.14;
```

## Data Type 자료형 - 기본형 vs 참조형

* 기본형
  * 종류 : 숫자형, 문자 1개형, 논리형
    * 숫자형 : int, double
    * Integer 정수형 : byte, short, int, long
    * Double 실수형 : float, double
    * Boolean 논리형 : boolean
  * `데이터`값이 할당된다

* 참조형
  * 기본형이 아닌 모든형 (String, Date, ...)
  * `주소`가 할당된다

### Operator 연산자
* 연산 : 주어진 식을 계산하여 결과를 얻어내는 과정 
* 연산자 : 연산을 수행하는 기호

### 연산 종류
* 산술, 증감 : 사칙연산, ++, --
* 비교, 논리 : >, >=, <, <=, ==, != && , ||, !
* 할당(대입) : = , +=, -=, *=, /=, %=
* 비트 : & , |, ~, <<, >>, ^
* 삼항 `? :`
* 문자열 연산
  *  문자열 → 정수 : Integer.parseInt()
  *  문자열 → 실수 : Double.parseDouble()

### Input - Scanner 입력, main(String args)
Input 입력 : 키보드, 마우스, File, DB -> 메모리의 데이터

* Scanner Class
  * System.in : 키보드 입력 `new Scanner(System.in)`
  * nextLine() : 한줄 입력 모두 저장 (엔터키 포함) 
  * next() : 공백이나 엔터키로 값 구분 입력시 각각 변수에 저장
  * nextInt() : 입력값 정수 변환


# 03. Control flow statements 제어문
프로그램의 흐름을 제어하는 경우에 사용되는 실행문으로, 조건문, 반복문, 분기문 등이 포함되어 있다.

* 조건문 : if, switch
* 반복문 : for, while, do while
* 분기문 : break, continue

Tip) 우리에게 주어진 기본 무기는 `변수`, `제어문`, `print()`. 개발자가 해야할 일은 변수와 제어문을 얼마나 잘 다루는가 이다.

## Block {} 프로그램 블럭과 변수 Scope 지역 변수, 전역 변수
* 프로그램 블럭 : 어떠한 동작을 수행할때 필요한 코드를 묶어 놓은 영역. 변수의 Scope 범위에 영향을 미친다.
* 지역 변수 : {} 코드 블럭 안에서만 사용 할 수 있는 변수
* 전역 변수 : `접근제어`의 범위에 따라 프로젝트 전 영역에서 사용할 수 있는 변수. `static` 키워드로 생성을 한다.

## conditional 조건문
위에서 아래로 모두 해석되는 흐름을 true or false의 조건을 통해 필요한 것만 실행 시킨다.

* if
  * if(true) : 위에서 아래로 순서대로 실행됨
  * if(true) ~ else : 조건이 참으면 if절, 거짓이면 else절 실행됨
  * if(true) ~ else if... ~ else : 조건의 세분화(논리연산자 사용하는 경우가 있다)
  * 중첩 if(true) {if(true) ~ else} else
* swich 
  * 모든 switch문은 if문으로 가능 
  * switch 값과 case 값이 같은 경우 실행 
  * break문 생략시 switch 값과 case 값이 같은 경우 이후 모두 실행됨
