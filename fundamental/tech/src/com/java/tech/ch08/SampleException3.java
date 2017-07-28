package com.java.tech.ch08;

/**
 * 8.2 try-catch-finally 구문만 알면 된다
 *
 * 8-3.
 *  - $ javac com/java/tech/ch08/SampleException3.java
 *  - $ java com/java/tech/ch08/SampleException3
 */
public class SampleException3 {
    public static void main(String[] args) {
        SampleException3 sample = new SampleException3();
        String[] array = null;
        sample.printList(array);
    }

    public void printList(String[] array) {
        double beginTime = System.nanoTime();   // double 로 upcasting : 보다 정확한 값을 얻기 위해서

        try {
            for (int i = 0; i <= array.length; i++) {
                System.out.println(array[i]);
            }
        } catch (Exception e) {
            e.printStackTrace();    // NullPointerException
        } finally {
            double execTime = (System.nanoTime() - beginTime) / 1000000;
            System.out.println("Processing time : " + execTime + " ms");
        }
    }
}
