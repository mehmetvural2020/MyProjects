package Game_HeadsOrTails;

import java.util.Random;

class Player {
    private String playerName;
    private int score;
    Coin coin;
    private CoinSides guess;

    public Player(String playerName, Coin coin) {
        this.playerName = playerName;
        this.coin = coin;
    }

    public CoinSides getGuess() {
        return guess;
    }

    public void setGuess(CoinSides guess) {
        this.guess = guess;
    }

    public Player(String playerName) {
        this.playerName = playerName;
    }

    public Coin getCoin() {
        return coin;
    }

    public String getPlayerName() {
        return playerName;
    }

    public int getScore() {
        return score;
    }
    public void incrementScore(){
        this.score++;
    }
    public void decresementScore(){
        this.score = this.score--;
    }

    public Player() {
    }

    public void playGuess(){
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(2);   // 0-1
        guess = CoinSides.values()[randomNumber];
        System.out.println(playerName + " guessed value : " + guess);
    }
}
