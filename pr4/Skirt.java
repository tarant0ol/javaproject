package pr4;

public class Skirt extends Clothes implements WomenClothing{

    public Skirt(Size size, int price, Color color){
        super(size, price, color);
    }

    @Override
    public void dressWomen() {
        System.out.println(getColor().getName() + " юбка размера " + getSize() + " всего за " + getPrice());
    }
}
