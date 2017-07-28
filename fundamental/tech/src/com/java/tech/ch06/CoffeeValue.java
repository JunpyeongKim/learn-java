/**
 * 6.3 super 와 this 키워드를 사용해 명시적으로 객체 지칭하기
 *
 * 6-8.
 *  - $ javac com/java/tech/ch06/CoffeeValue.java
 *  - $ java com/java/tech/ch06/CoffeeValue
 */

package com.java.tech.ch06;

public class CoffeeValue {
    protected int capacity;
    protected String coffeeName;

    public CoffeeValue(String name, int size) {
        capacity = size;
        coffeeName = name;
    }

    public String getInfo() {
        return "Capacity : " + capacity + "ml, " + "CoffeeName : " + coffeeName;
    }

    public static void main(String[] args) {
        CoffeeValue order1 = new CoffeeValue("Americano", 360);
        CoffeeValue order2 = new CoffeeValue("Cafe Latte", 500);
        CoffeeValue order3 = new CoffeeValue("Cafe Mocha", 200);

        System.out.println(System.identityHashCode(order1) + ", " + order1.getInfo());
        System.out.println(System.identityHashCode(order2) + ", " + order2.getInfo());
        System.out.println(System.identityHashCode(order3) + ", " + order3.getInfo());
    }
}
