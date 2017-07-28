package com.java.tech.ch07;

import java.util.Random;

/**
 * Knowhow
 *  - 난수를 만들어주는 Random 클래스
 *
 * Random
 *  - 일정한 패턴을 가지는 허위 난수(Pseudo random number) 제공
 *  - seed or not
 *
 * 7-4.
 *  - $ javac com/java/tech/ch07/RandomExample.java
 *  - $ java com/java/tech/ch07/RandomExample
 */
public class RandomExample {
    private final int randomRange = 10;
    private int loopCount = 1000000;
    private int[] randomTable = new int[randomRange];   // random number 발생 횟수 기록
    private Random random = new Random(2);

    public static void main(String[] args) {
        RandomExample example = new RandomExample();
        example.init();
        example.generate();
        example.printStatus();
    }

    public void init() {
        for (int i = 0; i < randomTable.length; i++) {
            randomTable[i] = 0;
        }
    }

    public void generate() {
        for (int i = 0; i < loopCount; i++) {
            int randomVlu = random.nextInt(randomRange);
            randomTable[randomVlu]++;
        }
    }

    public void printStatus() {
        for (int i = 0; i < randomTable.length; i++) {
            System.out.println("Random value(" + i + ") = " + randomTable[i]);
        }
    }
}
