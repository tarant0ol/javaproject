package pr24.T2;

public class MagicChair extends Chair{
    private int height;
    private String material;

    public MagicChair(int height, String material) {
        this.height = height;
        this.material = material;
    }

    public int getHeight() { return this.height; }
    public String getMaterial() { return this.material; }

    public void doMagic() {
        System.out.println("Puff..... now you are platypus");
    }
}
