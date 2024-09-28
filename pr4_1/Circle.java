package pr4_1;

public class Circle extends Shape{
    protected double radius;

    public Circle(){
        super("black", false);
        this.radius = 1.0;
    }

    public Circle(double radius){
        super("black", false);
        this.radius = radius;
    }

    public Circle(String color, boolean filled, int radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() { return radius; }
    public void setRadius(double radius) { this.radius = radius; }

    public double getArea() {
        return 3.14 * this.radius * this.radius;
    }

    public double getPerimeter() {
        return 2 * 3.14 * this.radius;
    }
}
