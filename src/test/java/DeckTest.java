import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.*;

public class DeckTest {

    private Deck deck;
    private Card card;
    private Player player;

    @Before
    public void before() {
        deck = new Deck();
        card = new Card(SuitType.DIAMONDS, RankType.ACE);
        player = new Player("Eugene");

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
    public void shouldShuffleCards() {
        deck.populateDeck();
        Deck deck1 = new Deck();
        deck.populateDeck();
        deck.shuffleCards();
        boolean isShuffled = ((deck.getDeck() == deck1.getDeck()) ? false : true);
        assertTrue(isShuffled);
    }

    @Test
    public void shouldDealCardFromDeck() {
        deck.populateDeck();
        deck.shuffleCards();
        deck.dealCard(player);
        assertEquals(1, player.playerCardCount());
    }

}
