/**
 * 2.2 메모장의 인터페이스를 AWT 로 구현
 *
 * $ javac com/designimpl/ch02/Notepad02.java
 * $ java com/designimpl/ch02/Notepad02
 *
 * Bug : Mac 에서 메뉴 표시 및 동작 확인 안됨
 *
 * - Ubuntu에서 ActionListener 테스트 필요
 *
 */

package com.prj.ch02;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class NoteActionListener02 implements ActionListener {
    private Notepad02 frm = null;
    private String cmd = null;

    public NoteActionListener02(Notepad02 frm) {
        this.frm = frm;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        cmd = e.getActionCommand();

        System.out.println("actionPerformed(" + cmd + ")");

        if (cmd.equals("종료")) {
            frm.dispose();
            System.exit(0);
        } else {
            frm.newFile();
        }
    }
}
