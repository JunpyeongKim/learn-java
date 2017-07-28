/**
 * 2.2 메모장의 인터페이스를 AWT 로 구현
 *
 * $ javac com/prj/ch02/Notepad02.java
 * $ java com/prj/ch02/Notepad02
 *
 * Bug : Mac 에서 메뉴 표시 및 동작 확인 안됨
 *
 * - Ubuntu에서 ActionListener 테스트 필요
 *
 */

package com.prj.ch02;

import java.awt.*;  // java.awt.Frame, java.awt.TextArea, ...
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/*
    java.lang.Object
        java.awt.Component
            java.awt.Container
                java.awt.Window
                    java.awt.Frame
*/
public class Notepad02 extends Frame implements WindowListener {
    private TextArea ta = null;
    private NoteActionListener02 nal = null;
    private MenuBar mb = null;
    private Menu mfile = null;
    private String filename = "새파일";

    public Notepad02() {
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

        nal = new NoteActionListener02(this);

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

    public static void main(String[] args) {
        Notepad02 np = new Notepad02();

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
