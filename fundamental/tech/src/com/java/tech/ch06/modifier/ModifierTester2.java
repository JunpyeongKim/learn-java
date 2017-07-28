/**
 * 6.5 제어자로 특별한 의미 부여하기
 *
 * 6-13.
 *  - $ javac com/java/tech/ch06/modifier/ModifierTester2.java
 *  - $ java com/java/tech/ch06/modifier/ModifierTester2
 */

package com.java.tech.ch06.modifier;

import com.java.tech.ch06.ModifierExample;

public class ModifierTester2 extends ModifierExample {
    public static void main(String[] args) {
        ModifierTester2 tester = new ModifierTester2();
        tester.run();
    }

    public void run() {
        this.printClassId();

        int hashcode = this.uniqueClassId;
        System.out.println("Double check. hashcode : " + hashcode);
    }
}
