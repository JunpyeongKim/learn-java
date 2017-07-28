package com.java.tech.ch08;

/**
 * 8.4 throws 와 throw 키워드로 예외 던지기
 *
 * 8-4.
 *  - $ javac com/java/tech/ch08/SampleException4.java
 *  - $ java com/java/tech/ch08/SampleException4
 */
public class SampleException4 {
    public static void main(String[] arg) {
        SampleException4 sample = new SampleException4();
        String phoneNumber = "0101234567";

        try {
            String[] array = sample.strSplit(phoneNumber, 11);

            for (String item : array) {
                System.out.println(item);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String[] strSplit(String str, int arraySize) throws Exception {
        if (str == null || "".equals(str)) {
            throw new Exception("Null Parameter");
        }

        if (arraySize == 0) {
            throw new ArithmeticException("Can't split with 0");
        }

        if (str.length() < arraySize) {
            throw new IllegalArgumentException("arraySize is larger than str length");
        }

        int unitSize = str.length() / arraySize;
        String[] rt = new String[arraySize];

        int idx = 0;
        for (int i = 0; i < arraySize; i++) {
            rt[i] = str.substring(idx, idx + unitSize);
            idx += unitSize;
        }

        return rt;
    }
}
