package pr5.T1;

import java.awt.*;

public class Rectangle extends Shape {
    private int width;
    private int height;

    public Rectangle(int x, int y, int width, int height, Color color){
        super(color, x, y);
        this.width = width;
        this.height = height;
    }

    public int getWidth() { return width; }
    public int getHeight() { return height; }
    public void setHeight(int height) { this.height = height;}
    public void setWidth(int width) { this.width = width; }
}
