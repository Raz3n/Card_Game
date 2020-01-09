import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class DeckTest {

    private Deck deck;
    private Card card;

    @Before
    public void before() {
        deck = new Deck();
        card = new Card(SuitType.DIAMONDS, RankType.ACE);

    }

    @Test
    public void deckIsEmpty() {
        assertEquals(0, deck.cardCount());
    }


    @Test
    public void shouldAddCardToDeck() {
        deck.addCard(card);
        assertEquals(1, deck.cardCount());
    }

    @Test
    public void shouldPopulateDeck() {
        deck.populateDeck();
        assertEquals(52, deck.cardCount());
    }

    @Test


}
