/**
 * 5.2 클래스를 구성하는 메소드와 생성자, 그리고 속성
 *
 * 5-2.
 *  - $ javac com/java/tech/ch05/ConstructorLauncher.java
 *  - $ java com/java/tech/ch05/ConstructorLauncher
 */

package com.java.tech.ch05;

public class ConstructorLauncher {
    public static void main(String[] args) {
        // new --> JVM Heap
        ConstructorExample example1 = new ConstructorExample();
        ConstructorExample example2 = new ConstructorExample("Second");

        /*
        public static int identityHashCode(Object x)
        - http://docs.oracle.com/javase/8/docs/api/java/lang/System.html#identityHashCode-java.lang.Object-
        - Returns the same hash code for the given object as would be returned by the default method hashCode(),
          whether or not the given object's class overrides hashCode().
          The hash code for the null reference is zero.
        */
        System.out.println("System.identityHashCode(example1) = " + System.identityHashCode(example1));
        System.out.println("System.identityHashCode(example2) = " + System.identityHashCode(example2));

//        /* test
        System.out.println("example1.hashCode() = " + example1.hashCode());
        System.out.println("example2.hashCode() = " + example2.hashCode());
//        */
    }
}
