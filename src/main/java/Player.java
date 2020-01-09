import java.util.ArrayList;

public class Player {
    private String name;
    private ArrayList<Card> cards;

    public Player(String name) {
        this.name = name;
        this.cards = new ArrayList<Card>();
    }

    public int playerCardCount() {
        return this.cards.size();
    }


    public void addCard(Card card) {
        cards.add(card);
    }
}
