package template;

public class Wizard extends Hero {
    private int mp =  50;

    public Wizard(String name) {
        super(name);
    }

    @Override
    public void attack(Character character) {
        mp-=5;
    }
}
