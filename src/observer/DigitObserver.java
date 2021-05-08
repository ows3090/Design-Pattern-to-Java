package observer;

public class DigitObserver implements Observer {

    @Override
    public void update(int number) {
        System.out.println("Number : "+number);
    }
}
