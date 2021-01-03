import builder.Student;

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
