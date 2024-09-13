package pr2.CirclePoint;

public class Circle {
    private Point center;
    private double r;

    public Circle(Point center, double r){
        this.center = center;
        this.r = r;
    }

    public String getCenter() { return center.toString(); }
    public double getR() { return r; }
    public void setCenter(Point new_center) { this.center = new_center;}
    public void setR(double r) { this.r= r; }

    @Override
    public String toString() {
        return "Circle {Center=" + center.toString() + ", r=" + r + "}";
    }
}
