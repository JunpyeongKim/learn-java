7. 자바의 자료구조 : 배열과 컬렉션
===========================

# 7.1 배열로 다수의 객체 관리하기 (TBD)
    - 7-1: ArrayExample1.java
    - 7-2: ArrayExample2.java
    - 7-3: ArrayExample3.java

-----------------------------------------------------

# Knowhow 7.1 : 난수를 만들어주는 Random 클래스 (TBD)
    - 7-3: RandomExample.java
- (*) upcasting vs. downcasting
    - Object[] objArray 에 Long 객체를 넣으면 Object로 upcasting 되어 저장되므로, 이 배열에서는 Object 객체가 반환된다


-----------------------------------------------------

# 7.2 자바에는 컬렉션이라는 편리한 것이 있다 1
## 7.2.1 Collection Framework 의 핵심 인터페이스들 (TBD)
    - List 인터페이스
    - Set 인터페이스
    - Queue 인터페이스 ???
    - Map 인터페이스
## 7.2.2 자바의 기본 인터페이스인 Collection 인터페이스 (TBD)
## 7.2.3 순차 처리를 위한 List 인터페이스 (TBD)
    - ArrayList
    - Vector
    - LinkedList
    - Stack ???
## 7.2.4 List 인터페이스를 구현한 ArrayList 와 Vector 클래스 (WIP)
    - 7-5: ListExample1.java
    - 7-6: VectorExample1.java
- Collection
    - = Container
    - Java Collection Framework
        - 장점
            - 프로그래밍 편리
            - 고성능 : 최적화된 알고리즘으로 구현되었다
            - 통합된 API 구조  : API 들이 비슷한 구조로 개발됨
            - 재활용성 증대
        - Collection interface
            - List interface
            - Queue interface
            - Set interface
        - Map interface
- List interface
    - 순차 처리
    - 대량의 데이터 처리
    - ArrayList, LinkedList, Vector, Stack
    - ArrayList vs Vector
        - Vector : Synchronization 제공
        - ArrayList : 속도가 빠르다
- Set interface
    - 중복 데이터 미허용
    - 순서가 없다
- Map interface
    - key-value 구조
- Collection interface
    - JCF 의 가장 기본 인터페이스


-----------------------------------------------------

# 7.3 자바에는 컬렉션이라는 편리한 것이 있다 2
## 7.3.1 비중복 처리를 위한 Set 인터페이스 (TBD)
    - HashSet
    - LinkedHashSet
    - TreeSet
## 7.3.2 HashSet 구현 클래스 (WIP)
    - 7-7: HashSetExample1.java
## 7.3.3 Key/Value 데이터 관리를 위한 Map 인터페이스 (WIP)
    - 7-8: MapExample1.java
## 7.3.4 컬렉션과 관련 있는 알고리즘 (WIP)
    - 7-9: SortExample1.java
## 7.3.5 반복 처리를 위한 Iterator 와 Enumeration (WIP)
    - 7-10: IteratorExample1.java
    - 7-11: EnumerationExample1.java

 
-----------------------------------------------------

# Knowhow 7.2 : NullPointerException 에러를 방지하는 세 가지 방법 (WIP)
    - Collection 객체를 처리할때 쉽게 발생하는 에러 
    - 7-12: NullableExample1.java
    - 7-13: NullableExample2.java

# Knowhow 7.3 : ValueObject 디자인 패턴과 Get/Set 메소드
    - 7-14: MemberValue.java
    - 7-15: MoneyValue.java
    - 7-16: MoneyExample.java
