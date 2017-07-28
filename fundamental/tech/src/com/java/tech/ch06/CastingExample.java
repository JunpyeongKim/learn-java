/**
 * 6.4 객체 형 변환하기
 *
 * 6-10.
 *  - $ javac com/java/tech/ch06/CastingExample.java
 *  - $ java com/java/tech/ch06/CastingExample
 */

package com.java.tech.ch06;

public class CastingExample {
    public static void main(String[] args) {
        CastingExample castingExam = new CastingExample();
        String str = new String("String");
        double d = 3.24D;
        int i = 1;
        long l = 324L;
        float f = 3.14F;

        System.out.println(castingExam.getType(str));
        System.out.println(castingExam.getType(d));
        System.out.println(castingExam.getType(i));
        System.out.println(castingExam.getType(l));
        System.out.println(castingExam.getType(f));
    }

    public String getType(Object obj) {
        String rt = null;

        if (obj instanceof String) {
            rt = "String object";
        } else if (obj instanceof Double) {
            rt = "Double object";
        } else if (obj instanceof Integer) {
            rt = "Integer object";
        } else if (obj instanceof Long) {
            rt = "Long object";
        } else {
            rt = "Unknown object";
        }

        return rt;
    }
}
