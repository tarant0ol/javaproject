package pr24.T2;

public class VictorianChair extends Chair{
    private int height, age;
    private String material;

    public VictorianChair(int height, String material, int age) {
        this.height = height;
        this.material = material;
        this.age = age;
    }

    public int getHeight() { return this.height; }
    public String getMaterial() { return this.material; }

    public int getAge() { return age; }
}
