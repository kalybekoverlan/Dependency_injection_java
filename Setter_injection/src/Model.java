public class Model {

    private Viewer viewer;

    public Model() {
        System.out.println("Start model " + (++Main.step));
        System.out.println("end model");
    }

    public void setViewer(Viewer viewer) {
        this.viewer = viewer;
    }
}
