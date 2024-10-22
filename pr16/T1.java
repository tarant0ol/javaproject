package pr16;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class T1 extends JFrame {
    JTextArea jta = new JTextArea(3, 20);
    Font fnt1 = new Font("Times new Roman", Font.BOLD, 20);
    Font fnt2 = new Font("MS sans Serif", Font.BOLD, 20);
    Font fnt3 = new Font("Courier New", Font.BOLD, 20);

    Color red = new Color(255, 0, 0);
    Color green = new Color(0, 255, 0);
    Color blue = new Color(0, 0, 255);
    MenuBar mb = new MenuBar();
    Menu menu = new Menu("Settings");
    Menu submenu1 = new Menu("Font");
    MenuItem i1 = new MenuItem("Times new Roman");
    MenuItem i2 = new MenuItem("MS sans Serif");
    MenuItem i3 = new MenuItem("Courier New");

    Menu submenu2 = new Menu("Color");
    MenuItem i4 = new MenuItem("Red");
    MenuItem i5 = new MenuItem("Green");
    MenuItem i6 = new MenuItem("Blue");




    public T1(){
        super("T1");
        setLayout(new FlowLayout());
        setSize(400, 400);
        setLocationRelativeTo(null);
        add(jta);
        jta.setFont(jta.getFont().deriveFont(Font.BOLD, 20));
        setMenuBar(mb);
        mb.add(menu);
        menu.add(submenu1); menu.add(submenu2);
        submenu1.add(i1); submenu1.add(i2); submenu1.add(i3);
        submenu2.add(i4); submenu2.add(i5); submenu2.add(i6);

        i1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jta.setFont(fnt1);
            }
        });
        i2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jta.setFont(fnt2);
            }
        });
        i3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jta.setFont(fnt3);
            }
        });

        i4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jta.setForeground(red);
            }
        });
        i5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jta.setForeground(green);
            }
        });
        i6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jta.setForeground(blue);
            }
        });
        setVisible(true);
    }

    public static void main(String[] args) {
        T1 t = new T1();
    }
}
