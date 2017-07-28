/**
 * 6.5 제어자로 특별한 의미 부여하기
 *
 * 6-14.
 */

package com.java.tech.ch06;

public final class FinalExample {   // Inheritance-impossible
    public final String FINAL_VALUE = "TEST";   // assignment-impossible

    public FinalExample() {

    }

    public final String getInfo() { // overriding-impossible
        return "Constants FINAL_VALUE is : " + FINAL_VALUE;
    }
}
