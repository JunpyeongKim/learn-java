/**
 * 6.5 제어자로 특별한 의미 부여하기
 *
 * 6-16.
 *  - $ javac com/java/tech/ch06/modifier/StaticTester.java
 *  - $ java com/java/tech/ch06/modifier/StaticTester
 */

package com.java.tech.ch06;

public class StaticTester {
    public static void main(String[] args) {
        System.out.println("RT_SUCCESS is [" + StaticExample.RT_SUCCESS + "]");
        System.out.println("RT_ERROR is [" + StaticExample.RT_ERROR + "]");
        System.out.println("ERR_MSG is [" + StaticExample.ERR_MSG + "]");
        System.out.println("Current Date is [" + StaticExample.getCurrentTime() + "]");
    }
}
