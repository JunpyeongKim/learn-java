package com.pattern.yuki.ch08.tablefactory;


import com.pattern.yuki.ch08.factory.Factory;
import com.pattern.yuki.ch08.factory.Link;
import com.pattern.yuki.ch08.factory.Page;
import com.pattern.yuki.ch08.factory.Tray;

public class TableFactory extends Factory {
    @Override
    public Link createLink(String caption, String url) {
        return new TableLink(caption, url);
    }

    @Override
    public Tray createTray(String caption) {
        return new TableTray(caption);
    }

    @Override
    public Page createPage(String title, String author) {
        return new TablePage(title, author);
    }
}
