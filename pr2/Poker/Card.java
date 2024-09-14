package pr2.Poker;

public class Card {
    private String suit;
    private String rank;

    public Card(String suit, String rank){
        this.suit = suit;
        this.rank = rank;
    }

    public String getSuit() { return suit; }
    public String getRank() { return rank; }
    public void setSuit(String suit) { this.suit = suit; }
    public void setRank(String rank) { this.rank = rank; }

    @Override
    public String toString(){
        return getRank() + " of " + getSuit();
    }

}
