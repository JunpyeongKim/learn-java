package com.java.tech.ch07;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Vector;

/**
 * 7.2 자바에는 컬렉션이라는 편리한 것이 있다 1
 *  - 7.2.4 List 인터페이스를 구현하는 ArrayList 와 Vector 클래스
 *
 *  7-5. ListExample1.java
 */
public class ListExample1 {
    private final int MAX_INT = 9;
    private Random random = new Random();
    private ArrayList<Integer> arrayList = new ArrayList<Integer>();
    private Vector<Integer> vector = new Vector<Integer>();

    public static void main(String[] args) {
        ListExample1 example = new ListExample1();
        example.testArrayList();
        example.testVector();
    }

    public void testArrayList() {
        for (int i = 0; i < MAX_INT; i++) {
            arrayList.add(random.nextInt(MAX_INT));
        }

        printMember(arrayList);

        arrayList.remove(new Integer(2));
        printMember(arrayList);

        arrayList.remove(new Integer(8));
        printMember(arrayList);

        arrayList.clear();
        printMember(arrayList);
    }

    public void testVector() {
        for (int i = 0; i < MAX_INT; i++) {
            vector.add(random.nextInt(MAX_INT));
        }

        printMember(vector);

        vector.remove(new Integer(2));
        printMember(vector);

        vector.remove(new Integer(8));
        printMember(vector);

        vector.clear();
        printMember(vector);
    }

    public void printMember(List<Integer> list) {
        int totalSize = list.size();

        if (list instanceof ArrayList) {
            System.out.print("ArrayList Member (" + totalSize + ") : ");
        } else if (list instanceof Vector) {
            System.out.print("Vector Memeber (" + totalSize + ") : ");
        } else {
            System.out.print("Unknown Memeber (" + totalSize + ") : ");
        }

        for (Integer item : list) {
            System.out.print("[" + item + "]");
        }

        System.out.print("\n");
    }
}
