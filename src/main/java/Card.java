public class Card {
    protected String suit;
    protected String symbol;
    protected int value;


    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Card(String suit) {
        this.suit = suit;
    }

    public Card(String suit, String symbol) {
        this.suit = suit;
        this.symbol = symbol;
    }

    public Card(String suit, String symbol, int value) {
        this.suit = suit;
        this.symbol = symbol;
        this.value = value;
    }

    public String toString() {
        return symbol + " of " + suit;
    }


}
