/**
 * 6.7 클래스를 디자인하는 방법 2 : 인터페이스
 *
 * 6-21.
 *  - $ javac com/java/tech/ch06/SystemGenerator.java
 *  - $ java com/java/tech/ch06/SystemGenerator
 */

package com.java.tech.ch06;

public class SystemGenerator implements GeneratorInterface {
    public static void main(String[] args) {
        SystemGenerator sysGenerator = new SystemGenerator();
        String uniqueId = sysGenerator.getUniqueValue();

        System.out.println("Generate unique id : " + uniqueId);
    }

    @Override
    public String getUniqueValue() {
        String rt = SystemGenerator.ID_HEADER + System.nanoTime() +             // UNIQUE175151914912134
                    SystemGenerator.DELIMITER + System.identityHashCode(this);  // _487639792
        return rt;
    }
}
