public class Model {

    private Viewer viewer;

    public Model(Viewer viewer) {
        System.out.println("Start model " + (++Main.step));
        this.viewer = viewer;
        System.out.println("end model");
        return;
    }
}
