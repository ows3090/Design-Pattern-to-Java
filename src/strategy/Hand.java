package strategy;

public enum Hand {
    Rock(0), Paper(1), Scissors(2);

    private final int index;

    Hand(int index) {
        this.index = index;
    }

    public static Hand getHand(int value){
        return values()[value];
    }

    public Result fight(Hand other){
        if(this == other){
            return Result.DRAW;
        }else if(this.index - other.index == 1 || this.index == 0 && other.index == 2){
            return Result.WIN;
        }
        return Result.LOSE;
    }
}
