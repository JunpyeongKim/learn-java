package com.java.tech.ch07;

import java.util.HashSet;
import java.util.Random;

/**
 * 7.3 자바에는 컬렉션이라는 편리한 것이 있다 2
 *  - 7.3.2 HashSet 구현 클래스
 *
 *  7-7. HashSetExample1.java
 */
public class HashSetExample1 {
    private int count = 0;
    private Random random = new Random();
    private HashSet<Integer> set = new HashSet<Integer>();

    public static void main(String[] args) {
        HashSetExample1 example = new HashSetExample1();
        example.init();
        example.execute();
    }

    public void init() {
        for (int i = 0; i < 10; i++) {
            set.add(random.nextInt(10));
        }

        printStatus(set);
    }

    public void execute() {
        HashSet<Integer> setObj = new HashSet<Integer>();

        for (int i = 0; i < 10; i++) {
            setObj.add(random.nextInt(5));
        }
        printStatus(setObj);

        set.addAll(setObj);
        printStatus(set);
    }

    public void printStatus(HashSet<Integer> hashSet) {
        if (hashSet == null || hashSet.size() == 0) {
            System.out.println("Object is null or size is zero");
            return;
        }

        count++;

        Integer[] array = hashSet.toArray(new Integer[hashSet.size()]);
        System.out.print("count : " + count + ", ");
        for (Integer item : array) {
            System.out.print("[" + item + "]");
        }
        System.out.print("\n");
    }
}
