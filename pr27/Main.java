package pr27;


public class Main {
    public static void main(String[] args) {
        HashTab table = new HashTab();
        table.hashtabInit();

        table.hashtabAdd("a", 1);
        table.hashtabAdd("b", 2);

        table.print();

        table.hashtabDelete("a");

        table.print();

        System.out.println("Value on key 'b' " + table.hashtabLookUp("b"));
    }
}
