package pr24.T2;

public class ChairFactory implements AbstractChairFactory{

    public Chair createVictorianChair(int height, String material, int age) {
        return new VictorianChair(height, material, age);
    }

    public Chair createMagicChair(int height, String material) {
        return new MagicChair(height, material);
    }

    public Chair createFunctionalChair(int height, String material) {
        return new FunctionalChair(height, material);
    }
}
