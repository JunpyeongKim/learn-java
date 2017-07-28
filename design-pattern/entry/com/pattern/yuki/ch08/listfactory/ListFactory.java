package com.pattern.yuki.ch08.listfactory;


import com.pattern.yuki.ch08.factory.Factory;
import com.pattern.yuki.ch08.factory.Link;
import com.pattern.yuki.ch08.factory.Page;
import com.pattern.yuki.ch08.factory.Tray;

public class ListFactory extends Factory {
    @Override
    public Link createLink(String caption, String url) {
        return new ListLink(caption, url);
    }

    @Override
    public Tray createTray(String caption) {
        return new ListTray(caption);
    }

    @Override
    public Page createPage(String title, String author) {
        return new ListPage(title, author);
    }
}
