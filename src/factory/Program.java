package factory;

public class Program implements Subject{
    String name;

    public Program(String name) {
        this.name = name;
    }

    @Override
    public void describe() {
        System.out.println(name);
    }

    public static class Factory{
        public static Program create(String name){
            return new Program(name);
        }
    }
}
