package com.java.tech.ch07;

import java.util.ArrayList;

/**
 * Knowhow 7.2 : NullPointerException 에러를 방지하는 세 가지 방법
 *
 *  7-13. NullableExample2.java
 */
public class NullableExample2 {
    public static void main(String[] args) {
        NullableExample2 nullExample = new NullableExample2();

        ArrayList<String> strList = nullExample.init();

        // /* Solution 3
        for (int i = 0; strList != null && i < strList.size(); i++) {
            System.out.println("member value: " + strList.get(i));
        }
        // */
    }

    public ArrayList<String> init() {
        return null;
    }
}
