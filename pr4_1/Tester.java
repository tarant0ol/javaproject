package pr4_1;

public class Tester {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Circle circle1 = new Circle(12);
        Circle circle2 = new Circle("green", false, 15);

        System.out.println(circle.toString());
        System.out.println(circle1.toString());
        System.out.println(circle2.toString());
        System.out.println(circle2.getArea());
        System.out.println(circle.getPerimeter());

        Rectangle rectangle = new Rectangle();
        Rectangle rectangle1 = new Rectangle(10, 1);
        Rectangle rectangle2 = new Rectangle(12, 2, "red", true);

        System.out.println(rectangle.toString());
        System.out.println(rectangle1.toString());
        System.out.println(rectangle2.toString());
        System.out.println(rectangle2.getArea());
        System.out.println(rectangle2.getPerimeter());

        Square square = new Square();
        Square square1 = new Square(10);
        Square square2 = new Square(15, "blue", true);


        System.out.println(square.toString());
        System.out.println(square1.toString());
        System.out.println(square2.toString());
        System.out.println(square2.getArea());
        System.out.println(square2.getPerimeter());

    }
}
