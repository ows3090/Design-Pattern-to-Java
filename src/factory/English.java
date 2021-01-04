package factory;

public class English implements Subject{
    String name;

    public English(String name) {
        this.name = name;
    }

    @Override
    public void describe() {
        System.out.println(name+"를 수강합니다!!");
    }

    public static class Factory{
        public static English create(String name){
            return new English(name);
        }
    }
}
