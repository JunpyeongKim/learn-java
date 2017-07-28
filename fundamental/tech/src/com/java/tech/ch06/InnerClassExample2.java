/**
 * 6.8 클래스 안의 클래스 선언하기
 *
 * 6-25.
 *  - $ javac com/java/tech/ch06/InnerClassExample2.java
 *  - $ java com/java/tech/ch06/InnerClassExample2
 *
 * [OuterClass]$[InnerClass].class
 */

package com.java.tech.ch06;

public class InnerClassExample2 {
    public static void main(String[] args) {
        InnerClassExample2.InnerClass inner= new InnerClassExample2.InnerClass();

        System.out.println("keyword : " + InnerClass.keyword);
        inner.printInfo();
        InnerClass.printName();
    }

    // Static Inner Class --> [OuterClass]$[InnerClass].class
    static class InnerClass {
        static String keyword = "STATIC INNER CLASS";

        public void printInfo() {
            System.out.println("You called printInfo method");
        }

        public static void printName() {
            System.out.println("You called printName method");
        }
    }
}
