/**
 * 2.3 Reader & Writer 클래스 사용
 * - Character Stream 사용으로 변경
 *  - 단순 문자 입출력을 위해서는 Byte Stream보다 Character Stream이 유용
 *
 * - java.awt.FileDialog
 *
 * - Ubuntu에서 ActionListener 테스트 필요
 *
 */

package com.prj.ch02;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class NoteActionListener03 implements ActionListener {
    private Notepad03 frm = null;
    // private String cmd = null;
    private FileDialog fd = null;

    public NoteActionListener03(Notepad03 frm, FileDialog fd) {
        this.frm = frm;
        this.fd = fd;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();
        String filename = null;

        System.out.println("actionPerformed(" + cmd + ")");

        if (cmd.equals("열기")) {
            fd.setTitle("읽을 파일을 선택하세요.");
            fd.setVisible(true);

            filename = fd.getDirectory() + fd.getFile();
            frm.setTitle(filename);
            frm.loadFile(filename);
        } else if (cmd.equals("저장")) {
            fd.setTitle("저장할 파일을 선택하세요.");
            fd.setVisible(true);

            filename = fd.getDirectory() + fd.getFile();
            frm.saveFile(filename);
        } else if (cmd.equals("종료")) {
            frm.dispose();
            System.exit(0);
        } else {
            frm.newFile();
        }
    }
}
