package pr24.T2;

public class Main {
    public static void main(String[] args) {
        ChairFactory chairFactory = new ChairFactory();
        Client client = new Client(chairFactory.createMagicChair(10, "magic wood"));
        client.sit();
        client.setChair(chairFactory.createVictorianChair(20, "marble", 100));
        client.sit();
    }
}
