/**
 * 5.2 클래스를 구성하는 메소드와 생성자, 그리고 속성
 *
 * 5-1.
 *  - 클래스에 생성자를 정의하지 않는다면 자바 컴파일러는 기본 형태의 Constructor 를 자동으로 생성
 *      - *.class 에서 확인 가능
 */

package com.java.tech.ch05;

public class ConstructorExample {
    public ConstructorExample() {
        System.out.println("First constructor is called");
    }

    public ConstructorExample(String str) {
        System.out.println("Second constructor is called with parameter : " + str);
    }

//    /* test
    @Override
    public int hashCode() {
        int h = super.hashCode();
        System.out.println("\tObject.hashCode() = " + h);
        return h % 2;
    }
//    */
}
