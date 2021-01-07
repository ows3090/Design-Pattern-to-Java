package adapter;

public class GalaxyAdapter implements IPhone {

    private Galaxy galaxy;

    public GalaxyAdapter(Galaxy galaxy) {
        this.galaxy = galaxy;
    }

    @Override
    public void printIModel() {
        galaxy.showGModel();
    }

    @Override
    public void printIVersion() {
        galaxy.showGVersion();
    }
}
