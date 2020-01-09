import java.util.ArrayList;
import java.util.Collections;

public class Deck {

    private ArrayList<Card> deck;

    public Deck() {
        this.deck = new ArrayList<Card>();
    }

    public ArrayList<Card> getDeck() {
        return deck;
    }

    public int cardCount() {
        return this.deck.size();
    }

    public void addCard(Card card) {
        this.deck.add(card);
    }

    public void populateDeck() {
        for (RankType rank : RankType.values()) {
            for (SuitType suit : SuitType.values()) {
                Card card = new Card(suit, rank);
                addCard(card);
            }
        }
    }

    public void shuffleCards() {
        Collections.shuffle(deck);
    }

    public void dealCard(Player player) {
        player.addCard(deck.remove(0));
    }
}
