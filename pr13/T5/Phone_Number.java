package pr13.T5;



public class Phone_Number {
    private StringBuffer number = new StringBuffer();

    public Phone_Number(String number){
        if (number.charAt(0) == '8') {
            this.number.append("+7").append(number, number.length() - 10, number.length() - 7).append("-").append(number, number.length() - 7, number.length() - 4).append("-").append(number, number.length() - 4, number.length());
        } else {
            this.number.append(number, 0, number.length() - 10).append(number, number.length() - 10, number.length() - 7).append("-").append(number, number.length() - 7, number.length() - 4).append("-").append(number, number.length() - 4, number.length());
        }
    }

    @Override
    public String toString() {
        return "Phone_Number{" +
                "number=" + number +
                '}';
    }
}
