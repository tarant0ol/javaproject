package pr4;




public abstract class Clothes {
    private Size size;
    private int price;
    private Color color;


    public Color getColor() { return color; }
    public int getPrice() { return price; }
    public Size getSize() { return size; }

    public void setSize(Size size) { this.size = size; }
    public void setColor(Color color) { this.color = color; }
    public void setPrice(int price) { this.price = price; }

    public Clothes(Size size, int price, Color color){
        this.color = color;
        this.price = price;
        this.size = size;
    }
}
