package pr12.T3;

import javax.swing.*;
import java.awt.*;
import java.net.MalformedURLException;


public class T3 {
    public static void main(String[] argv) throws MalformedURLException {
        String path = "C:\\Users\\taran\\IdeaProjects\\javaproject\\src\\pr12\\images\\gomer_2.gif";
        JLabel label = new JLabel("animated GIF", new ImageIcon(path), JLabel.LEFT);

        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.getContentPane().add(label, BorderLayout.CENTER);
        f.setSize(700, 700);
        f.setVisible(true);
    }
}
