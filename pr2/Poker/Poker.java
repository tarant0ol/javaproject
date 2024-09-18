package pr2.Poker;

import java.util.ArrayList;
import java.util.Random;

public class Poker {
    public static void main(String[] args) {
        ArrayList<Card> deck = new ArrayList<>();
        add_suit(deck, "clubs");
        add_suit(deck, "spades");
        add_suit(deck, "hearts");
        add_suit(deck, "diamonds");

        System.out.println(choose_hand(deck));
        System.out.println(choose_hand(deck));
        System.out.println(choose_hand(deck));
        System.out.println(choose_hand(deck));
        System.out.println(choose_hand(deck));
        System.out.println(choose_hand(deck));
        System.out.println(choose_hand(deck));
        System.out.println(choose_hand(deck));
        System.out.println(choose_hand(deck));
        System.out.println(choose_hand(deck));









    }

    public static void add_suit(ArrayList<Card> deck, String suit) {
        for (int i = 2; i <= 10; i++){
            Card card = new Card(suit, String.valueOf(i));
            deck.add(card);
        }
        Card card_j = new Card(suit, "jack");
        deck.add(card_j);
        Card card_q= new Card(suit, "queen");
        deck.add(card_q);
        Card card_k = new Card(suit, "king");
        deck.add(card_k);
        Card card_a = new Card(suit, "ace");
        deck.add(card_a);
    }


    public static ArrayList<Card> choose_hand(ArrayList<Card> deck) {
        ArrayList<Card> res = new ArrayList<>();
        if (deck.size() < 5) {
            System.out.println("No, not happening");
            return new ArrayList<>();
        }
        for (int i=0; i<5; i++){
            Random rand = new Random();
            int index = rand.nextInt(deck.size());
            res.add(deck.get(index));
            deck.remove(index);
        }
        return res;
    }
}
