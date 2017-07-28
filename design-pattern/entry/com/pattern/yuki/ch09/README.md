9.Bridge - 기능 계층과 구현 계층 분리하기
===
- 2종류의 확장이 혼재하는 프로그램을 기능 계층과 구현 계층으로 분리하고, 그 사이를 연결하는 패턴


# 클래스 계층의 2가지 역할
- 기능의 클래스 계층
    - 새로운 기능(메소드)을 추가하고 싶을 때
    - Something
        - L SomethingGood
            - L SomethingBetter
    - ⇒ 상위 클래스(기본 기능) → 하위 클래스(새로운 기능)
- 구현의 클래스 계층
    - 기능/메소드 추가 X → 인터페이스(API)를 구현
    - AbstractClass
        - L ConcreteClass
        - L AnotherConcreteClass
    - ⇒ 상위 클래스(인터페이스 규정) → 하위 클래스(인터페이스 구현)

# ⇒ 그러므로, 우리가 하위 클래스를 만들려고 할때, 자신의 의도를 확인할 필요가 있다.
- 기능을 추가하려고 하는가? 
- 구현을 수행하려고 하는가? 
- → 그래서 ‘기능의 클래스 계층'과 ‘구현의 클래스 계층'을 두 개의 독립된 클래스 계층으로 분리하고 계층 사이에 다리를 놓는 일이 필요하다.
- → 이것이 바로 Bridge 패턴이다.

# 예제 프로그램 
- 무언가를 표시하기 위한 프로그램
- Display
    - L CountDisplay
    - imple 필드 : 두 클래스 계층의 ‘다리'가 된다. → 여기에서 Display의 인터페이스가 DisplayImpl의 인터페이스로 변환된다.
- DisplayImpl
    - L StringDisplayImpl

# 등장인물
- Abstraction
    - Implementor 역할의 메소드를 사용해서 기본적인 기능만 기술되어 있는 클래스
- RefinedAbstraction
    기능을 추가
- Implementor
    - Abstraction의 인터페이스(API)를 구현하기 위한 메소드를 규정
- ConcreteImplementor
- ⇒ impl 필드가 중개하고 있다.

# 독자의 사고를 넓히기 위한 힌트
- 분리해 두면 확장이 편해진다.
    - 즉, 독립적으로 확장할 수 있다.
    - e.g.) 어떤 프로그램에서 각 운영체제 공통의 인터페이스(API)를 Implementor로, ConcreteImplementor는 윈도우판, 매킨토시판, 유닉스판으로 구현
- 상속은 견고한 연결이고 위임은 느슨한 연결이다.
    - 상속 : 소스 코드를 고쳐 쓰지 않는 한 바꿀 수 없다.
    - 위임 : Display 클래스 내에서 위임이 사용되고 있다. 
        - impl 필드 → 인수로 전달되어 온 것과 연결되고 있다.

# 관련 패턴
- Template Method
    - 이 패턴에서는 구현 클래스 계층을 이용
- Abstract Factory
    - ConcreteImplemetor 역할을 적절히 구축하기 위해
- Adapter
    - Adapter 패턴도 기능은 비슷하지만 인터페이스(API)가 다른 클래스를 결합시키는 패턴이다.

# ⇒ 두 종류의 클래스 계층을 분리해서 클래스의 확장을 쉽게 예측 가능.
