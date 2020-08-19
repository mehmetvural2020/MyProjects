package Game_HeadsOrTails;

import java.util.Random;
import java.util.Scanner;
enum CoinSides {HEADS, TAILS};

public class Coin {

    private CoinSides flip;
    public Coin() {
    }

    public void setFlip(CoinSides flip) {
        this.flip = flip;
    }

    public CoinSides getFlip() {
        return flip;
    }

    public void flipped() {
        Random rand = new Random();
         int i = rand.nextInt(2);
         this.flip = CoinSides.values()[i];
        System.out.println("\nCoin flip's Value : " + flip);
    }

}




