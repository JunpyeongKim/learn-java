package com.pattern.yuki.ch06.framework;

import java.util.HashMap;

public class Manager {
    private HashMap showcase = new HashMap();

    public void register(String name, Product proto) {
        showcase.put(name, proto);
    }

    public Product create(String name) {
        Product p = (Product) showcase.get(name);

        return p.createClone();
    }
}
