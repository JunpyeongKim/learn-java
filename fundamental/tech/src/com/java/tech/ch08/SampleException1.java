package com.java.tech.ch08;

/**
 * 8.1 프로그램 실행 중 발생하는 예외
 *
 * 8-1.
 *  - $ javac com/java/tech/ch08/SampleException1.java
 *  - $ java com/java/tech/ch08/SampleException1 [sky | 256]
 *      - NumberFormatException
 */
public class SampleException1 {
    public static void main(String[] args) {
        if (args == null || args.length == 0) {
            System.out.println("Usage : Java SampleException [Number]");
            return;
        }

        SampleException1 tester = new SampleException1();

        String rt = tester.parseBinary(args[0]);
        System.out.println("Decimal Number : " + args[0]);
        System.out.println("Binary Number : " + rt);
    }

    public String parseBinary(String str) {
        int decimal = Integer.parseInt(str);
        String binary = Integer.toBinaryString(decimal);

        return binary;
    }
}
