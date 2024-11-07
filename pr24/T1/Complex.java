package pr24.T1;

import java.util.Random;

public class Complex {
    private int real, image;

    public Complex() {
        Random random = new Random();
        this.real = random.nextInt(10);
        this.image = random.nextInt(10);
    }

    public Complex(int real, int image) {
        this.real = real;
        this.image = image;
    }

    public int getReal() { return this.real; }
    public int getImage() { return this.image; }

    @Override
    public String toString() {
        return "Complex{" +
                "real=" + real +
                ", image=" + image +
                '}';
    }
}
