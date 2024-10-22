package pr16.T2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class T2 extends JFrame {
    JLabel l1 = new JLabel("Service:");
    JLabel l2 = new JLabel("Username:");
    JLabel l3 = new JLabel("Password:");

    JTextField jtf1 = new JTextField(20);
    JTextField jtf2 = new JTextField(20);
    JPasswordField jtf3 = new JPasswordField(20);

    JButton submit = new JButton("Submit");



    public T2(){
        super("T2");
        SpringLayout spr = new SpringLayout();
        Container contentPane = getContentPane();
        setLayout(spr);
        setSize(400, 400);
        setLocationRelativeTo(null);

        add(l1); add(jtf1); add(l2); add(jtf2); add(l3); add(jtf3);
        spr.putConstraint(SpringLayout.NORTH, l1,10, SpringLayout.NORTH, contentPane);
        spr.putConstraint(SpringLayout.WEST, l1, 10, SpringLayout.WEST, contentPane);
        spr.putConstraint(SpringLayout.NORTH, jtf1, 10, SpringLayout.NORTH, contentPane);
        spr.putConstraint(SpringLayout.WEST, jtf1, 24, SpringLayout.EAST, l1);

        spr.putConstraint(SpringLayout.NORTH, l2,10, SpringLayout.SOUTH, l1);
        spr.putConstraint(SpringLayout.WEST, l2, 10, SpringLayout.WEST, contentPane);
        spr.putConstraint(SpringLayout.NORTH, jtf2, 10, SpringLayout.SOUTH, jtf1);
        spr.putConstraint(SpringLayout.WEST, jtf2, 10, SpringLayout.EAST, l2);

        spr.putConstraint(SpringLayout.NORTH, l3, 10, SpringLayout.SOUTH, l2);
        spr.putConstraint(SpringLayout.WEST, l3, 10, SpringLayout.WEST, contentPane);
        spr.putConstraint(SpringLayout.WEST, jtf3,13, SpringLayout.EAST, l3);
        spr.putConstraint(SpringLayout.NORTH, jtf3, 10, SpringLayout.SOUTH, jtf2);

        add(submit);
        spr.putConstraint(SpringLayout.NORTH, submit, 20, SpringLayout.SOUTH, l3);
        spr.putConstraint(SpringLayout.WEST, submit, 10, SpringLayout.WEST, contentPane);

        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s1 = jtf1.getText().trim();
                String s2 = jtf2.getText().trim();
                String s3 = jtf3.getText().trim();

                try{
                    Boolean access = false;
                    File file = new File("src/pr16/T2/passwords");
                    Scanner scanner = new Scanner(file);
                    while (scanner.hasNextLine()) {
                        String[] strings = scanner.nextLine().split(", ");
                        if (strings[0].trim().equals(s1) && strings[1].trim().equals(s2) && strings[2].trim().equals(s3)) {
                            JOptionPane.showMessageDialog(null, "Access granted");
                            access = true;
                        }
                    }
                    if (!access) {
                        JOptionPane.showMessageDialog(null, "Access denied");
                        jtf3.setText("");
                    }
                } catch (FileNotFoundException ex) {
                    JOptionPane.showMessageDialog(null, "something went wrong");
                }
            }
        });

        setVisible(true);
    }

    public static void main(String[] args){
        T2 t = new T2();
    }
}
