/**
 * 6.8 클래스 안의 클래스 선언하기
 *
 * 6-27.
 *  - $ javac com/java/tech/ch06/InnerClassExample4.java
 *  - $ java com/java/tech/ch06/InnerClassExample4
 *
 * [OuterClass]$[index].class
 */

package com.java.tech.ch06;

public class InnerClassExample4 {
    public static void main(String[] args) {
        InnerClassExample4 exam = new InnerClassExample4();
        System.out.println(exam.getName().toString());
    }

    public Object getName() {
        // Anonymous Class --> [OuterClass]$[index].class
        return new Object() {
            public String toString() {
                return this.getClass().getName();   // com.java.tech.ch06.InnerClassExample4$1
            }
        };
    }
}
