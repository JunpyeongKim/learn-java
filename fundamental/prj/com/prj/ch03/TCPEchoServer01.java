/**
 * 3.1 한번에 하나의 클라이언트 접속을 허용하는 서버와 클라이언트를 구현
 *
 * $ javac com/prj/ch03/TCPEchoServer01.java
 * $ java com/prj/ch03/TCPEchoServer01 3000
 *
 */

package com.prj.ch03;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.ServerSocket;

public class TCPEchoServer01 {
    private ServerSocket server = null;

    public TCPEchoServer01(int port) {
        try {
            server = new ServerSocket(port);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    public void process() {
        while (true) {
            try {
                Socket con = server.accept();
                BufferedInputStream bis = new BufferedInputStream(con.getInputStream());
                BufferedOutputStream bos = new BufferedOutputStream(con.getOutputStream());

                String str = "";
                byte[] buf = new byte[256];
                int len = 0;

                while ((len = bis.read(buf, 0, buf.length)) != -1) {
                    str = str + new String(buf, 0, len);
                    bos.write(buf, 0, len);
                    bos.flush();

                    // 메시지의 끝을 알리는 문자(\n)가 있다면 더이상 데이터를 읽지 않는다.
                    if (str.indexOf("\n") != -1) {
                        break;
                    }
                }

                System.out.println("Message received: " + str);

                bos.close();
                bis.close();
                con.close();
            } catch (IOException ioe) {
                ioe.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        // port
        if (args.length != 1) {
            System.out.println("Parameter: <Port>");
            System.exit(0);
        }

        int port = Integer.parseInt(args[0]);

        TCPEchoServer01 server = new TCPEchoServer01(port);
        server.process();
    }
}
