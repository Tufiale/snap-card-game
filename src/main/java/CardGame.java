import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class CardGame {

    protected ArrayList<Card> deckOfCards;
    protected String name;

    public CardGame(String name) {
        this.name = name;
        deckOfCards = new ArrayList<>();
        populateDeck();
    }

    private void populateDeck() {
        String[] suits = {"♥", "♣", "♦", "♠"};
        String[] symbols = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        int[] values = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};

        for (String suit : suits) {
            for (int i = 0; i < symbols.length; i++) {
                Card card = new Card(suit, symbols[i], values[i]);
                deckOfCards.add(card);
            }
        }
    }

    public List<Card> getDeck() {
        return deckOfCards;
    }

    public Card dealCard() {
        if (!deckOfCards.isEmpty()) {
            Card topCard = deckOfCards.remove(0);
            System.out.println("Dealing card: " + topCard);
            return topCard;
        } else {
            System.out.println("No more cards in the deck, son!...\u001B[31m maybe do something productive?\u001B[0m");
            return null;
        }
    }

    public ArrayList<Card> sortDeckInNumberOrder() {
        Collections.sort(deckOfCards, (card1, card2) -> card1.getValue() - card2.getValue());
        return deckOfCards;
    }

    public ArrayList<Card> sortDeckIntoSuits() {
        Collections.sort(deckOfCards, (card1, card2) -> {
            int suitComparison = card1.getSuit().compareTo(card2.getSuit());
            if (suitComparison == 0) {
                return Integer.compare(card1.getValue(), card2.getValue());
            }
            return suitComparison;
        });
        return deckOfCards;
    }

    public ArrayList<Card> shuffleDeck() {
        Collections.shuffle(deckOfCards);
        return deckOfCards;
    }

}

