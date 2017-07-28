/**
 * 2.1 파일로부터 InputStream 객체를 생성해 내용을 읽어오는 프로그램
 * - Byte InputStream 사용
 *
 * $ javac com/prj/ch02/Notepad01.java
 * $ java com/prj/ch02/Notepad01 com/prj/ch02/testfile.txt
 *
 * Bug Fix : 한글 출력 깨짐
 *  - IntelliJ --> File --> File Encoding --> EUC-KR 로 저장
 *
 */

package com.prj.ch02;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Notepad01 {
    private File file = null;
    private FileInputStream fis = null;
    private BufferedInputStream bis = null;

    public Notepad01(String filename) {
        /*
            java.io.File(String pathname)
            - Creates a new File instance by converting the given pathname string
              into an abstract pathname.
            - NullPointerException - If the pathname argument is null
            - http://docs.oracle.com/javase/8/docs/api/java/io/File.html#File-java.lang.String-
        */
        file = new File(filename);

        try {
            /*
                public java.io.FileInputStream.FileInputStream(File file)
                - Creates a FileInputStream by opening a connection to an actual file,
                  the file named by the File object file in the file system.
                - (*) FileInputStream(FileDescriptor fdObj)
                - (*) FileInputStream(String name)
                - http://docs.oracle.com/javase/8/docs/api/java/io/FileInputStream.html#FileInputStream-java.io.File-

                public java.io.BufferedInputStream.BufferedInputStream(InputStream in)
                - Creates a BufferedInputStream and saves its argument, the input stream in, for later use.
                - http://docs.oracle.com/javase/8/docs/api/java/io/BufferedInputStream.html#BufferedInputStream-java.io.InputStream-
            */
            fis = new FileInputStream(file);
            bis = new BufferedInputStream(fis);

            byte[] buf = new byte[64];
            int len = 0;

            /*
                public int read(byte[] b, int off, int len) throws IOException
                - Reads bytes from this byte-input stream into the specified byte array,
                  starting at the given offset.
                - Returns:
                    the number of bytes read,
                    or -1 if the end of the stream has been reached.
                - http://docs.oracle.com/javase/8/docs/api/java/io/BufferedInputStream.html#read-byte:A-int-int-
            */
            while((len = bis.read(buf, 0, buf.length)) != -1) {
                /*
                    public java.lang.String(byte[] bytes, int offset, int length, String charsetName)
                    - Constructs a new String by decoding the specified subarray of bytes
                      using the specified charset.
                    - http://docs.oracle.com/javase/8/docs/api/java/lang/String.html#String-byte:A-int-int-java.lang.String-
                */
                String str = new String(buf, 0, len, "EUC-KR"); // EUC-KR, KSC5601
                System.out.println(str);
                // String s = new String(str.getBytes("8859_1"), "KSC5601");
                // System.out.println(s);
            }
        } catch(IOException ioe) {  // IO Stream을 사용할때는 IOException 처리 필요
            System.out.println("Can't read from file due to the followings,");
            ioe.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Notepad01 np = new Notepad01(args[0]);
    }
}
