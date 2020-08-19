package HeadsOrTails_Game;

class TestCoin {
    public static void main(String[] args) {
        Coin coin = new Coin();

        Player p1 = new Player("James");
        Player p2 = new Player("Alex");

        playGame(p1, p2, coin);

    }
    public static void playGame(Player player1, Player player2, Coin coin) {

        while (true) {

            coin.flipped();

            player1.playGuess();
            player2.playGuess();

            checkPlayerGuess(player1, coin);
            checkPlayerGuess(player2, coin);

            System.out.println("\n" + player1.getPlayerName() + "\'s Score : " + player1.getScore());
            System.out.println(player2.getPlayerName() + "\'s Score : " + player2.getScore());

            if (player1.getScore() == 3 || player2.getScore() ==3){
                winnerCheck(player1, player2);
                break;
            }
        }
    }

    static void checkPlayerGuess(Player player, Coin coin){
        if (coin.getFlip() == player.getGuess()){
            player.incrementScore();
        }
        else{
            player.decresementScore();
        }
    }
    static void winnerCheck(Player player1, Player player2){
        if (player1.getScore() == player2.getScore()){
            System.out.println("\nNo winner, this game scoreless");
        }
        else if (player1.getScore() > player2.getScore()){
            System.out.println("\nThe winner is " + player1.getPlayerName());
        }
        else{
            System.out.println("\nThe winner is " + player2.getPlayerName());
        }

    }
}
