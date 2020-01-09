import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertFalse;

public class GameTest {

    private Player player1;
    private Player player2;
    private Deck deck;
    private Game game;
    private Card card1;
    private Card card2;
    private Card card3;
    private Card card4;


    @Before
    public void before() {
        card1 = new Card(SuitType.DIAMONDS, RankType.ACE);
        card2 = new Card(SuitType.SPADES, RankType.ACE);
        card3 = new Card(SuitType.DIAMONDS, RankType.NINE);
        card4 = new Card(SuitType.DIAMONDS, RankType.TEN);
        player1 = new Player("Eugene");
        player2 = new Player("Juan");
        deck = new Deck();
        game = new Game();
    }

    @Test
    public void eachPlayerHasACard() {
        game.dealCardToPlayers(player1, player2);
        assertEquals(1, player1.playerCardCount());
        assertEquals(1, player2.playerCardCount());
    }

    @Test
    public void playerWithHigherCardRankWins() {
        player1.addCard(card4);
        player2.addCard(card3);
        Player winner = game.evaluteWinner(player1, player2);
        assertEquals(player1, winner);
    }

    @Test
    public void playerWithHigherCardSuitWins() {
        player1.addCard(card1);
        player2.addCard(card2);
        Player winner = game.evaluteWinner(player1, player2);
        assertEquals(player2, winner);
    }


}