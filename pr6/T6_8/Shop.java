package pr6.T6_8;

import java.util.Arrays;

public class Shop implements Printable{
    private String name;
    private String address;
    private String[] wardrobe;

    public Shop(String name, String address, String[] wardrobe){
        this.name = name;
        this.address = address;
        this.wardrobe = wardrobe;
    }

    public String getName() { return name; }
    public String getAddress() { return address; }
    public String[] getWardrobe() { return wardrobe; }
    public void setAddress(String address) { this.address = address; }
    public void setName(String name) { this.name = name; }
    public void setWardrobe(String[] wardrobe) { this.wardrobe = wardrobe; }

    @Override
    public void print() {
        System.out.println("Shop{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", wardrobe=" + Arrays.toString(wardrobe) +
                '}');
    }
}
