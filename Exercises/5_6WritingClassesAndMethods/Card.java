import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Card {
    private String suit;
    private String value;

    // Constructor to initialize suit and value of the card
    public Card(String suit, String value) {
        this.suit = suit;
        this.value = value;
    }

    // Method to get the suit of the card
    public String getSuit() {
        return suit;
    }

    // Method to get the value of the card
    public String getValue() {
        return value;
    }

    // Method to return a string representation of the card

    public String toString() {
        return value + " of " + suit;
    }
}

