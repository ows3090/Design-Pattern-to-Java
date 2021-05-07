package builder;

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
