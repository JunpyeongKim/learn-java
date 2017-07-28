/**
 * 6.3 super 와 this 키워드를 사용해 명시적으로 객체 지칭하기
 *
 * 6-9.
 *  - $ javac com/java/tech/ch06/CoffeeLatteValue.java
 *  - $ java com/java/tech/ch06/CoffeeLatteValue
 */

package com.java.tech.ch06;

public class CoffeeLatteValue extends CoffeeValue {
    protected int capacityMilk;

    public CoffeeLatteValue(String coffeeName, int capacityTotal, int capacityMilk) {
        super(coffeeName, capacityTotal);
        this.capacityMilk = capacityMilk;
    }

    @Override
    public String getInfo() {
        return "Milk Capacity : " + this.capacityMilk + "ml";
    }

    public String getDescription() {
        String rt = super.getInfo();
        rt += "\n";
        rt += this.getInfo();

        return rt;
    }

    public static void main(String[] args) {
        CoffeeLatteValue order1 = new CoffeeLatteValue("Cafe Latte", 500, 100);
        System.out.println(order1.getDescription());
    }
}
