package pr2.Dog;

public class Dog {
    private String nickname;
    private int age;

    public Dog(String name, int age) {
        this.nickname = name;
        this.age = age;;
    }

    public String getNickname() { return nickname; }
    public void setNickname(String new_name) { this.nickname = new_name; }
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public int getHumanAge(int age) { return age*7; }

    @Override
    public String toString(){
        return "Dog {name: " + nickname + ", age: " + age + "}";
    }


}
