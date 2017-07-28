/**
 * 5.3 속성으로 객체의 상태 표현하기
 *
 * 5-4. 생성자, 속성, 메소드를 사용하여 어떻게 클래스를 설계/구현하는지 보여주는
 *
 */

package com.java.tech.ch05;

import java.awt.Color;

public class Pencil {
    private Color color;
    private float thickness;

    public Pencil() {
        color = new Color(0, 0, 0);
        thickness = 2.0F;
    }

    public void drawLine() {
        System.out.println("------------------------");
    }

    public void drawDot() {
        System.out.println("........................");
    }
}
