package pr4;



public class Tester {
    public static void main(String[] args){

        // Проверка перечисления size
        Size size = Size.L;
        Size size1 = Size.XXS;
        System.out.println(size.getEurosize() + ": " + size.getDescription());
        System.out.println(size1.getEurosize() + ": " + size1.getDescription());
        System.out.println("============");

        // Проверка перечисления color
        Color color = Color.red;
        Color color1 = Color.purple;
        System.out.println("color - red: " + color.getName());
        System.out.println("color - purple: " + color1.getName());
        System.out.println("============");


        // проверка отедльных классов Clothes
        Skirt sk = new Skirt(Size.L, 1200, Color.red);
        Pants pa = new Pants(Size.XS, 500, Color.black);
        Tshirt ts = new Tshirt(Size.M, 200, Color.white);
        Tie ti = new Tie(Size.XXS, 100, Color.blue);
        ti.dressMan(); sk.dressWomen(); pa.dressMan(); ts.dressMan();
        System.out.println("============");


        // Проверка класса Ателье
        Atelier atelier = new Atelier();
        System.out.println("Мужская одежда: ");
        atelier.dressMan();
        System.out.println("Женская одежда: ");
        atelier.dressWomen();
    }
}
