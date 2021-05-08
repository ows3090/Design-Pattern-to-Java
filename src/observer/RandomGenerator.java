package observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomGenerator {
    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer){
        observers.add(observer);
    }

    public void removeObserver(Observer observer){
        observers.remove(observer);
    }

    public void execute() {
        int num = new Random().nextInt(50);
        observers.forEach(observer -> observer.update(num));
    }
}
