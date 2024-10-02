package pr5.T1;

import java.awt.*;

public class Circle extends Shape{
    private int r;

    public Circle(int x, int y, int r, Color color) {
        super(color, x, y);
        this.r = r;
    }

    public int getR() { return r; }
    public void setR(int r) { this.r = r; }
}
