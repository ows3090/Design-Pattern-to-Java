
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
7. Memento
8. Observer
9. Strategy
10. Template Method

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
            sb.append("학번 : ").append(id).append("\n");
            sb.append("이름 : ").append(name).append("\n");
            sb.append("수업 과목").append("\n");
            
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
                .setName("홍길동")
                .setLessons("국어","수학","영어")
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

<br>

### Singleton Pattern

- This pattern usually only creates an instance once and uses the same instance across the entire region.
- It makes it easier for instances of different classes to share data.
- However, if the singleton instance is called and used by multiple classes, the coupling is high.
- In addition, synchronization processing is essential in a multithreaded environment.
- ex) Database, registry

<br>

### Adapter Pattern

- This is primarily used when converting one class interface to another.
- Maintenance is facilitated with this pattern.
- ex) ListView, RecyclerView 

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







