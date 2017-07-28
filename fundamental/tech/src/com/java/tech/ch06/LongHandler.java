/**
 * 6.6 클래스를 디자인하는 방법 1 : 추상 클래스
 *
 * 6-18.
 *  - $ javac com/java/tech/ch06/LongHandler.java
 *  - $ java com/java/tech/ch06/LongHandler
 */

package com.java.tech.ch06;

public class LongHandler extends AbstractHandler {
    public static void main(String[] args) {
        LongHandler longHandler = new LongHandler();
        System.out.println(longHandler.getRangeInfo());
    }

    @Override
    public String getRangeInfo() {
        long max = Long.MAX_VALUE;
        long min = Long.MIN_VALUE;

        String rt = "FROM : " + min + ", TO : " + max;
        return rt;
    }
}
