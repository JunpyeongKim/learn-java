package com.java.tech.ch07;

import java.util.ArrayList;

/**
 * Knowhow 7.2 : NullPointerException 에러를 방지하는 세 가지 방법
 *
 *  7-12. NullableExample1.java
 */
public class NullableExample1 {
    public static void main(String[] args) {
        NullableExample1 nullExample = new NullableExample1();

        ArrayList<String> strList = nullExample.init();
        /* Solution 1
        if (strList == null || strList.size() <= 0)
          return;

        for (int i = 0; i < strList.size(); i++) {
          System.out.println("member value: " + strList.get(i));
        }
        // */

        // /* Solution 2
        if (strList != null && strList.size() != 0) {
            for (int i = 0; i < strList.size(); i++) {
                System.out.println("member value: " + strList.get(i));
            }
        }
        // */

        // Solution 3 --> NullableExample2.java
    }

    public ArrayList<String> init() {
        return null;
    }
}
