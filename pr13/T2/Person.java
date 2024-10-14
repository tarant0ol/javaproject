package pr13.T2;



public class Person {
    private String firstname;
    private String surname;
    private String lastname;


    public Person(String information) {
        String[] info = information.split(", ");
        if (info.length == 3) {
            this.surname = info[0];
            this.firstname = info[1];
            this.lastname = info[2];
        } else if (info.length == 2) {
            this.surname = info[0];
            this.firstname = info[1];
            this.lastname = null;
        } else {
            this.surname = info[0];
            this.firstname = null;
            this.lastname = null;
        }
    }

    public String getFirstname() { if (firstname != null) return firstname; else return "-"; }
    public String getLastname() { if (lastname != null) return lastname; else return "-"; }
    public String getSurname() { return surname; }
    public void setFirstname(String firstname) { this.firstname = firstname;}
    public void setLastname(String lastname) { this.lastname = lastname; }
    public void setSurname(String surname) { this.surname = surname; }

    @Override
    public String toString() {
        if (this.lastname == null && this.firstname == null) {
            return "Person{" +
                    "surname='" + surname + '\'' +
                    '}';
        } else if (this.lastname == null) {
            return "Person{" +
                    "surname='" + surname + '\'' +
                    ", firstname='" + firstname + '\'' +
                    '}';
        } else if (this.firstname == null) {
            return "Person{" +
                    "surname='" + surname + '\'' +
                    ", lastname='" + lastname + '\'' +
                    '}';
        } else {
            return "Person{" +
                    "surname='" + surname + '\'' +
                    ", firstname='" + firstname + '\'' +
                    ", lastname='" + lastname + '\'' +
                    '}';
        }

    }
}
