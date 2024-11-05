package pr15;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Calculator extends JFrame {
    JTextField jtf1 = new JTextField(15);
    JTextField jtf2 = new JTextField(15);
    JButton b_plus = new JButton("+");
    JButton b_minus = new JButton("-");
    JButton b_mult = new JButton("*");
    JButton b_divide = new JButton("/");

    public Calculator() {
        super("Calculator");
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());
        setSize(200, 160);
        add(new JLabel("1 number"));
        add(jtf1);
        add(new JLabel("2 number"));
        add(jtf2);
        add(b_plus);
        add(b_minus);
        add(b_mult);
        add(b_divide);
        b_plus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Double x1 = Double.parseDouble(jtf1.getText().trim());
                    Double x2 = Double.parseDouble(jtf2.getText().trim());

                    JOptionPane.showMessageDialog(null, "Result = " + (x1 + x2));
                } catch (Exception exception) {
                    JOptionPane.showMessageDialog(null, "Something went wrong", "Alert", JOptionPane.ERROR_MESSAGE);
                }

            }
        });
        b_minus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Double x1 = Double.parseDouble(jtf1.getText().trim());
                    Double x2 = Double.parseDouble(jtf2.getText().trim());

                    JOptionPane.showMessageDialog(null, "Result = " + (x1 - x2));
                } catch (Exception exception) {
                    JOptionPane.showMessageDialog(null, "Something went wrong", "Alert", JOptionPane.ERROR_MESSAGE);
                }

            }
        });
        b_mult.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Double x1 = Double.parseDouble(jtf1.getText().trim());
                    Double x2 = Double.parseDouble(jtf2.getText().trim());

                    JOptionPane.showMessageDialog(null, "Result = " + (x1 * x2));
                } catch (Exception exception) {
                    JOptionPane.showMessageDialog(null, "Something went wrong", "Alert", JOptionPane.ERROR_MESSAGE);
                }

            }
        });
        b_divide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Double x1 = Double.parseDouble(jtf1.getText().trim());
                    Double x2 = Double.parseDouble(jtf2.getText().trim());

                    JOptionPane.showMessageDialog(null, "Result = " + (x1 / x2));
                } catch (Exception exception) {
                    JOptionPane.showMessageDialog(null, "Something went wrong", "Alert", JOptionPane.ERROR_MESSAGE);
                }

            }
        });
        setVisible(true);
        jtf1.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                if (jtf1.getText().length() >= 16) {
                    jtf1.setText(jtf1.getText().substring(0, 16));
                }
            }

            @Override
            public void keyPressed(KeyEvent e) {
                if (jtf1.getText().length() >= 16) {
                    jtf1.setText(jtf1.getText().substring(0, 16));
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                if (jtf1.getText().length() >= 16) {
                    jtf1.setText(jtf1.getText().substring(0, 16));
                }
            }
        });
        jtf2.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                if (jtf2.getText().length() >= 16) {
                    jtf2.setText(jtf2.getText().substring(0, 16));
                }
            }

            @Override
            public void keyPressed(KeyEvent e) {
                if (jtf2.getText().length() >= 16) {
                    jtf2.setText(jtf2.getText().substring(0, 16));
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                if (jtf2.getText().length() >= 16) {
                    jtf2.setText(jtf2.getText().substring(0, 16));
                }
            }
        });
    }
    public static void main(String[] args) {
        new Calculator();
    }

}
