import Decorator.FullBorder;
import Decorator.Scaffold;
import Decorator.SideBorder;
import Decorator.TextWidget;
import adapter.GalaxyAdapter;
import adapter.MyGalaxy;
import adapter.MyIPhone;
import command.DrawingApp;


public class Main {
    public static void main(String[] args) {
        new DrawingApp("Command");
    }
}

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
