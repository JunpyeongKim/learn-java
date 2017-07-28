package com.java.tech.ch07;

/**
 * 7.1 배열로 다수의 객체 관리하기
 *  - 7.1.? 멤버 객체 접근을 위한 index
 *
 *  배열 선언 방법 3가지
 *      1) String[] testArray = new String[N];
 *      2) String[] testArray = new String[] {"item1", "item2", "item3"};
 *      3) String[] testArray = {"item1", "item2", "item3"};
 *
 *  7-1.
 *      $ javac com/java/tech/ch07/ArrayExample1.java
 *      $ java com/java/tech/ch07/ArrayExample1
 */
public class ArrayExample1 {
    public static void main(String[] args) {
        String[] nameArray = new String[4];
        nameArray[0] = "Benjamin";
        nameArray[1] = "Hamzani";
        nameArray[2] = "lodoss";

        System.out.println("Array hashcode: " + System.identityHashCode(nameArray));
        System.out.println("Member hashcode: " + System.identityHashCode(nameArray[0]));
        System.out.println("\"Benjamin\" hashcode: " + System.identityHashCode("Benjamin"));
        System.out.println("Total length: " + nameArray.length);
        System.out.println("Object : " + nameArray[3]);
    }
}
