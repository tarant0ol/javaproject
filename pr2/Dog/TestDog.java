package pr2.Dog;

import java.util.Scanner;
import java.lang.*;
public class TestDog {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of Dogs: ");
        int n = sc.nextInt();
        Dog[] dog_house = new Dog[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter Name for a Dog: ");
            String name = sc.next();
            Dog d = new Dog(name, Math.toIntExact(Math.round(1 + Math.random() * 9)));
            dog_house[i] = d;
            System.out.println(dog_house[i].toString());
        }


    }
}
