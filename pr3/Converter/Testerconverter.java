package pr3.Converter;

public class Testerconverter {
    public static void main(String[] args) {
        Converter conv = new Converter();
        Money EUR_money = new Money(100.23, "EUR");
        Money RUB_money = new Money(100123.45, "RUB");

        Money jpy_money = conv.convert(EUR_money, "JPY");
        System.out.println("EUR:" + EUR_money.toString() + " to JPY: " + jpy_money.toString());

        Money GBP_money = conv.convert(RUB_money, "GBP");
        System.out.println("RUB: " + RUB_money.toString() + " to GBP: "  + GBP_money.toString());
    }
}
