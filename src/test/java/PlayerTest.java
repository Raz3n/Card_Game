import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class PlayerTest {
    private Player player;
    private Card card;

    @Before
    public void before() {
        player = new Player("Eugene");
        card = new Card(SuitType.DIAMONDS, RankType.ACE);
    }

    @Test
    public void shouldCountPlayerCard() {
        assertEquals(0, player.playerCardCount());
    }

    @Test
    public void shouldAddCardToPlayer() {
        player.addCard(card);
        assertEquals(1, player.playerCardCount());
    }

}
