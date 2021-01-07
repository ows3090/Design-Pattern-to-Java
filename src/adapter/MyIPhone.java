package adapter;

public class MyIPhone implements IPhone{

    @Override
    public void printIModel() {
        System.out.println("IPhone 12를 사용합니다");
    }

    @Override
    public void printIVersion() {
        System.out.println("IOS 14.3");
    }
}
