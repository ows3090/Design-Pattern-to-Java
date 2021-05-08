package template;

public class Slime extends Monster {

    public Slime(char prefix) {
        super(prefix);
    }

    @Override
    public void attack(Character character) {
        System.out.println("슬라임 "+getPrefix() + "가 " +character.getName() + "을 공격했다");
    }

    @Override
    public String getName() {
        return "슬라임 "+getPrefix();
    }
}
