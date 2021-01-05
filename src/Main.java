import factory.*;
import singleton.Singleton;


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


/**
 * Factory Pattern
 *
public class Main {
    public static void main(String[] args) {

        Factory factory = new SubjectFactory();
        Subject subject1 = factory.createFactory("프로그래밍");
        Subject subject2 = factory.createFactory("영어");

        subject1.describe();
        subject2.describe();

        English english = English.Factory.create("영어");
        english.describe();

        Program program = Program.Factory.create("프로그래밍");
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
                .setName("홍길동")
                .setLessons("국어","수학","영어")
                .build();

        System.out.println(student);
    }
}
 **/
