package pr4;

public class Pants extends Clothes implements MenClothing, WomenClothing{

    public Pants(Size size, int price, Color color){
        super(size, price, color);
    }

    @Override
    public void dressWomen() {
        System.out.println(getColor().getName() + " женские штаны размера " + getSize() + " всего за " + getPrice());
    }

    @Override
    public void dressMan() {
        System.out.println(getColor().getName() + " мужские штаны размера " + getSize() + " всего за " + getPrice());
    }
}
