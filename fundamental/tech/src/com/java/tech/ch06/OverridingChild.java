/**
 * 6.2 오버로딩과 오버라이딩 기법 구분하기
 *
 * 6-7.
 *  - $ javac com/java/tech/ch06/OverridingChild.java
 *  - $ java com/java/tech/ch06/OverridingChild
 */

package com.java.tech.ch06;

import java.util.Date;

public class OverridingChild extends OverridingParent {
    public static void main(String[] args) {
        OverridingParent parent = new OverridingParent();
        OverridingChild child = new OverridingChild();

        System.out.println("OverridingParent.getDate() = " + parent.getDate()); // Fri Jan 08 23:46:03 KST 2016
        System.out.println("OverridingChild.getDate() = " + child.getDate());   // YEAR = 2016, Month = Jan, Day = 08
    }

    @Override
    public String getDate() {
        Date date = new Date();
        String[] items = date.toString().split(" ");

        String msg = "YEAR = " + items[5];
        msg += ", Month = " + items[1];
        msg += ", Day = " + items[2];

        return msg;
    }
}
