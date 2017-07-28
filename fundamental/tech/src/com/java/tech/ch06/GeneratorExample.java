/**
 * 6.7 클래스를 디자인하는 방법 2 : 인터페이스
 *
 * 6-23.
 *  - $ javac com/java/tech/ch06/GeneratorExample.java
 *  - $ java com/java/tech/ch06/GeneratorExample
 */

package com.java.tech.ch06;

public class GeneratorExample {
    public static void main(String[] args) {
        ServiceGenerator svc = new ServiceGenerator();
        SystemGenerator sys = new SystemGenerator();

        String svcName = svc.getClass().getSimpleName();
        if (svc instanceof GeneratorInterface) {
            System.out.println(svcName + " is an instance of GeneratorInterface");
        } else {
            System.out.println(svcName + " is not an instance of GeneratorInterface");
        }

        if (svc instanceof ServiceGenerator) {
            System.out.println(svcName + " is an instance of ServiceGenerator");
        } else {
            System.out.println(svcName + " is not an instance of ServiceGenerator");
        }

        String sysName = sys.getClass().getSimpleName();
        if (sys instanceof GeneratorInterface) {
            System.out.println(sysName + " is an instance of GeneratorInterface");
        } else {
            System.out.println(sysName + " is not an instance of GeneratorInterface");
        }

        if (sys instanceof SystemGenerator) {
            System.out.println(sysName + " is an instance of SystemGenerator");
        } else {
            System.out.println(sysName + " is not an instance of SystemGenerator");
        }

        // Up-casting
        GeneratorInterface genIf1 = (GeneratorInterface) sys;
        GeneratorInterface genIf2 = (GeneratorInterface) svc;
    }
}
