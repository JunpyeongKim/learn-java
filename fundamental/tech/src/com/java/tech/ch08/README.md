8. 예외 상황을 처리하는 기술
======================

# 8.1 프로그램 실행 중 발생하는 예외
- SampleException1.java
    - Integer.parseInt()
        - toParseInt(String s, int radix)
    - Integer.toBinaryString()
        - toHexString(), toOctalString()
    - NumberFormatException
- SampleException2.java
    - NumberFormatException 이 catch 되고 어떻게든 parseBinary() 가 수행된 것을 볼 수 있다
- 개발자 입장에서 정의된 에러
    - 1) Compile Error
    - 2) Runtime Error
- JVM 오류
    - 1) Error
        - 프로그램이 더 이상 동작할 수 없는 심각한 오류 
    - 2) Exception
        - 동작을 계속 수행할 수 있는 오류


# 8.2 try-catch-finally 구문만 알면 된다
- SampleException3.java
    - System.nanoTime() vs System.currentTimeMillis
        - 1ns * 1000000 = 1ms


# 8.3 Throwable 클래스와 계층도 이해하기
- 자바에서 제공하는 오류 관련 클래스
    - Object 
        - Throwable
            - Error
            - Exception
    - Throwable 을 상속받은 클래스만 try-catch-finally 구문을 사용 가능
- 예외 처리에 사용되는 스택
    - JVM 메모리 영역
        - Heap
        - Stack
            - Stack Frame
- (*) 예외 관련 클래스들은 대부분 자신 클래스에 새로운 메소드를 선언하는 것보다 상속받은 메소드를 그대로 사용하거나 오버라이딩해서 사용하는 것이 일반적
- RuntimeException
    - Unchecked Exception
        - RuntimeException 을 의미 (JVM 연산 / 논리 작업시 발생)
        - 예외 처리를 하지 않아도 자동으로 예외 처리가 된다
    - Checked Exception
        - 예외처리 안 할 경우 --> 컴파일 에러 
- IOException
    - 주로 JVM 외부의 원인에 의해서 발생
        - file, network
    - EOFException
    - FileNotFoundException
    - InterruptedIOException


# 8.4 throws 와 throw 키워드로 예외 던지기
- SampleException4.java
    - String.substring()
- SampleException5.java
- Exception 을 던지는 경우 반드시 메소드 선언부터 throws 키워드를 사용하여 명확하게 명시해야 한다

 
# 8.5 새로운 Exception 클래스 생성하기
- GilbutException.java
- 조건
    - 1) 반드시 Throwable 클래스를 상속
        - 실제로는 Exception 클래스를 상속받는 것이 더 바람직
    - 2) Constructor 를 모두 Overriding


# 8.6 처리해야 할 예외와 처리하지 않는 예외 구분하기
- DirCommand.java
    - SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date())
    - File.listFiles()
    - File.lastModified()
    - File.length()
    - File.isFile() | File.isDirectory()
    - File.getName()
- RuntimeException
    - try-catch / throws 로 처리해주지 않아도 컴파일 시 아무런 문제가 발생하지 않는다
- Checked Exception vs. Unchecked Exception
    - 구분하는 기준은 예외 상황에 대한 복구 가능성
    - Unchecked Exception
        - 복구 가능성이 없어서 처리하지 않아도 된다
        - Error 클래스 | RuntimeException 클래스
        - 개발자에게 어떤 에러 및 예외가 발생했는지 알려주는 로그를 남기는 방법이 유용하다


# Knowhow : 무조건적인 예외 처리는 좋은 것일까?

