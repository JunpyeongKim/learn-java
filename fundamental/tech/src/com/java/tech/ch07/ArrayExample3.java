package com.java.tech.ch07;

import java.util.Date;

/**
 * 7.1 배열로 다수의 객체 관리하기
 *  - 7.1.? 배열의 형 변환
 *
 *  7-3.
 *      $ javac com/java/tech/ch07/ArrayExample3.java
 *      $ java com/java/tech/ch07/ArrayExample3
 */
public class ArrayExample3 {
    private Object[] array = new Object[6];

    public static void main(String[] args) {
        ArrayExample3 example = new ArrayExample3();
        example.init();
        example.printMember();
    }

    public void init() {
        array[0] = new String("My name is Benjamin Kim");   // upcasting into Object
        array[1] = new Integer(32);   // upcasting into Object
        array[2] = 12;   // upcasting into Object
        array[3] = 1102.5F;   // upcasting into Object
        array[4] = 3.141592653589793238462643383279D;   // upcasting into Object
        array[5] = new Date();   // upcasting into Object
    }

    public void printMember() {
        if (array == null || array.length == 0) {
            System.out.println("Empty array");
            return;
        }

        for (int i = 0; i < array.length; i++) {
            Object obj = array[i];

            if (obj instanceof String) {
                System.out.println("String type : " + (String) obj);   // downcasting
            } else if (obj instanceof Long) {
                System.out.println("Long type : " + (Long) obj);   // downcasting
            } else if (obj instanceof Integer) {
                System.out.println("Integer type : " + (Integer) obj);   // downcasting
            } else if (obj instanceof Double) {
                System.out.println("Double type : " + (Double) obj);   // downcasting
            } else if (obj instanceof Float) {
                System.out.println("Float type : " + (Float) obj);   // downcasting
            } else if (obj instanceof Date) {
                System.out.println("Date type : " + (Date) obj);   // downcasting
            } else {
                System.out.println("Undefined type");
            }
        }
    }
}
