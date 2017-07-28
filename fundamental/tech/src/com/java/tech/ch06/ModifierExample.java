/**
 * 6.5 제어자로 특별한 의미 부여하기
 *
 * 6-11.
 */

package com.java.tech.ch06;

public class ModifierExample {
    protected int uniqueClassId;

    public ModifierExample() {
        uniqueClassId = System.identityHashCode(this);
    }

    protected void printClassId() {
        System.out.println("Hashcode of ModifierExample object : " + this.uniqueClassId);
    }
}
