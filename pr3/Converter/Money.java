package pr3.Converter;

public class Money {
    private Double value;
    private String currency;

    public Money(Double value, String currency) {
        this.value = value;
        this.currency = currency;
    }

    public Double getValue() { return this.value; }
    public String getCurrency() { return this.currency; }

    public void setValue(Double value) { this.value = value; }
    public void setCurrency(String currency) { this.currency = currency; }

    @Override
    public String toString() {
        return String.format("%.2f", this.value) + " " +  this.currency;
    }
}
