package pr5.T1;

import java.awt.*;

public abstract class Shape {
    private Color color;
    private int x;
    private int y;

    public Shape(Color color, int x, int y) {
        this.color = color;
        this.x = x;
        this.y = y;
    }

    public int getX() { return x; }
    public int getY() {return y;}
    public Color getColor() { return color; }
    public void setColor(Color color) { this.color = color; }
    public void setX(int x) { this.x = x; }
    public void setY(int y) { this.y = y; }
}
