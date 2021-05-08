import Decorator.FullBorder;
import Decorator.Scaffold;
import Decorator.SideBorder;
import Decorator.TextWidget;
import adapter.GalaxyAdapter;
import adapter.MyGalaxy;
import adapter.MyIPhone;
import command.DrawingApp;
import observer.DigitObserver;
import observer.GraphicObserver;
import observer.Observer;
import observer.RandomGenerator;
import strategy.*;
import template.Hero;
import template.Monster;
import template.Slime;
import template.SuperHero;

public class Main{
    public static void main(String[] args) {
        Hero hero = new Hero("용사");
        Monster monster = new Slime('A');

        SuperHero superHero = new SuperHero("슈퍼맨");
        superHero.attack(monster);
        superHero.setFlying(true);

        hero.attack(monster);
    }
}

/**
 * Strategy Pattern
 *
public class Main{
    public static void main(String[] args) {
        Player player1 = new Player("player1",new RockStrategy());
        Player player2 = new Player("player2", new PaperStrategy());
        Player player3 = new Player("player3",new RandomStrategy());
        Player player4 = new Player("player4", () -> Hand.Scissors);

        for(int i=0;i<10;i++){
            System.out.println(player1.nextHand().fight(player4.nextHand()));
        }

    }
}
 **/

/**
 * Observer Pattern
 *
public class Main{
    public static void main(String[] args) {
        RandomGenerator randomGenerator = new RandomGenerator();

        Observer observer1 = new DigitObserver();
        Observer observer2 = new GraphicObserver();
        Observer observer3 = number -> {
            for(int i=0;i<number;i++){
                System.out.print("=");
            }
            System.out.println();
        };

        randomGenerator.addObserver(observer1);
        randomGenerator.addObserver(observer2);
        randomGenerator.addObserver(observer3);

        randomGenerator.execute();
        randomGenerator.execute();
    }
}
**/

/**
 * Command Pattern
 *
public class Main {
    public static void main(String[] args) {
        new DrawingApp("Command");
    }
}
 **/

/**
 * Decorator Pattern
 *
public class Main{
    public static void main(String[] args) {

        new Scaffold(
                new FullBorder(
                        new SideBorder(
                                new FullBorder(
                                        new SideBorder(
                                                new TextWidget("hello world")
                                        )
                                )
                        )
                )
        );
    }
}
**/

/**
 * Adapter Pattern
 *

 public class Main{
    public static void main(String[] args){

        MyIPhone iPhone = new MyIPhone();
        iPhone.printIModel();
        iPhone.printIVersion();

        MyGalaxy gallery = new MyGalaxy();
        GalaxyAdapter adapter = new GalaxyAdapter(gallery);
        adapter.printIModel();
        adapter.printIVersion();

    }
}
 **/

/**
 * Singleton Pattern
 *
public class Main {
    public static void main(String[] args) {

        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();

        if(singleton == singleton1){
            System.out.println("같음");
        }else{
            System.out.println("다름");
        }

    }
}
 **/


/**
 * Factory Pattern
 *
public class Main {
    public static void main(String[] args) {

        Factory factory = new SubjectFactory();
        Subject subject1 = factory.createFactory("Programming");
        Subject subject2 = factory.createFactory("English");

        subject1.describe();
        subject2.describe();

        English english = English.Factory.create("English");
        english.describe();

        Program program = Program.Factory.create("Programming");
        program.describe();

    }
}
 **/


/**
 * Builder Pattern
 *
public class Main {
    public static void main(String[] args) {
        Student student = new Student.Builder()
                .setID(2014103251)
                .setName("Oh won seok")
                .setLessons("Korean","Math","English")
                .build();

        System.out.println(student);
    }
}
 **/
