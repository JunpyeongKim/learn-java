/**
 * 6.7 클래스를 디자인하는 방법 2 : 인터페이스
 *
 * 6-22.
 *  - $ javac com/java/tech/ch06/ServiceGenerator.java
 *  - $ java com/java/tech/ch06/ServiceGenerator
 */


package com.java.tech.ch06;

import java.util.UUID;  // Universal Unique ID

public class ServiceGenerator implements GeneratorInterface {
    public static void main(String[] args) {
        ServiceGenerator svcGenerator = new ServiceGenerator();
        String uniqueId = svcGenerator.getUniqueValue();

        System.out.println("Generate unique Id : " + uniqueId);
    }

    @Override
    public String getUniqueValue() {
        String rt = ServiceGenerator.ID_HEADER + UUID.randomUUID(); // UNIQUEf4021f48-4c60-4e53-b8c7-a0658e5bb2f3
        return rt;
    }
}
