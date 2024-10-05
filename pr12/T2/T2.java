package pr12.T2;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;



public class T2 extends JPanel{
    public static void main(String[] args) throws IOException {
        JFrame frame = new JFrame();
        frame.setSize(700, 700);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        Image img = ImageIO.read(new File("C:\\Users\\taran\\IdeaProjects\\javaproject\\src\\pr12\\images\\" + args[0]));
        System.out.println(img);
        JPanel pane = new JPanel(){
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(img , 100, 100, this);
            }};
        frame.add(pane);
        frame.setVisible(true);
    }
}

//cd IdeaProjects/javaproject/src/pr5/T2
//javac T3.java
// java T3.java earth.gif

