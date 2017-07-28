/**
 * 6.2 오버로딩과 오버라이딩 기법 구분하기
 *
 * 6-6.
 */

package com.java.tech.ch06;

import java.util.Date;

public class OverridingParent {
    public OverridingParent() {

    }

    public String getDate() {
        Date date = new Date();
        return date.toString();
    }
}
