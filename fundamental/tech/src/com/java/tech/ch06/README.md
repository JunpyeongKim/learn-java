6. 객체 지향 프로그래밍, 한 걸음 더
============================


# 6.1 상속을 알아야 유연한 설게를 할 수 있다
- HospitalExample.java
    - PersonValue.java <-- DoctorValue.java | NurseValue.java | PatientValue.java
- 상속을 사용하는 가장 큰 이유 ==> "재활용"
- 과정
    - 객체의 추상화 --> 공통점 추출 --> 공통 객체 생성 --> is-a, has-a law 검증 --> 상속 적용
- 장점
    - 1) 재활용함으로써 간소화된 클래스
    - 2) 기능 테스트에 대한 생산성 및 정확성 증가
    - 3) 수정/추가에 대한 유연성 및 확장성 증가
- 모든 클래스는 Object 클래스를 상속받는다
    - equals()
    - hashCode()
    - clone()
    - finalize()
    - notify()
    - notifyAll()
    - wait()
    - toString()
    - getClass()
- (*) Type Hierarchy View : IntelliJ IDEA > Navigator > Type Hierarchy


# 6.2 오버로딩과 오버라이딩 기법 구분하기
- OverridingParent.java <-- OverridingChild.java
- Polymorphism 을 구현하는 Overloading
- 재정의를 가능하게 해주는 Overriding
    - 제외 : 접근 제어자 & 예외 처리
- (*) ==> 공통점 : Polymorphism 을 구현하는 기법 --> 하나의 클래스 vs. 상속 관계


# 6.3 super 와 this 키워드를 사용해 명시적으로 객체 지칭하기
- CoffeeValue.java <-- CoffeeLatteValue.java
    - super.getInfo() vs. this.getInfo()
- this : 자신이 속한 객체
- super : 자신이 속한 객체의 부모 객체


# 6.4 객체 형 변환하기
- CastingExample.java
- 객체의 형 변환은 반드시 상속 관계에 있는 객체끼리만 가능
    - Up-casting vs. Down-casting
        - Up-casting (Implicitly Casting) : Child --> Parent
            - (*) 형 변환 연산자를 생략 가능 <-- 부모는 무조건 하나 이므로
        - Down-casting (Explicitly Casting) : Parent --> Child


# 6.5 제어자로 특별한 의미 부여하기
- ModifierTester.java | ModifierTest2.java
    - ModifierExample.java 
- FinalExample.java
- StaticTester.java
    - StaticExample.java
- Access Modifier : 외부에서 접근(사용, 참조 등) 가능한 범위를 제한 --> public & default ==> Encapsulation 구현 가능한 키워드
- final
    - Class : Inheritance 불가
    - Method : Overriding 불가
    - Variable : 변경 불가
- static : JVM 에 단 하나만 생성된다
- java HelloWorld 실행 과정
    - HelloWorld.java --> (javac) --> HelloWorld.class --> (java) --> Class loading --> Execution Engine 이 main() 을 검색
    - (*) Class loading : JVM::ClassLoader 가 HelloWorld.class & CLASSPATH(*.class | *.jar) 를 JVM 메모리(Runtime Data Area)에 적재


# 6.6 클래스를 디자인하는 방법 1 : 추상 클래스
- AbstractHandler.java <-- LongHandler.java | IntegerHandler.java


# 6.7 클래스를 디자인하는 방법 2 : 인터페이스
- GeneratorInterface.java <-- SystemGenerator.java | ServiceGenerator.java
- GeneratorExample.java
- 인터페이스
    - 구현 클래스를 제어하기 위한 목적으로 사용 (미구현시 컴파일 에러)
    - 개념만 정리된 것 <--> abstract class (개념과 일부 기능이 존재)
    - multiple inheritance & implements 가능 
- 사용 이유 
    - 1) 시스템을 구성하는 클래스의 효율적 디자인
        - e.g.) Database, 타 시스템 연동, 시스템 설계 등 큰 규모 프로젝트에 유용
    - 2) 정형화된 틀안에서 클래스 개발 가능
        - 반드시 abstract method 구현 필요하므로
    - 3) 서로 관계 없는 클래스끼지 관계 형성 가능
        - 하나의 인터페이스를 구현한다면 공통적인 메소드가 생성 --> 상위 개념으로 Up-casting 가능 --> instanceof 를 통해 하나의 메소드로 두 객체를 처리 가능
        - ==> polymorphism 을 잘 보여준다

# 6.8 클래스 안의 클래스 선언하기
- InnerClassExample1.java
    - Instance Inner Class
        - [OuterClass]$[InnerClass].class
    - 반드시 외부 클래스 객체가 필요하다
        - e.g.) MyClass - MyInnerClass
            - MyInnerClass innerObj = new MyClass().new MyInnerClass();
            - MyClass.MyInnerClass innerObject = new MyClass().new MyInnerClass();
    - static 키워드 사용 불가
- InnerClassExample2.java
    - Static Inner Class
        - [OuterClass]$[InnerClass].class
    - e.g.) MyClass - MyInnerClass
        - MyInnerClass innerObj = new MyClass.MyInnerClass();
        - MyClass.MyInnerClass innerObject = new MyClass.MyInnerClass();
- InnerClassExample3.java
    - Local Inner Class
        - [OuterClass]$[index][InnerClass].class
    - 메소드 내부에 클래스 선언 --> 메소드 내부에서만 유효
    - 특별한 사용법이 없다
- InnerClassExample4.java
    - Anonymous Class --> 일회용으로 사용
        - [OuterClass]$[index].class
    - 사용하는 경우
        - 1) 인터페이스 구현이 잠시 필요한 경우
        - 2) 기존 클래스의 일부만 Overriding 해서 변경되는 경우


# Knowhow : 메모리 사용량을 줄이기 위한 StringBuffer 클래스
- StringExample.java --> StringBufferExample.java
    - StringBuffer : Thread-safe
- 실행 시간 비교
    - StringExample2.java (5462ms) >>> StringBufferExample2.java (24ms)
