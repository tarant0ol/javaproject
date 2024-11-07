package pr24.T2;

public class FunctionalChair extends Chair{
    private int height;
    private String material;

    public FunctionalChair(int height, String material) {
        this.height = height;
        this.material = material;
    }

    public int getHeight() { return this.height; }
    public String getMaterial() { return material; }

    public int sum(int a, int b) { return a + b; }
}
