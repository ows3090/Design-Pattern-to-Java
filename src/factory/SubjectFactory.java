package factory;

public class SubjectFactory implements Factory {

    @Override
    public Subject createFactory(String name) {
        Subject subject = null;
        switch (name){
            case "영어":
                subject = new English(name);
                break;
            case "프로그래밍":
                subject = new Program(name);
                break;
        }
        return subject;
    }
}
