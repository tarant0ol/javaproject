package pr24.T2;

public interface AbstractChairFactory {
    Chair createVictorianChair(int height, String material, int age);
    Chair createMagicChair(int height, String material);
    Chair createFunctionalChair(int height, String material);

}
