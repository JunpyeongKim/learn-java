package com.java.tech.ch08;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 8.6 처리해야 할 예외와 처리하지 않는 예외 구분하기
 *
 * 8-7.
 *  - $ javac com/java/tech/ch08/DirCommand.java
 *  - $ java com/java/tech/ch08/DirCommand
 */
public class DirCommand {
    private SimpleDateFormat fmt;

    public DirCommand() {
        fmt = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
    }

    public static void main(String[] args) {
        String path = ".";
        DirCommand dir = new DirCommand();
        dir.printFileList(path);
    }

    public void printFileList(String path) {
        File file = new File(path);
        File[] childList = file.listFiles();

        for (File child : childList) {
            String fileName = "";
            long modifiedTime = child.lastModified();
            long fileSize = child.length();

            if (child.isFile()) {
                fileName = "[FILE]" + child.getName();
            } else if (child.isDirectory()) {
                fileName = "[DIR]" + child.getName();
            } else {
                fileName = child.getName();
            }

            System.out.println(fileName + ", (" + fileSize + "), " + fmt.format(new Date(modifiedTime)));
        }
    }
}
