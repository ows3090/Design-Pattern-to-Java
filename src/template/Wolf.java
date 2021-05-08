package template;

public class Wolf extends Monster{

    public Wolf(char prefix) {
        super(prefix);
    }

    @Override
    public void attack(Character character) {

    }

    @Override
    public String getName() {
        return "늑대" + getPrefix();
    }
}
