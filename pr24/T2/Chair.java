package pr24.T2;

public abstract class Chair {

    public abstract int getHeight();
    public abstract String getMaterial();

    @Override
    public String toString() {
        return "Chair{" +
                "height=" + this.getHeight() +
                ", material='" + getMaterial() + '\'' +
                '}';
    }


}
