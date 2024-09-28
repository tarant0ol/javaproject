package pr4_1;

public class Rectangle extends Shape {
    protected double width;
    protected double length;

    public Rectangle() {
        super("black", false);
        this.width = 1.0;
        this.length = 1.0;
    }

    public Rectangle(double width, double length) {
        super("black", false);
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.length = length;
        this.width = width;
    }

    public double getWidth() { return width; }
    public double getLength() { return length; }
    public void setLength(double length) { this.length = length; }
    public void setWidth(double width) { this.width = width; }

    @Override
    public String toString() {
        return "Rectangle{Width: " + this.width + ", Length: "+ this.length + ", color: " + super.color + ", filled: " + super.filled +  "}";
    }

    public double getArea(){
        return this.width * this.length;
    }

    public double getPerimeter() {
        return 2 * (this.length + this.width);
    }
}
