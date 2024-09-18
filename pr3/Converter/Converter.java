package pr3.Converter;

import java.util.HashMap;


public class Converter {
    private HashMap<String, Double> curr_map = new HashMap<>();
    {
        curr_map.put("RUB", 1.);
        curr_map.put("USD", 0.0109);
        curr_map.put("EUR", 0.009779);
        curr_map.put("GBP", 0.008237);
        curr_map.put("JPY", 1.538);
        curr_map.put("CAD", 0.0148);
        curr_map.put("INR", 0.9090);
    }

    public Converter(){}

    public Money convert(Money money, String currency) {
        Money result = new Money(0., "RUB");
        if (curr_map.keySet().contains(currency)) {
            if (money.getCurrency() == "RUB") {
                result.setValue(money.getValue() * curr_map.get(currency));
            } else {
                result.setValue((result.getValue() / curr_map.get(money.getCurrency())) * curr_map.get(currency));
            }
        } else {
            System.err.println("You cannot input " + currency + " currency.");
        }
        result.setCurrency(currency);
        return result;
    }

}
