/**
 * 6.5 제어자로 특별한 의미 부여하기
 *
 * 6-12.
 *  - $ javac com/java/tech/ch06/ModifierTester.java
 *  - $ java com/java/tech/ch06/ModifierTester
 */

package com.java.tech.ch06;

public class ModifierTester {
    public static void main(String[] args) {
        ModifierExample example = new ModifierExample();

        example.printClassId();

        int hashcode = example.uniqueClassId;
        System.out.println("Double  check. HashCode : " + hashcode);
    }
}
