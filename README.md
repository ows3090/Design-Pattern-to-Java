
# Java Design Pattern

I will introduce some java design patterns. 
By learning this, you can effectively design and design components.
It can also increase the readability of your code and can help with maintenance.

<br>

In this order, I will introduce several design pattern methods.

1. [Builder](#Builder-Pattern) 
2. [Factory](#Factory-Pattern) 
3. [Singleton](#Singleton-Pattern) 
4. [Adapter](#Adapter-Pattern)
5. [Decorator](#Decorator-Pattern)
6. [command](#Command-Pattern)
7. [Memento](#Memento-Pattern)
8. [Observer](#Observer-Pattern)
9. [Strategy](#Strategy-Pattern)
10.[Template](#Template-Pattern)

<br>

### Builder Pattern

- It is mainly used as a pattern for creating classes with many member variables.
- It is a way to build a large one by setting the necessary information one by one.
- ex) NotificationCompat, StringBuilder

#### Example
```java
public class Student {
    private String sInfo;

    @Override
    public String toString() {
        return sInfo;
    }

    public static class Builder{
        private int id;
        private String name;
        private String[] lessons;

        public Builder setID(int id){
            this.id = id;
            return this;
        }

        public Builder setName(String name){
            this.name = name;
            return this;
        }

        public Builder setLessons(String... lessons){
            this.lessons = lessons;
            return this;
        }

        public Student build(){
            Student student = new Student();

            StringBuilder sb = new StringBuilder();
            sb.append("ID : ").append(id).append("\n");
            sb.append("Name : ").append(name).append("\n");
            sb.append("Lesson").append("\n");
            
            for(String lesson : lessons){
                sb.append(" - ").append(lesson).append("\n");
            }
            
            student.sInfo = sb.toString();
            return student;
        }
    }
}
```

#### Usage
```java
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
```
<br>

### Factory Pattern

- This pattern is mainly used to reduce the degree of coupling between objects.
- With the factory pattern, object creation is encapsulated, and instance of a class are determined by the subclass.
- If the implementation is based on concrete classes, the possibility of modifying the code later is high and flexibility is significantly reduced.
- ex) Fragment

#### Example
```java
public class SubjectFactory implements Factory {
    @Override
    public Subject createFactory(String name) {
        Subject subject = null;
        switch (name){
            case "English":
                subject = new English(name);
                break;
            case "Programming":
                subject = new Program(name);
                break;
        }
        return subject;
    }
}
```

#### Usage
```java
public class Main {
    public static void main(String[] args) {
	
	// Common
        Factory factory = new SubjectFactory();
        Subject subject1 = factory.createFactory("Programming");
        Subject subject2 = factory.createFactory("English");

        subject1.describe();
        subject2.describe();
	
	// Android
        English english = English.Factory.create("English");
        english.describe();

        Program program = Program.Factory.create("Programming");
        program.describe();

    }
}
```
<br>

### Singleton Pattern

- This pattern usually only creates an instance once and uses the same instance across the entire region.
- It makes it easier for instances of different classes to share data.
- However, if the singleton instance is called and used by multiple classes, the coupling is high.
- In addition, synchronization processing is essential in a multithreaded environment.
- ex) Database, registry

#### Example
```java
public class Singleton {

    private static Singleton instance;
    
    private Singleton() {
    }

    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}
```
<br>

### Adapter Pattern

- This is primarily used when converting one class interface to another.
- Maintenance is facilitated with this pattern.
- ex) ListView, RecyclerView 

#### Example
```java
public class GalaxyAdapter implements IPhone {

    private Galaxy galaxy;

    public GalaxyAdapter(Galaxy galaxy) {
        this.galaxy = galaxy;
    }

    @Override
    public void printIModel() {
        galaxy.showGModel();
    }

    @Override
    public void printIVersion() {
        galaxy.showGVersion();
    }
}
```

#### Usage
```java
class Main{
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
```

<br>

### Decorator Pattern

- This pattern is mainly used when the main class implements additional functionality without changes.
- It is process of creating a large class through inheritance and composition of additional classes in a small class.
- ex) Android UI, swift UI, flutter

<br>

### Command Pattern

- Using this pattern facilitates the use of command and makes it easier to manage command.
- This example uses swing library.

<br>

### Memento Pattern

- Using this pattern, you can implement the ability to save a certain state.
- By seperating UI and function, it is easy for maintenance and testing.

<br>

### Observer Pattern

- A pattern that is common in Android and it defines behavior by observing a specific object.
- Becase of using interface or abstract class, It is not necessary to know what you are observing.
- ex) OnClickListener, LiveData, Rxjava

#### Example
```java
public interface Observer {
    void update(int number);
}

public class DigitObserver implements Observer {

    @Override
    public void update(int number) {
        System.out.println("Number : "+number);
    }
}
```

#### Usage
```java
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
```

<br>

 








