package pr12.T1;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
public class T1 extends JPanel{

    public static int width = 960;
    public static int height = 540;

    private void doDrawing(Graphics g) {
        Random rand = new Random();
        for (int i = 0; i < 20; i++) {
            int r = rand.nextInt(3);
            switch (r){
                case 0:
                    int radius = rand.nextInt(100);
                    Circle c = new Circle(rand.nextInt(width - 2*radius), rand.nextInt(height - 2*radius), radius, new Color(rand.nextFloat(), rand.nextFloat() ,rand.nextFloat()));
                    g.setColor(c.getColor());
                    g.drawOval(c.getX(), c.getY(), c.getR() * 2, c.getR() * 2);
                    break;
                case 1:
                    int rcwidth = rand.nextInt(200);
                    int rcheight = rand.nextInt(200);
                    Rectangle rectangle = new Rectangle(rand.nextInt(width - rcwidth), rand.nextInt(height - rcheight), rcwidth, rcheight, new Color(rand.nextFloat(), rand.nextFloat() ,rand.nextFloat()));
                    g.setColor(rectangle.getColor());
                    g.drawRect(rectangle.getX(), rectangle.getY(), rectangle.getWidth(), rectangle.getHeight());
                    break;
                case 2:
                    Line l = new Line(rand.nextInt(width), rand.nextInt(height), rand.nextInt(width),  rand.nextInt(height), new Color(rand.nextFloat(), rand.nextFloat() ,rand.nextFloat()));
                    g.setColor(l.getColor());
                    g.drawLine(l.getX(), l.getY(), l.getY2(), l.getY2());
                    break;
            }
        }
    }

    @Override
    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        doDrawing(g);
    }

    public static void main(String[] args) {
        T1 m=new T1();
        JFrame f=new JFrame();
        f.add(m);
        //f.setExtendedState(JFrame.MAXIMIZED_BOTH);
        //f.setUndecorated(true);
        f.setResizable(false);
        f.setSize(width,height);
        f.setVisible(true);
    }
}
