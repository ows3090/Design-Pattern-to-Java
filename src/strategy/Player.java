package strategy;

public class Player {
    private Strategy strategy;
    private String name;
    private int life = 3;

    public Player(String name, Strategy strategy) {
        this.strategy = strategy;
        this.name = name;
    }

    public Hand nextHand(){
        return strategy.nextHand();
    }
}
