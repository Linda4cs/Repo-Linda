public class CardGame {
    public static void main(String[] args) {
        // Create and shuffle the deck
        Deck deck = new Deck();
        deck.shuffle();

        // Deal five random cards
        System.out.println("Dealing 5 random cards:");
        for (int i = 0; i < 3; i++) {
            Card card = deck.dealCard();
            if (card != null) {
                System.out.println(card);
            }
        }
    }
}
