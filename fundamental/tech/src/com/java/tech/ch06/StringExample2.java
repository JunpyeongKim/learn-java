/**
 * Knowhow : 메모리 사용량을 줄이기 위한 StringBuffer 클래스
 *
 * 6-28 Modified.
 *  - $ javac com/java/tech/ch06/modifier/StringExample2.java
 *  - $ java com/java/tech/ch06/modifier/StringExample2
 */

package com.java.tech.ch06;

public class StringExample2 {
    public static void main(String[] args) {
        StringExample2 strExam = new StringExample2();
        System.out.println(strExam.getDescription());

        long beginTime = System.currentTimeMillis();
        String rt = "";

        for (int i = 0; i < 10000; i++) {
            rt += strExam.getDescription();
        }

        System.out.println("Exec Time = " + (System.currentTimeMillis() - beginTime) + "ms, size = " + rt.length());    // 5462ms
    }

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
        rt += "Microsystems ";

        return rt;
    }
}
