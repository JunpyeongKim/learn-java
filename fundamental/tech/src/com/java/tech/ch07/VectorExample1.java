package com.java.tech.ch07;

import java.util.Vector;

/**
 * 7.2 자바에는 컬렉션이라는 편리한 것이 있다 1
 *  - 7.2.4 List 인터페이스를 구현하는 ArrayList 와 Vector 클래스
 *
 *  7-6. VectorExample1.java
 */
public class VectorExample1 {
    private int count = 0;
    private Vector<String> vector = new Vector<String>(10, 5);  // initialCapacity 10, capacityIncrement 5

    public static void main(String[] args) {
        VectorExample1 example = new VectorExample1();
        example.execute();
    }

    public void execute() {
        printStatus();

        for (int i = 0; i < 9; i++) {
            vector.addElement(String.valueOf(i));
        }
        printStatus();

        for (int i = 0; i < 4; i++) {
            vector.add(String.valueOf(i));
        }
        printStatus();

        vector.trimToSize();
        printStatus();

        vector.setSize(20);
        printStatus();

        System.out.println(vector.toString());
    }

    public void printStatus() {
        count++;
        System.out.println("[" + count + "] Capacity : " + vector.capacity() + ", Element size : " + vector.size());
    }
}
