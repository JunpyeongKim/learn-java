package com.pattern.yuki.ch21;


public class Main {
    public static void main(String[] args) {
        Printable p = new PrinterProxy("Alice");
        System.out.println("The name is currently " + p.getPrinterName());

        p.setPrinterName("Bob");
        System.out.println("The name is currently " + p.getPrinterName());

        p.print("Hello, World.");
    }
}
