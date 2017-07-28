/**
 * 6.1 상속을 알아야 유연한 설게를 할 수 있다
 *
 * 6-1.
 */

package com.java.tech.ch06;

public class PersonValue {
    protected int age;
    protected String name;

    public PersonValue() {
        age = 0;
        name = "Someone name";
    }

    public String getInfo() {
        String rt = new String();
        rt = "age : " + age + ", name : " + name;
        return rt;
    }
}
