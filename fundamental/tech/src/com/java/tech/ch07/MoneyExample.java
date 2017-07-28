package com.java.tech.ch07;

/**
 * Knowhow 7.3 : ValueObject 디자인 패턴과 Get/Set 메소드
 *
 *  7-16. MoneyExample.java
 */
public class MoneyExample {
    private MoneyValue moneyVo = new MoneyValue();

    public static void main(String[] args) {
        MoneyExample example = new MoneyExample();
        example.init();
        example.add();
        example.printStatus();
    }

    public void init() {
        moneyVo.userName = "user";
        moneyVo.money = 34.44F;
    }

    public void add() {
        int balance = (int) (moneyVo.money + 1);
        moneyVo.money = (float) balance;
    }

    public void printStatus() {
        System.out.println("Current Balance = " + moneyVo.money + "$");
    }
}
