5. 객체 지향 프로그래밍의 시작
========================

# 5.1 클래스와 객체, 인스턴스 개념 구분하기
- JVM 에서 메모리를 할당받은 클래스 --> 객체
    - 클래스와 객체를 구별 --> JVM Heap 메모리 영역에 생성 여부
- (*) 파일 & 클래스의 이름은 반드시 대소문자 일치해야 한다
- (*) Auto-boxing vs. Unboxing
    - Auto-boxing : Primitive Type --> Wrapper Class
    - Unboxing : Wrapper Class --> Primitive Type
- Instantiation vs. Abstraction
    - Instantiation : Class --> JVM Object
    - Abstraction : JVM Object --> Class


# 5.2 클래스를 구성하는 메소드와 생성자, 그리고 속성
- "클래스 = 데이터 영역 + 기능 영역"
- Constructor
    - (*) 객체를 생성하기 위한 특별한 메소드
    - 반환 데이터형이 없다
    - 클래스 이름과 반드시 같아야 한다
    - 모든 클래스에는 반드시 생성자가 있어야 한다. 그렇지 않으면 자바 컴파일러는 컴파일하는 동안 기본 형태의 생성자를 자동으로 생성한다
        - ex) HelloWorld.class 에서 확인 가능
    - 상속되지 않는다
    - new 키워드를 사용해서 호출
- ConstructorExample.java & ConstructorLauncher.java
- MethodExample1.java
    - 생성자와 메소드 구분


# 5.3 속성으로 객체의 상태 표현하기
- Pencil.java


# 5.4 package 와 import 키워드로 명시적 선언하기
- 소속을 밝히는 package 키워드
- 참조를 위한 import 키워드


# 5.5 객체 지향 프로그램 설계하기
- Abstraction
    - 객체를 설계하는 기초 단계
- Inheritance
    - 부모자식 관계를 맺는 단계
    - "is-a" law --> "Sub class is a Super class."
- Encapsulation
    - 서로 관련된 기능이나 데이터를 한 곳으로 모아서 information-hiding
- Polymorphism
    - 하나의 기능을 수행하지만 형태를 다양하게 가질 수 있는 기법
    - (*) 메소드 / 클래스 에서 가능

# Knowhow : Naming Convention
- 클래스 이름 : 반드시 대문자로 시작
- 메소드 이름 : 소문자로 시작
- 속성 이름 : 첫글자는 소문자
- 상수 이름 : 모든 글자는 대문자와 '_'로 구분
