10.Strategy - 알고리즘을 모두 바꾸기
===
- 알고리즘을 전부 교체해서 수정하기 쉽도록 하는 패턴


# 알고리즘(전략, 작전, 방책)을 빈틈없이 교체해서 같은 문제를 다른 방법으로도 쉽게 해결할 수 있도록 도와주는 패턴

# 예제 프로그램
- ‘가위바위보’ 프로그램
- Hand
    - 주먹은 0, 가위는 1, 보는 2
    - getHand() : Singleton 패턴
    - 다른 클래스(Player, WinningStrategy, ProbStrategy)로부터 사용되지만 Strategy 패턴의 역할에는 포함되지 않는다.
- Strategy
    - study() : 직전에 낸 손으로 이겼는지, 졌는지를 학습하기 위한 메소드
- ProbStrategy
    - history : 과거의 승패를 반영한 확률계산을 위한 표
- Player
    - 이름 & 전략
    - nextHand() : 자신이 해야 할 처리를 Strategy에게 맡기고 있는 즉, 위임을 하고 있다.
- Main
    - 10,000 번 대전

# 등장 인물
- Strategy
    - 인터페이스(API) 결정
- ConcreteStrategy
    - 인터페이스(API) 구현
- Context
    - Strategy를 이용


# 독자의 사고를 넓히기 위한 힌트
- 일부러 Strategy 역할을 만들 필요가 있을까?
    - 의식적으로 분리해서 알고리즘의 인터페이스(API) 부분만을 규정하고 위임에 의해서 알고리즘을 이용하자
        - → 위임이라는 느슨한 연결을 사용
- 실행 중에 교체도 가능
    - 동작 중에 ConcreteStrategy 역할의 클래스를 교체 가능하다.
    - e.g., 
        - SlowButLessMemoryStrategy vs. FastButMoreMemoryStrategy
    - 다른 쪽 알고리즘의 ‘검산'에도 이용 가능
        - 버그가 있을지도 모르는 고속의 알고리즘 vs. 저속이지만 확실한 계산을 실행하는알고리즘

# 관련 패턴
- Flyweight 
    - ConcreteStrategy 를 복수의 장소에서 공유 가능
- Abstract Factory
    - 구체적인 공장, 부품, 제품 모두 교체 가능
- State
    - Strategy & State 둘 다 위임하는 곳을 교환하는 패턴
    - Strategy : 교체 가능하지만 필요하지 않으면 교체하지 않아도 된다.
    - State : 상태가 변화할 때마다 위임하는 곳의 클래스가 반드시 교체된다.

# ⇒ 알고리즘의 동적인 교체가 가능하게 되었다.
