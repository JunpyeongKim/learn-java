package com.java.tech.ch08;

/**
 * 8.5 새로운 Exception 클래스 생성하기
 *
 * 8-6.
 *  - $ javac com/java/tech/ch08/GilbutException.java
 *  - $ java com/java/tech/ch08/GilbutException
 */
public class GilbutException extends Exception {
    public GilbutException() {
        super();
    }

    public GilbutException(String message) {
        super(message);
    }

    public GilbutException(String message, Throwable cause) {
        super(message, cause);
    }

    public GilbutException(Throwable cause) {
        super(cause);
    }
}
