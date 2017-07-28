/**
 * 6.5 제어자로 특별한 의미 부여하기
 *
 * 6-15.
 */

package com.java.tech.ch06;

import java.util.Date;

public class StaticExample {
    public final static int RT_SUCCESS;
    public final static int RT_ERROR;
    public final static String ERR_MSG;

    static {
        RT_SUCCESS = 0;
        RT_ERROR = -1;
        ERR_MSG = "Found error";
    }

    public static String getCurrentTime() {
        Date date = new Date();
        return date.toString();
    }
}
