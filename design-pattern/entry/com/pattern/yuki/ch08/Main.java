package com.pattern.yuki.ch08;


import com.pattern.yuki.ch08.factory.Factory;
import com.pattern.yuki.ch08.factory.Link;
import com.pattern.yuki.ch08.factory.Page;
import com.pattern.yuki.ch08.factory.Tray;

public class Main {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java Main class.name.of.ConcreteFactory");
            System.out.println("Example1: java Main com.pattern.yuki.ch08.listfactory.ListFactory");
            System.out.println("Example2: java Main com.pattern.yuki.ch08.tablefactory.TableFactory");
            System.exit(0);
        }

        Factory factory = Factory.getFactory(args[0]);

        Link joins = factory.createLink("Joins", "http://www.joins.com/");
        Link chosun = factory.createLink("Chosun", "http://www.chosun.com");

        Link us_yahoo = factory.createLink("Yahoo!", "http://www.yahoo.com");
        Link kr_yahoo = factory.createLink("Yahoo!Korea", "http://www.yahoo.co.kr");
        Link exit = factory.createLink("Excite", "http://www.excite.com");
        Link google = factory.createLink("Google", "http://www.google.com");

        Tray traynews = factory.createTray("News");
        traynews.add(joins);
        traynews.add(chosun);

        Tray trayyahoo = factory.createTray("Yahoo!");
        trayyahoo.add(us_yahoo);
        trayyahoo.add(kr_yahoo);

        Tray traysearch = factory.createTray("Search Engine");
        traysearch.add(trayyahoo);
        traysearch.add(exit);
        traysearch.add(google);

        Page page = factory.createPage("LinkPage", "MyCompany");
        page.add(traynews);
        page.add(traysearch);

        page.output();
    }
}
