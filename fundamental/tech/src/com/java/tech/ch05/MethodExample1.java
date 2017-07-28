/**
 * 5.2 클래스를 구성하는 메소드와 생성자, 그리고 속성
 *
 * 5-3.
 *  - $ javac com/java/tech/ch05/MethodExample1.java
 *  - $ java com/java/tech/ch05/MethodExample1
 */

package com.java.tech.ch05;

public class MethodExample1 {
    public MethodExample1() {

    }

    public static void main(String[] args) {
        String firstName = "Benjamin";
        String lastName = "Kim";

        MethodExample1 example1 = new MethodExample1();
        String fullName = example1.merge(firstName, lastName);
        int nameLength = example1.getLength(fullName);

        System.out.println("Full name = " + fullName + ", Length = " + nameLength);
    }

    public int getLength(String str) {
        if (str == null || "".equals(str)) {
            return 0;
        }

        return str.length();
    }

    public String merge(String str1, String str2) {
        return str1 + " " + str2;
    }
}
