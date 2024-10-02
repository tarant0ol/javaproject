package pr5.T1;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
public class T2 extends JPanel{

    private void doDrawing(Graphics g) {
        Random rand = new Random();
        for (int i = 0; i < 200; i++) {
            int r = rand.nextInt(3);
            System.out.println(i);
            switch (r){
                case 0:
                    Circle c = new Circle(rand.nextInt(150) + 50, rand.nextInt(150) + 50, rand.nextInt(340) + 10, new Color(rand.nextFloat(), rand.nextFloat() ,rand.nextFloat()));
                    g.setColor(c.getColor());
                    g.drawOval(c.getX(), c.getY(), c.getR(), c.getR());
                    break;
                case 1:
                    Rectangle rectangle = new Rectangle(rand.nextInt(150) + 50, rand.nextInt(150) + 50, rand.nextInt(340) + 10,rand.nextInt(340) + 10, new Color(rand.nextFloat(), rand.nextFloat() ,rand.nextFloat()));
                    g.setColor(rectangle.getColor());
                    g.drawRect(rectangle.getX(), rectangle.getY(), rectangle.getWidth(), rectangle.getHeight());
                    break;
                case 2:
                    Line l = new Line(rand.nextInt(590) + 10, rand.nextInt(590) + 10, rand.nextInt(590) + 10,  rand.nextInt(590) + 10, new Color(rand.nextFloat(), rand.nextFloat() ,rand.nextFloat()));
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

        T2 m=new T2();
        JFrame f=new JFrame();
        f.add(m);
        f.setResizable(false);
        f.setSize(600,600);
        f.setVisible(true);
    }

}
