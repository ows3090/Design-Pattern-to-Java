package adapter;

public class MyGalaxy implements Galaxy {

    @Override
    public void showGModel() {
        System.out.println("갤럭시 20를 사용합니다");
    }

    @Override
    public void showGVersion() {
        System.out.println("Android 11");
    }
}
