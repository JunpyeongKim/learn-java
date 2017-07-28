/**
 * 6.1 상속을 알아야 유연한 설게를 할 수 있다
 *
 * 6-3.
 */

package com.java.tech.ch06;

public class NurseValue extends PersonValue {
    public NurseValue() {
        // Called PersonValue() implicitly.
//        super();    // test

//        /* test
        System.out.println("NurseValue()");
        System.out.println("\tPersonValue.age : " + age);
        System.out.println("\tPersonValue.name : " + name);
//        */

        age = 45;
        name = "Mr. Ahn";
    }
}
