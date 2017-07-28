package com.java.tech.ch07;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 7.3 자바에는 컬렉션이라는 편리한 것이 있다 2
 *  - 7.3.3 Key/Value 데이터 관리를 위한 Map 인터페이스
 *
 *  7-8. MapExample1.java
 */
public class MapExample1 {
    // Key: Uppercase, Value: Decimal ascii code
    private HashMap<String, Integer> asciiMap = new HashMap<String, Integer>();

    public static void main(String[] args) {
        MapExample1 example = new MapExample1();
        example.init();
        example.execute();
    }

    public void init() {
        for (int i = 65; i <= 90; i++) {
            asciiMap.put(String.valueOf((char)i), i);
        }
    }

    public void execute() {
        Set<Map.Entry<String, Integer>> entrySet = asciiMap.entrySet();
        for (Map.Entry<String, Integer> entry : entrySet) {
            System.out.print("[" + entry.getKey() + "/" + entry.getValue() + "]");
        }
        System.out.print("\n");

        System.out.println("asciiMap cotains 69 value : " + asciiMap.containsValue(69));

        System.out.println("asciiMap contains C key : " + asciiMap.containsKey("C"));

        asciiMap.remove("Z");

        Collection<Integer> values = asciiMap.values();
        for (Integer value : values) {
            System.out.print("(" + value + ")");
        }
        System.out.print("\n");

        Set<String> keySet = asciiMap.keySet();
        for (String key : keySet) {
            System.out.print("[" + asciiMap.get(key) + "]");
        }
        System.out.print("\n");
    }
}
