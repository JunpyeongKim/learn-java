/**
 * 2.3 Reader & Writer 클래스 사용
 * - Character Stream 사용으로 변경
 *  - 단순 문자 입출력을 위해서는 Byte Stream보다 Character Stream이 유용
 * - java.awt.FileDialog
 *
 * $ javac com/prj/ch02/Notepad03.java
 * $ java com/prj/ch02/Notepad03
 *
 * - Ubuntu에서 ActionListener 테스트 필요
 *
 */


package com.prj.ch02;

import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.*;

/*
    java.lang.Object
        java.awt.Component
            java.awt.Container
                java.awt.Window
                    java.awt.Frame
*/
public class Notepad03 extends Frame implements WindowListener {
    private TextArea ta = null;
    private NoteActionListener03 nal = null;
    private MenuBar mb = null;
    private Menu mfile = null;
    private String filename = "새파일";
    /*
        java.awt.FileDialog
        - The FileDialog class displays a dialog window from which the user can select a file.
        - http://docs.oracle.com/javase/8/docs/api/java/awt/FileDialog.html
    */
    private FileDialog fd = null;

    public Notepad03() {
        ta = new TextArea();
        /*
            public Component java.awt.Container.add(Component comp, int index)
            - Adds the specified component to this container at the given position.
            - http://docs.oracle.com/javase/8/docs/api/java/awt/Container.html#add-java.awt.Component-int-

            public Component java.awt.Container.add(Component comp, Object constraints)
            - Adds the specified component to the end of this container.
            - http://docs.oracle.com/javase/8/docs/api/java/awt/Container.html#add-java.awt.Component-java.lang.Object-

            public static final String java.awt.BorderLayout.CENTER
            - The center layout constraint (middle of container).
            - http://docs.oracle.com/javase/8/docs/api/java/awt/BorderLayout.html#CENTER
        */
        add(ta, BorderLayout.CENTER);

        nal = new NoteActionListener03(this, fd);

        mb = new MenuBar(); // java.awt.MenuBar

        mfile = new Menu(); // java.awt.Menu
        itemAdd("새파일", mfile);
        itemAdd("열기", mfile);
        itemAdd("저장", mfile);
        itemAdd("종료", mfile);

        mb.add(mfile);

        setMenuBar(mb);
        setTitle(filename);
        addWindowListener(this);    // java.awt.Window.addWindowListener()
    }

    private void itemAdd(String title, Menu m) {
        MenuItem mi = new MenuItem(title);  // java.awt.MenuItem
        mi.addActionListener(nal);
        m.add(mi);
    }

    // Activated --> Opened / Deiconified
    // Deactivated --> Iconified
    // Closing
    // Closed ???
    @Override
    public void windowClosing(WindowEvent we) {
        System.out.println("windowClosing()");
        /*
            public void java.awt.Window.dispose()
            - Releases all of the native screen resources used by this Window, its subcomponents,
              and all of its owned children. That is, the resources for these Components will be destroyed,
              any memory they consume will be returned to the OS, and they will be marked as undisplayable.
            - http://docs.oracle.com/javase/8/docs/api/java/awt/Window.html#dispose--
        */
        dispose();
        System.exit(0);
    }

    @Override
    public void windowClosed(WindowEvent we) {
        System.out.println("windowClosed()");
    }

    @Override
    public void windowOpened(WindowEvent we) {
        System.out.println("windowOpened()");
    }

    @Override
    public void windowIconified(WindowEvent we) {
        System.out.println("windowIconified()");
    }

    @Override
    public void windowDeiconified(WindowEvent we) {
        System.out.println("windowDeiconified()");
    }

    @Override
    public void windowDeactivated(WindowEvent we) {
        System.out.println("windowDeactivated()");
    }

    @Override
    public void windowActivated(WindowEvent we) {
        System.out.println("windowActivated()");
    }

    public void newFile() {
        filename = "새파일";
        ta.setText("");
        setTitle(filename);
    }

    public void loadFile(String fn) {
        File file = new File(fn);
        FileReader fr = null;
        BufferedReader br = null;

        try {
            fr = new FileReader(file);
            br = new BufferedReader(fr);

            String str = null;

            ta.setText("");

            /*
                public String java.io.BufferedReader.readLine() throws IOException
                - Reads a line of text.
                  A line is considered to be terminated by any one of a line feed ('\n'), a carriage return ('\r'),
                  or a carriage return followed immediately by a linefeed.
                - http://docs.oracle.com/javase/8/docs/api/java/io/BufferedReader.html#readLine--
            */
            while((str = br.readLine()) != null) {
                ta.append(str + "\n");
            }

            filename = fn;
            setTitle(fn);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    public void saveFile(String fn) {
        File file = new File(fn);

        try {
            // Byte Stream ??? --> Character Stream ???
            FileOutputStream fos = new FileOutputStream(file);  // FileWriter ???
            PrintStream ps = new PrintStream(fos);  // BufferedWriter or PrintWriter ???
            ps.print(ta.getText());
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        filename = fn;
        setTitle(fn);
    }

    public static void main(String[] args) {
        Notepad03 np = new Notepad03();

        /*
            public void java.awt.Window.setSize(int width, int height)
            - Resizes this component so that it has width width and height height.
            - http://docs.oracle.com/javase/8/docs/api/java/awt/Window.html#setSize-int-int-
        */
        np.setSize(600, 450);

        /*
            public void java.awt.Window.setVisible(boolean b)
            - Shows or hides this Window depending on the value of parameter b.
            - http://docs.oracle.com/javase/8/docs/api/java/awt/Window.html#setVisible-boolean-
        */
        np.setVisible(true);
    }
}
