package com.java.tech.ch07;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 7.3 자바에는 컬렉션이라는 편리한 것이 있다 2
 *  - 7.3.5 반복 처리를 위한 Iterator 와 Enumeration
 *
 *  7-10. IteratorExample1.java
 */
public class IteratorExample1 {
    // ArrayList & HashSet: NOT thread-safe
    private ArrayList<String> urlList = new ArrayList<String>();

    public static void main(String[] args) {
        IteratorExample1 example = new IteratorExample1();
        example.init();
        example.execute();
    }

    public void init() {
        urlList.add("http://www.daum.net");
        urlList.add("http://www.google.co.kr");
        urlList.add("http://www.facebook.com");
    }

    public void execute() {
        for (int i = 0; i < urlList.size(); i++) {
            System.out.println("URL : " + urlList.get(i));
        }
        System.out.println("-----------------------------");


        for (String url : urlList) {
            System.out.println("URL : " + url);
        }
        System.out.println("-----------------------------");

        // NOT thread-safe
        Iterator<String> iter = urlList.iterator();
        while (iter.hasNext()) {
            System.out.println("URL : " + iter.next());
        }
    }
}
