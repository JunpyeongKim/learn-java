/**
 * 6.1 상속을 알아야 유연한 설게를 할 수 있다
 *
 * 6-4.
 */

package com.java.tech.ch06;

public class PatientValue extends PersonValue {
    public PatientValue() {
        // Called PersonValue() implicitly.
//        super();    // test

        //        /* test
        System.out.println("PatientValue()");
        System.out.println("\tPersonValue.age : " + age);
        System.out.println("\tPersonValue.name : " + name);
//        */

        age = 64;
        name = "Ms. Park";
    }
}
