package pr4_1;

public class Square extends Rectangle{
    public Square(){
        super(1.0 , 1.0, "black", false);
    }

    public Square(double side) {
        super(side, side, "black", false);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() { return this.length; }
    public void setSide(double side) { this.length = side; this.width = side; }

    @Override
    public void setWidth(double width) {
        this.width = width;
        //this.length = width;
    }

    @Override
    public void setLength(double length) {
        this.length = length;
        // this.width = length;
    }

    @Override
    public String toString() {
        return "Square{Side: " + getSide() + ", Color:" + super.color + ", filled: " + super.filled + "}";
    }
}
