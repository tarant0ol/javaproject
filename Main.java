//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String s = "S001,Black Polo Shirt,Black,XL";
        String[] ss = s.split(",");
        for (String s1: ss){
            System.out.println(s1);
        }

    }
}