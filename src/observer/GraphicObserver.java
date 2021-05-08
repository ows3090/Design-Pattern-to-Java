package observer;

public class GraphicObserver implements Observer {

    @Override
    public void update(int number) {
        for(int i=0;i<number;i++){
            System.out.print("*");
        }
        System.out.println();
    }
}
