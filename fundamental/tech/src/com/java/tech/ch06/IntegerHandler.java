/**
 * 6.6 클래스를 디자인하는 방법 1 : 추상 클래스
 *
 * 6-19.
 *  - $ javac com/java/tech/ch06/IntegerHandler.java
 *  - $ java com/java/tech/ch06/IntegerHandler
 */

package com.java.tech.ch06;

public class IntegerHandler extends AbstractHandler {
    public static void main(String[] args) {
        IntegerHandler intHandler = new IntegerHandler();
        System.out.println(intHandler.getRangeInfo());
    }

    @Override
    public String getRangeInfo() {
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;

        String rt = "FROM : " + min + ", TO : " + max;
        return rt;
    }
}
