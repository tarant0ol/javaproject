package pr2.CirclePoint;

import java.lang.*;

public class Tester_point_circle {
    public static void main(String[] args) {
        Circle[] circles = new Circle[10];
        for (int i = 0; i < 10; i++){
            Point p = new Point(Math.random(), Math.random());
            circles[i] = new Circle(p, Math.random());
            System.out.println(circles[i].toString());
        }
        System.out.println("length og list: " + circles.length);
//        Scanner sc = new Scanner(System.in);
//        double new_r = sc.nextDouble();
//        Point p1 = new Point(Math.random(), Math.random());
//        Point p2 = new Point(Math.random(), Math.random());
//        Circle c1 = new Circle(p1, 12.22);
//        System.out.println(c1.toString());
//        c1.setCenter(p2);
//        c1.setR(new_r);
//        System.out.println(c1.toString());
    }
}
