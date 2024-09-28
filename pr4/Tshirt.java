package pr4;

public class Tshirt extends Clothes implements MenClothing, WomenClothing{

    public Tshirt(Size size, int price, Color color){
        super(size, price, color);
    }
    @Override
    public void dressMan() {
        System.out.println(getColor().getName() + " мужская футболка размера " + getSize() + " всего за " + getPrice());
    }

    @Override
    public void dressWomen() {
        System.out.println(getColor().getName() + " женская футболка размера " + getSize() + " всего за " + getPrice());
    }
}
