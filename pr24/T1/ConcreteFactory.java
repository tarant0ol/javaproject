package pr24.T1;

public class ConcreteFactory implements ComplexAbstractFactory {
    private int real;
    private int image;

    public ConcreteFactory() {}

    @Override
    public Complex createComplex() {
        return new Complex();
    }

    @Override
    public Complex createComplex(int real, int image) {
        return new Complex(real, image);
    }
}
