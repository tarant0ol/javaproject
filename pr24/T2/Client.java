package pr24.T2;

public class Client {
    public Chair chair;

    public Client(Chair chair) {
        this.chair = chair;
    }

    public void sit() {
        System.out.println("you sat on " + chair);
    }

    public void setChair(Chair chair) { this.chair = chair; }
    //public Chair getChair() { return chair; }
}
