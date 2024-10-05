package pr5.T3;

import javax.swing.*;
import java.awt.*;

public class T4 {
    public static void main(String[] args) {
        // Так же можно получать гиф как в номере 3, используя командную строку
        // String path = "C:\\Users\\taran\\IdeaProjects\\javaproject\\src\\pr5\\images\\" + args[0];
        String path = "C:\\Users\\taran\\IdeaProjects\\javaproject\\src\\pr5\\images\\earth.gif";
        JLabel label = new JLabel("", new ImageIcon(path), JLabel.LEFT);

        JFrame frame = new JFrame("incredible");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(label, BorderLayout.NORTH);
        frame.setSize(700, 700);
        frame.setVisible(true);
    }
}
