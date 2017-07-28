/**
 * 6.1 상속을 알아야 유연한 설게를 할 수 있다
 *
 * 6-2.
 */

package com.java.tech.ch06;

public class DoctorValue extends PersonValue {
    public DoctorValue() {
        // Called PersonValue() implicitly.
//        super();  // test

//        /* test
        System.out.println("DoctorValue()");
        System.out.println("\tPersonValue.age : " + age);
        System.out.println("\tPersonValue.name : " + name);
//        */

        age = 30;
        name = "Mr. Kim";
    }
}
