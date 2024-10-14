package pr13.T3;

public class Address {
    private String country;
    private String region;
    private String town;
    private String street;
    private String house;
    private String corpus;
    private String flat;

    public Address(String address) {
        String spl = address.substring(address.indexOf(" ") - 1, address.indexOf(" ") + 1);
        String[] info = address.split(spl);

        this.country = info[0];
        this.region = info[1];
        this.town = info[2];
        this.street = info[3];
        this.house = info[4];
        this.corpus = info[5];
        this.flat = info[6];
    }

    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", region='" + region + '\'' +
                ", town='" + town + '\'' +
                ", street='" + street + '\'' +
                ", house='" + house + '\'' +
                ", corpus='" + corpus + '\'' +
                ", flat='" + flat + '\'' +
                '}';
    }
}
