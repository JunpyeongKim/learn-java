/**
 * Knowhow : 메모리 사용량을 줄이기 위한 StringBuffer 클래스
 *
 * 6-29 Modified.
 *  - $ javac com/java/tech/ch06/modifier/StringBufferExample2.java
 *  - $ java com/java/tech/ch06/modifier/StringBufferExample2
 */

package com.java.tech.ch06;

public class StringBufferExample2 {
    public static void main(String[] args) {
        StringBufferExample2 sbExam = new StringBufferExample2();
        System.out.println(sbExam.getDescription());

        long beginTime = System.currentTimeMillis();
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < 10000; i++) {
            sb.append(sbExam.getDescription());
        }

        System.out.println("Exec Time = " + (System.currentTimeMillis() - beginTime) + "ms");   // 24ms
    }

    public String getDescription() {
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
