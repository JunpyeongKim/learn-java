/**
 * Knowhow : 메모리 사용량을 줄이기 위한 StringBuffer 클래스
 *
 * 6-29.
 *  - $ javac com/java/tech/ch06/modifier/StringBufferExample.java
 *  - $ java com/java/tech/ch06/modifier/StringBufferExample
 */

package com.java.tech.ch06;

public class StringBufferExample {
    public static void main(String[] args) {
        StringBufferExample sbExam = new StringBufferExample();
        System.out.println(sbExam.getDescription());
    }

    public String getDescription() {
        // Thread-safe
        // append() 실행 후 반환되는 StringBuffer 객체의 Hashcode 는 항상 동일
        StringBuffer sb = new StringBuffer("Java ");
        sb.append("is ").append("a ").append("programming ").append("language ");
        sb.append("originally ");
        sb.append("developed ");
        sb.append("by ");
        sb.append("James ").append("Gosling ");
        sb.append("at ").append("Sun ").append("Microsystems");

        return sb.toString();
    }
}
