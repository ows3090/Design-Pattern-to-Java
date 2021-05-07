package factory;

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
