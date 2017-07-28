package com.java.tech.ch07;

import java.util.Random;

/**
 * 7.1 배열로 다수의 객체 관리하기
 *  - 7.1.? 다차원 배열 사용법
 *
 *  7-2.
 *      $ javac com/java/tech/ch07/ArrayExample2.java
 *      $ java com/java/tech/ch07/ArrayExample2
 */
public class ArrayExample2 {
    private final int IDX_NAME = 0;
    private final int IDX_ADDRESS = 1;
    private final int IDX_GENDER = 2;

    private String[][] infoTable;
    private String[] addrArray = new String[] {
            "Kuala lumpur", "Seoul", "Roma"
    };

    private String[] genderArray = new String[] {
            "Female", "Male"
    };

    public static void main(String[] args) {
        ArrayExample2 example = new ArrayExample2();
        example.init();
        example.printInfo();
    }

    public void init() {
        Random random = new Random();
        infoTable = new String[3][3];

        for (int i = 0; i < 3; i++) {
            infoTable[i][IDX_NAME] = "Person" + i;
            infoTable[i][IDX_ADDRESS] = addrArray[random.nextInt(addrArray.length)];
            infoTable[i][IDX_GENDER] = genderArray[random.nextInt(genderArray.length)];
        }
    }

    public void printInfo() {
        if (infoTable == null) {
            System.out.println("infoTable Array is null");
            return;
        }

        for (int i = 0; i < 3; i++) {
            System.out.println(infoTable[i][IDX_NAME] + " : " + infoTable[i][IDX_ADDRESS] + " : " + infoTable[i][IDX_GENDER]);
        }
    }
}
