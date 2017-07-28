package com.java.tech.ch07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

/**
 * 7.3 자바에는 컬렉션이라는 편리한 것이 있다 2
 *  - 7.3.4 컬렉션과 관련 있는 알고리즘
 *
 *  7-9. SortExample1.java
 */
public class SortExample1 {
    private final int LENGTH = 15;
    private Random random;
    private String[] strArray;
    private ArrayList<String> strList;

    public static void main(String[] args) {
        SortExample1 example = new SortExample1();
        example.init();
        example.sort();
    }

    public void init() {
        random = new Random();
        strArray = new String[LENGTH];
        strList = new ArrayList<String>();

        for (int i = 0; i < LENGTH; i++) {
            String item = String.valueOf((char) (random.nextInt(26) + 65));
            strArray[i] = item;
            strList.add(item);
        }

        printArrayItem();
        printArrayListItem();
    }

    public void sort() {
        Arrays.sort(strArray);
        Collections.sort(strList);

        printArrayItem();
        printArrayListItem();
    }

    public void printArrayItem() {
        for (int i = 0; i < strArray.length; i++) {
            System.out.print("[" + strArray[i] + "]");
        }
        System.out.print("\n");
    }

    public void printArrayListItem() {
        for (int i = 0; i < strList.size(); i++) {
            System.out.print("(" + strList.get(i) + ")");
        }
        System.out.print("\n");
    }
}
