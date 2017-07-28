/**
 * 6.7 클래스를 디자인하는 방법 2 : 인터페이스
 *
 * 6-20.
 */

package com.java.tech.ch06;

public interface GeneratorInterface {
    public static final String ID_HEADER = "UNIQUE";
    public static final String DELIMITER = "_";

    public abstract String getUniqueValue();
}
