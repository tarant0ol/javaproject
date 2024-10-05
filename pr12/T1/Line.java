package pr12.T1;

import java.awt.*;

public class Line extends Shape {
    private int x2;
    private int y2;

    public Line(int x, int y, int x2, int y2, Color color) {
        super(color, x, y);
        this.x2 = x2;
        this.y2 = y2;
    }

    public double getX2() { return x2; }
    public void setX2(int x2) { this.x2 = x2; }
    public int getY2() { return y2; }
    public void setY2(int y2) { this.y2 = y2; }
}
