package factory;

public class Program implements Subject{
    String name;

    public Program(String name) {
        this.name = name;
    }

    @Override
    public void describe() {
        System.out.println(name+" 수강합니다");
    }

    public static class Factory{
        public static Program create(String name){
            return new Program(name);
        }
    }
}
