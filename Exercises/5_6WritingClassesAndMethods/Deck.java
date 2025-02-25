import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private List<Card> cards;

    // Initializing and populate the deck using constructor
    public Deck() {
        cards = new ArrayList<>();
        String[] suits = {"Diamond", "Chase", "Music", "Spades"};
        String[] values = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Linda", "Kamsi", "Charles", "Dike"};

        // Add all cards to the deck
        for (String suit : suits) {
            for (String value : values) {
                cards.add(new Card(suit, value));
            }
        }
    }

    // Method to shuffle the deck game
    public void shuffle() {
        Collections.shuffle(cards);
    }

    // Method to deal a card from the deck game
    public Card dealCard() {
        if (cards.isEmpty()) {
            return null; // Cards to deal finished
        }
        return cards.remove(0); // Deal the top card
    }
}
