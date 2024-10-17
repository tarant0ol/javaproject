package pr15;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator_pro extends JFrame {
    Font fnt = new Font("Times new roman",Font.BOLD,20);
    JTextField jtf = new JTextField(20);
    JButton b7 = new JButton("7");
    JButton b8 = new JButton("8");
    JButton b9 = new JButton("9");
    JButton b_divide = new JButton("/");

    JButton b4 = new JButton("4");
    JButton b5 = new JButton("5");
    JButton b6 = new JButton("6");
    JButton b_mult = new JButton("*");

    JButton b1 = new JButton("1");
    JButton b2 = new JButton("2");
    JButton b3 = new JButton("3");
    JButton b_minus = new JButton("-");

    JButton b0 = new JButton("0");
    JButton b_point = new JButton(".");
    JButton b_equal = new JButton("=");
    JButton b_plus = new JButton("+");


    public Calculator_pro() {
        super("Calculator_pro");
        setLayout(null);
        setSize(320, 360);
        jtf.setFont(fnt);
        jtf.setBounds(0, 0, 320, 100); add(jtf);
        b7.setBounds(20, 120, 50, 30); add(b7);
        b8.setBounds(90, 120, 50, 30); add(b8);
        b9.setBounds(160, 120, 50, 30); add(b9);
        b_divide.setBounds(230, 120, 50, 30); add(b_divide);

        b4.setBounds(20, 170, 50, 30); add(b4);
        b5.setBounds(90, 170, 50, 30); add(b5);
        b6.setBounds(160, 170, 50, 30); add(b6);
        b_mult.setBounds(230, 170, 50, 30); add(b_mult);

        b1.setBounds(20, 220, 50, 30); add(b1);
        b2.setBounds(90, 220, 50, 30); add(b2);
        b3.setBounds(160, 220, 50, 30); add(b3);
        b_minus.setBounds(230, 220, 50, 30); add(b_minus);

        b0.setBounds(20, 270, 50, 30); add(b0);
        b_point.setBounds(90, 270, 50, 30); add(b_point);
        b_equal.setBounds(160, 270, 50, 30); add(b_equal);
        b_plus.setBounds(230, 270, 50, 30); add(b_plus);



        b7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    jtf.setText(jtf.getText()+"7");
                } catch (Exception exception) {
                    JOptionPane.showMessageDialog(null, "Something went wrong");
                }
            }
        });
        b8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    jtf.setText(jtf.getText()+"8");
                } catch (Exception exception) {
                    JOptionPane.showMessageDialog(null, "Something went wrong");
                }
            }
        });
        b9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    jtf.setText(jtf.getText()+"9");
                } catch (Exception exception) {
                    JOptionPane.showMessageDialog(null, "Something went wrong");
                }
            }
        });
        b_divide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    jtf.setText(jtf.getText()+"/");
                } catch (Exception exception) {
                    JOptionPane.showMessageDialog(null, "Something went wrong");
                }
            }
        });

        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    jtf.setText(jtf.getText()+"4");
                } catch (Exception exception) {
                    JOptionPane.showMessageDialog(null, "Something went wrong");
                }
            }
        });
        b5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    jtf.setText(jtf.getText()+"5");
                } catch (Exception exception) {
                    JOptionPane.showMessageDialog(null, "Something went wrong");
                }
            }
        });
        b6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    jtf.setText(jtf.getText()+"6");
                } catch (Exception exception) {
                    JOptionPane.showMessageDialog(null, "Something went wrong");
                }
            }
        });
        b_mult.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    jtf.setText(jtf.getText()+"*");
                } catch (Exception exception) {
                    JOptionPane.showMessageDialog(null, "Something went wrong");
                }
            }
        });

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    jtf.setText(jtf.getText()+"1");
                } catch (Exception exception) {
                    JOptionPane.showMessageDialog(null, "Something went wrong");
                }
            }
        });
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    jtf.setText(jtf.getText()+"2");
                } catch (Exception exception) {
                    JOptionPane.showMessageDialog(null, "Something went wrong");
                }
            }
        });
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    jtf.setText(jtf.getText()+"3");
                } catch (Exception exception) {
                    JOptionPane.showMessageDialog(null, "Something went wrong");
                }
            }
        });
        b_minus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    jtf.setText(jtf.getText()+"-");
                } catch (Exception exception) {
                    JOptionPane.showMessageDialog(null, "Something went wrong");
                }
            }
        });

        b0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    jtf.setText(jtf.getText()+"0");
                } catch (Exception exception) {
                    JOptionPane.showMessageDialog(null, "Something went wrong");
                }
            }
        });
        b_point.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    jtf.setText(jtf.getText()+".");
                } catch (Exception exception) {
                    JOptionPane.showMessageDialog(null, "Something went wrong");
                }
            }
        });
        b_plus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    jtf.setText(jtf.getText()+"+");
                } catch (Exception exception) {
                    JOptionPane.showMessageDialog(null, "Something went wrong");
                }
            }
        });

        b_equal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String x = jtf.getText().trim();
                Double res = eval(x);
                //JOptionPane.showMessageDialog(null, "Result = " + res);
                jtf.setText(res.toString());
            }
        });
        setVisible(true);
    }

    public static void main(String[] args) {
        new Calculator_pro();
    }

    public static Double eval(String s) {
        if (s.contains("+")) {
            String[] strings = s.split("\\+", 2);
            //System.out.println(Strings[0]);
            return eval(strings[0].trim()) + eval(strings[1].trim());
        } else if (s.contains("*")) {
            String[] strings = s.split("\\*", 2);
            return eval(strings[0].trim()) * eval(strings[1].trim());
        } else if (s.contains("/")) {
            String[] strings = s.split("/", 2);
            return eval(strings[0].trim()) / eval(strings[1].trim());
        } else if (s.contains("-")) {
            String[] strings = s.split("-", 2);
            if (strings.length == 1) {
                return eval("0") - eval(strings[0].trim().substring(1));
            }
            return eval(strings[0].trim()) - eval(strings[1].trim());
        } else {
            if (s.isEmpty()) {
                return 0.0;
            } else {
                return Double.parseDouble(s.trim());
            }
        }
    }
}
