5.Singleton - 인스턴스를 한 개만 만들기
===
- 왜 제한할 필요가 있는가?
    - 복수의 인스턴스가 존재하면 인스턴스들이 서로 영향을 미치고, 뜻하지 않은 버그가 발생할 가능성이 있다.
- 유일한 인스턴스는 언제 생성되는가?
    - 최초로 getInstance()를 호출했을 때, static 필드의 초기화가 이루어진다.
- 인스턴스가 하나인 경우
    - Abstract Factory
    - Builder
    - Facade
    - Prototype
