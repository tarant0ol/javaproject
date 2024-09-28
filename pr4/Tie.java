package pr4;

public class Tie extends Clothes implements MenClothing {

    public Tie(Size size, int price, Color color){
        super(size, price, color);
    }

    @Override
    public void dressMan() {
        System.out.println(getColor().getName() + " галстук размера " + getSize() + " всего за " + getPrice());
    }
}
