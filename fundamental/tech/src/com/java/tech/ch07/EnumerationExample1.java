package com.java.tech.ch07;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

/**
 * 7.3 자바에는 컬렉션이라는 편리한 것이 있다 2
 *  - 7.3.5 반복 처리를 위한 Iterator 와 Enumeration (TBD)
 *
 *  7-11. EnumerationExample1.java
 */
public class EnumerationExample1 {
    private final int LENGTH = 10;
    // Vector: thread-safe
    private Vector<Integer> vector = new Vector<Integer>();
    // Hashtable: thread-safe
    private Hashtable<Integer, String> table = new Hashtable<Integer, String>();

    public static void main(String[] args) {
        EnumerationExample1 example = new EnumerationExample1();
        example.init();
        example.execute();
    }

    public void init() {
        for (int i = 0; i < LENGTH; i++) {
            vector.addElement(i);
            table.put(i, "Str" + i);
        }
    }

    public void execute() {
        // Enumeration: thread-safe
        Enumeration<Integer> eInt = vector.elements();
        while (eInt.hasMoreElements()) {
            System.out.print("[" + eInt.nextElement() + "]");
        }
        System.out.print("\n");

        // Enumeration: thread-safe
        Enumeration<String> eStr = table.elements();
        while (eStr.hasMoreElements()) {
            System.out.print("[" + eStr.nextElement() + "]");
        }
        System.out.print("\n");
    }
}
