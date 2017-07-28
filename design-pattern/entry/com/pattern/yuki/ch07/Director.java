package com.pattern.yuki.ch07;


public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construct() {
        builder.makeTitle("Greeting");
        builder.makeString("Morning and afternoon");
        builder.makeItems(new String[] {
                "Good morning.",
                "Good afternoon."
        });
        builder.makeString("Night");
        builder.makeItems(new String[] {
                "Good evening.",
                "Good night.",
                "Good bye."
        });
        builder.close();
    }
}
