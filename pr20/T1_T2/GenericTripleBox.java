package pr20.T1_T2;

public class GenericTripleBox<T,V,K> {
    private T holder1;
    private V holder2;
    private K holder3;

    public GenericTripleBox(T h1, V h2, K h3) {
        this.holder1 = h1;
        this.holder2 = h2;
        this.holder3 = h3;
    }

    public K getHolder3() { return holder3; }
    public T getHolder1() { return holder1; }
    public V getHolder2() { return holder2; }

    public void setHolder1(T holder1) { this.holder1 = holder1; }
    public void setHolder2(V holder2) { this.holder2 = holder2; }
    public void setHolder3(K holder3) { this.holder3 = holder3; }

    @Override
    public String toString() {
        return "GenericTripleBox{" +
                "holder1=" + holder1.getClass() +
                ", holder2=" + holder2.getClass() +
                ", holder3=" + holder3.getClass() +
                '}';
    }
}
