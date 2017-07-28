package com.pattern.yuki.ch10;


public interface Strategy {
    public abstract Hand nextHand();
    public abstract void study(boolean win);
}
