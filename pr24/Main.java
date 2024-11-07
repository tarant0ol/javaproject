package pr24;

import pr24.T1.Complex;
import pr24.T1.ConcreteFactory;

public class Main {
    public static void main(String[] args) {
        ConcreteFactory factory = new ConcreteFactory();
        Complex c1 = factory.createComplex();
        Complex c2 = factory.createComplex();
        Complex c3 = factory.createComplex(6, 10);
        Complex c4 = factory.createComplex(5, 2);

        System.out.println(c1 + "\n" + c2 + "\n" + c3 + "\n" + c4 + "\n");
    }
}
