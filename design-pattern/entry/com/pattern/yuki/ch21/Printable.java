package com.pattern.yuki.ch21;


public interface Printable {
    public abstract void setPrinterName(String name);
    public abstract String getPrinterName();

    public abstract void print(String string);
}
