public class Game {

    private Deck deck;

    public Game() {
        this.deck = new Deck();
        deck.getShuffledDeck();
    }


    public void dealCardToPlayers(Player player1, Player player2) {
        deck.dealCard(player1);
        deck.dealCard(player2);
    }

    public Player evaluteWinner(Player player1, Player player2) {
        int player1cardRank = player1.getCards().get(0).getRank().getRankValue();
        int player2cardRank = player2.getCards().get(0).getRank().getRankValue();
        int player1cardSuit = player1.getCards().get(0).getSuit().getSuitValue();
        int player2cardSuit = player2.getCards().get(0).getSuit().getSuitValue();



        if(player1cardRank > player2cardRank){
            return player1;
        } else if (player1cardRank < player2cardRank){
            return player2;
        } else {
            if(player1cardSuit > player2cardSuit) {
                return player1;
            } else {
                return player2;
            }

        }
    }
}
