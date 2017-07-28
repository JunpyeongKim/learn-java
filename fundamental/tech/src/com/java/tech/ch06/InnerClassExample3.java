/**
 * 6.8 클래스 안의 클래스 선언하기
 *
 * 6-26.
 *  - $ javac com/java/tech/ch06/InnerClassExample3.java
 *  - $ java com/java/tech/ch06/InnerClassExample3
 *
 * [OuterClass]$[index][InnerClass].class
 */

package com.java.tech.ch06;

import java.util.Date;

public class InnerClassExample3 {
    public static void main(String[] args) {
        InnerClassExample3 example = new InnerClassExample3();
        example.printStatus();
    }

    public void printStatus() {
        // Local Inner Class --> [OuterClass]$[index][InnerClass].class
        class DateFormat {
            private Date date;

            public DateFormat(Date date) {
                this.date = date;
            }

            public String getDateFormat() {
                return date.toString();
            }
        }

        DateFormat format = new DateFormat(new Date());
        System.out.println("The Date : " + format.getDateFormat()); // Mon Jan 11 22:14:29 KST 2016
    }
}
