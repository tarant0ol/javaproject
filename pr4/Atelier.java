package pr4;

import java.util.ArrayList;

public class Atelier implements WomenClothing, MenClothing{
    Clothes[] wardrobe = new Clothes[4];
    {
        wardrobe[0] = new Tshirt(Size.L, 1500, Color.green);
        wardrobe[1] = new Pants(Size.S, 50, Color.purple);
        wardrobe[2] = new Skirt(Size.XS, 150, Color.blue);
        wardrobe[3] = new Tie(Size.XXS, 100, Color.red);
    }

    public Atelier() {}


    @Override
    public void dressMan() {
        for (Clothes c: wardrobe){
            if (c instanceof Tshirt) {
                Tshirt tshirt = (Tshirt) c;
                tshirt.dressMan();
            } else if (c instanceof Pants) {
                Pants pants = (Pants) c;
                pants.dressMan();
            } else if (c instanceof Tie) {
                Tie tie = (Tie) c;
                tie.dressMan();
            }
        }
    }

    @Override
    public void dressWomen() {
        for (Clothes c: wardrobe){
            if (c instanceof Tshirt) {
                Tshirt tshirt = (Tshirt) c;
                tshirt.dressWomen();
            } else if (c instanceof Pants) {
                Pants pants = (Pants) c;
                pants.dressWomen();
            } else if (c instanceof Skirt) {
                Skirt skirt = (Skirt) c;
                skirt.dressWomen();
            }
        }
    }
}




