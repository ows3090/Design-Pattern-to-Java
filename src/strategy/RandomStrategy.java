package strategy;

import java.util.Random;

public class RandomStrategy implements Strategy {
    @Override
    public Hand nextHand() {
        return Hand.getHand(new Random().nextInt(3));
    }
}
