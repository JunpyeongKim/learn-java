/**
 * Knowhow : 메모리 사용량을 줄이기 위한 StringBuffer 클래스
 *
 * 6-28.
 *  - $ javac com/java/tech/ch06/modifier/StringExample.java
 *  - $ java com/java/tech/ch06/modifier/StringExample
 */

package com.java.tech.ch06;

public class StringExample {
    public static void main(String[] args) {
        StringExample strExam = new StringExample();
        System.out.println(strExam.getDescription());
    }

    // 단점 : JVM 메모리에 많은 양의 String 객체가 생성된다
    public String getDescription() {
        String rt = "Java ";
        rt += "is ";
        rt += "a ";
        rt += "programming ";
        rt += "language ";
        rt += "originally ";
        rt += "developed ";
        rt += "by ";
        rt += "James ";
        rt += "Gosling ";
        rt += "at ";
        rt += "Sun ";
        rt += "Microsystems";

        return rt;
    }
}
