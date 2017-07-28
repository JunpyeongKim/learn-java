/**
 * 3.1 한번에 하나의 클라이언트 접속을 허용하는 서버와 클라이언트를 구현
 *
 * $ javac com/prj/ch03/TCPEchoClient01.java
 * $ java com/prj/ch03/TCPEchoClient01 127.0.0.1 3000 hi
 *
 */

package com.prj.ch03;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.net.Socket;

public class TCPEchoClient01 {
    private Socket socket = null;
    private BufferedInputStream bis = null;
    private BufferedOutputStream bos = null;

    public TCPEchoClient01(String sAddress, int port) {
        try {
            socket = new Socket(sAddress, port);
            bis = new BufferedInputStream(socket.getInputStream());
            bos = new BufferedOutputStream(socket.getOutputStream());
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    public void send(byte[] buf) {
        try {
            System.out.println("Message to send: " + new String(buf));
            bos.write(buf);
            bos.flush();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    public void receive() {
        String str = "";
        byte[] echo = new byte[256];
        int len = 0;

        try {
            while((len = bis.read(echo, 0, echo.length)) != -1) {
                str = str + new String(echo, 0, len);
            }

            System.out.println("Message received: " + str);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    public void close() {
        try {
            bos.close();
            bis.close();
            socket.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    public static void main(String[] args) {
        // check: ip, port, message
        if (args.length <= 2 || args.length > 3) {
            System.out.println("Parameter: <IP> <Port> <Message>");
            System.exit(0);
        }

        String sAddress = args[0];  // ip
        int port = Integer.parseInt(args[1]);   // port
        // 메시지의 끝을 알리기 위해 \n 을 붙인다.
        byte[] buf = (args[2] + "\n").getBytes();    // message

        TCPEchoClient01 client = new TCPEchoClient01(sAddress, port);
        client.send(buf);
        client.receive();
        client.close();
    }
}
