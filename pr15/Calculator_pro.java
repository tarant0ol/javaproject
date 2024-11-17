package pr15;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator_pro extends JFrame {
    int max_el = 30;
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

    JButton b_left_br = new JButton("(");
    JButton b_right_br = new JButton(")");
    JButton b_del1 = new JButton("<=");
    JButton b_clear = new JButton("AC");



    public Calculator_pro() {
        super("Calculator_pro");
        jtf.setEditable(false);
        setLayout(null);
        setResizable(false);
        setSize(320, 420);
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

        b_left_br.setBounds(20, 320, 50, 30); add(b_left_br);
        b_right_br.setBounds(90, 320, 50, 30); add(b_right_br);
        b_del1.setBounds(160, 320, 50, 30); add(b_del1);
        b_clear.setBounds(230, 320, 50, 30); add(b_clear);

        b7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String s = jtf.getText();
                    if (s.isEmpty()) {
                        jtf.setText(jtf.getText()+"7");
                    } else if (s.length() < max_el){
                        String lastchar = s.substring(s.length()-1);
                        if (!lastchar.equals(")")) {
                            jtf.setText(jtf.getText()+"7");
                        }
                    }
                } catch (Exception exception) {
                    JOptionPane.showMessageDialog(null, "Something went wrong");
                }
            }
        });
        b8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String s = jtf.getText();
                    if (s.isEmpty()) {
                        jtf.setText(jtf.getText()+"8");
                    } else if (s.length() < max_el) {
                        String lastchar = s.substring(s.length()-1);
                        if (!lastchar.equals(")")) {
                            jtf.setText(jtf.getText()+"8");
                        }
                    }
                } catch (Exception exception) {
                    JOptionPane.showMessageDialog(null, "Something went wrong");
                }
            }
        });
        b9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String s = jtf.getText();
                    if (s.isEmpty()) {
                        jtf.setText(jtf.getText()+"9");
                    } else if (s.length() < max_el) {
                        String lastchar = s.substring(s.length()-1);
                        if (!lastchar.equals(")")) {
                            jtf.setText(jtf.getText()+"9");
                        }
                    }
                } catch (Exception exception) {
                    JOptionPane.showMessageDialog(null, "Something went wrong");
                }
            }
        });
        b_divide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String s = jtf.getText();
                    if (!s.isEmpty() & s.length() < max_el) {
                        String lastchar = s.substring(s.length()-1);
                        if (!lastchar.equals("(") && !isControl(lastchar)) {
                            jtf.setText(jtf.getText()+"/");
                        }
                    }
                } catch (Exception exception) {
                    JOptionPane.showMessageDialog(null, "Something went wrong");
                }
            }
        });

        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String s = jtf.getText();
                    if (s.isEmpty()) {
                        jtf.setText(jtf.getText()+"4");
                    } else if (s.length() < max_el) {
                        String lastchar = s.substring(s.length()-1);
                        if (!lastchar.equals(")")) {
                            jtf.setText(jtf.getText()+"4");
                        }
                    }
                } catch (Exception exception) {
                    JOptionPane.showMessageDialog(null, "Something went wrong");
                }
            }
        });
        b5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String s = jtf.getText();
                    if (s.isEmpty()) {
                        jtf.setText(jtf.getText()+"5");
                    } else if (s.length() < max_el) {
                        String lastchar = s.substring(s.length()-1);
                        if (!lastchar.equals(")")) {
                            jtf.setText(jtf.getText()+"5");
                        }
                    }
                } catch (Exception exception) {
                    JOptionPane.showMessageDialog(null, "Something went wrong");
                }
            }
        });
        b6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String s = jtf.getText();
                    if (s.isEmpty()) {
                        jtf.setText(jtf.getText()+"6");
                    } else if (s.length() < max_el) {
                        String lastchar = s.substring(s.length()-1);
                        if (!lastchar.equals(")")) {
                            jtf.setText(jtf.getText()+"6");
                        }
                    }
                } catch (Exception exception) {
                    JOptionPane.showMessageDialog(null, "Something went wrong");
                }
            }
        });
        b_mult.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String s = jtf.getText();
                    if (!s.isEmpty() && s.length() < max_el) {
                        String lastchar = s.substring(s.length()-1);
                        if (!lastchar.equals("(") && !isControl(lastchar)) {
                            jtf.setText(jtf.getText()+"*");
                        }
                    }
                } catch (Exception exception) {
                    JOptionPane.showMessageDialog(null, "Something went wrong");
                }
            }
        });

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String s = jtf.getText();
                    if (s.isEmpty()) {
                        jtf.setText(jtf.getText()+"1");
                    } else if (s.length() < max_el) {
                        String lastchar = s.substring(s.length()-1);
                        if (!lastchar.equals(")")) {
                            jtf.setText(jtf.getText()+"1");
                        }
                    }
                } catch (Exception exception) {
                    JOptionPane.showMessageDialog(null, "Something went wrong");
                }
            }
        });
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String s = jtf.getText();
                    if (s.isEmpty()) {
                        jtf.setText(jtf.getText()+"2");
                    } else if (s.length() < max_el) {
                        String lastchar = s.substring(s.length()-1);
                        if (!lastchar.equals(")")) {
                            jtf.setText(jtf.getText()+"2");
                        }
                    }
                } catch (Exception exception) {
                    JOptionPane.showMessageDialog(null, "Something went wrong");
                }
            }
        });
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String s = jtf.getText();
                    if (s.isEmpty()) {
                        jtf.setText(jtf.getText()+"3");
                    } else if (s.length() < max_el) {
                        String lastchar = s.substring(s.length()-1);
                        if (!lastchar.equals(")")) {
                            jtf.setText(jtf.getText()+"3");
                        }
                    }
                } catch (Exception exception) {
                    JOptionPane.showMessageDialog(null, "Something went wrong");
                }
            }
        });
        b_minus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String s = jtf.getText();
                    if (s.isEmpty()) {
                        jtf.setText("-");
                    } else if (s.length() < max_el) {
                        String lastchar = s.substring(s.length()-1);
                        if ((!isControl(lastchar)) || lastchar.equals("")) {
                            jtf.setText(jtf.getText()+"-");
                        }
                    }
                } catch (Exception exception) {
                    JOptionPane.showMessageDialog(null, "Something went wrong");
                }
            }
        });

        b0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String s = jtf.getText();
                    if (s.isEmpty()) {
                        jtf.setText(jtf.getText()+"0");
                    } else if (s.length() < max_el) {
                        String lastchar = s.substring(s.length()-1);
                        if (!lastchar.equals(")")) {
                            jtf.setText(jtf.getText()+"0");
                        }
                    }
                } catch (Exception exception) {
                    JOptionPane.showMessageDialog(null, "Something went wrong");
                }
            }
        });
        b_point.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String s = jtf.getText();
                    if (!s.isEmpty() && s.length() < max_el) {
                        String lastchar = s.substring(s.length()-1);
                        if (isInt(lastchar)) {
                            jtf.setText(jtf.getText()+".");
                        }
                    }
                } catch (Exception exception) {
                    JOptionPane.showMessageDialog(null, "Something went wrong");
                }
            }
        });
        b_plus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String s = jtf.getText();
                    if (!s.isEmpty() && s.length() < max_el) {
                        String lastchar = s.substring(s.length()-1);
                        if (!lastchar.equals("(") && !isControl(lastchar)) {
                            jtf.setText(jtf.getText()+"+");
                        }
                    }
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
                if (res.toString().equals("Infinity") || res.toString().equals("NaN")) {
                    JOptionPane.showMessageDialog(null, "Result = " + res);
                    jtf.setText("");
                } else {
                    jtf.setText(res.toString());
                }


            }
        });

        b_left_br.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String s = jtf.getText();
                    if (s.isEmpty()) {
                        jtf.setText(jtf.getText()+"(");
                    } else if (s.length() < max_el){
                        String lastchar = s.substring(s.length()-1);
                        if (!lastchar.equals(".") && !isInt(lastchar)) {
                            jtf.setText(jtf.getText()+"(");
                        }
                    }
                } catch (Exception exception) {
                    JOptionPane.showMessageDialog(null, "Something went wrong");
                }
            }
        });
        b_right_br.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String s = jtf.getText();
                    if (!s.isEmpty() && s.length() < max_el){
                        String lastchar = s.substring(s.length()-1);
                        if (count(s, '(') - count(s, ')') > 0 && !isControl(lastchar) && !lastchar.equals(".")){
                            jtf.setText(jtf.getText()+")");
                        }
                    }
                } catch (Exception exception) {
                    JOptionPane.showMessageDialog(null, "Something went wrong");
                }
            }
        });
        b_del1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!jtf.getText().isEmpty()) {
                    jtf.setText(jtf.getText().substring(0, jtf.getText().length()-1));
                }
            }
        });
        b_clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jtf.setText("");
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new Calculator_pro();
    }
    /*
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
    */
    private static boolean isInt(String s) {
        try {
            int s1 = Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private static boolean isControl(String s) {
        return s.equals("+") || s.equals("-") || s.equals("/") || s.equals("*") || s.equals("^") || s.equals(".");
    }

    private static int count(String s, char ch) {
        int c = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ch) {
                c++;
            }
        }
        return c;
    }

    public static double eval(final String str) {
        return new Object() {
            int pos = -1, ch;

            void nextChar() {
                ch = (++pos < str.length()) ? str.charAt(pos) : -1;
            }

            boolean eat(int charToEat) {
                while (ch == ' ') nextChar();
                if (ch == charToEat) {
                    nextChar();
                    return true;
                }
                return false;
            }

            double parse() {
                nextChar();
                double x = parseExpression();
                if (pos < str.length()) throw new RuntimeException("Unexpected: " + (char)ch);
                return x;
            }

            // Grammar:
            // expression = term | expression `+` term | expression `-` term
            // term = factor | term `*` factor | term `/` factor
            // factor = `+` factor | `-` factor | `(` expression `)` | number
            //        | functionName `(` expression `)` | functionName factor
            //        | factor `^` factor

            double parseExpression() {
                double x = parseTerm();
                for (;;) {
                    if      (eat('+')) x += parseTerm(); // addition
                    else if (eat('-')) x -= parseTerm(); // subtraction
                    else return x;
                }
            }

            double parseTerm() {
                double x = parseFactor();
                for (;;) {
                    if      (eat('*')) x *= parseFactor(); // multiplication
                    else if (eat('/')) x /= parseFactor(); // division
                    else return x;
                }
            }

            double parseFactor() {
                if (eat('+')) return +parseFactor(); // unary plus
                if (eat('-')) return -parseFactor(); // unary minus

                double x;
                int startPos = this.pos;
                if (eat('(')) { // parentheses
                    x = parseExpression();
                    if (!eat(')')) throw new RuntimeException("Missing ')'");
                } else if ((ch >= '0' && ch <= '9') || ch == '.') { // numbers
                    while ((ch >= '0' && ch <= '9') || ch == '.') nextChar();
                    x = Double.parseDouble(str.substring(startPos, this.pos));
                } else if (ch >= 'a' && ch <= 'z') { // functions
                    while (ch >= 'a' && ch <= 'z') nextChar();
                    String func = str.substring(startPos, this.pos);
                    if (eat('(')) {
                        x = parseExpression();
                        if (!eat(')')) throw new RuntimeException("Missing ')' after argument to " + func);
                    } else {
                        x = parseFactor();
                    }
                    if (func.equals("sqrt")) x = Math.sqrt(x);
                    else if (func.equals("sin")) x = Math.sin(Math.toRadians(x));
                    else if (func.equals("cos")) x = Math.cos(Math.toRadians(x));
                    else if (func.equals("tan")) x = Math.tan(Math.toRadians(x));
                    else throw new RuntimeException("Unknown function: " + func);
                } else {
                    throw new RuntimeException("Unexpected: " + (char)ch);
                }

                if (eat('^')) x = Math.pow(x, parseFactor()); // exponentiation

                return x;
            }
        }.parse();
    } // not mine

}
