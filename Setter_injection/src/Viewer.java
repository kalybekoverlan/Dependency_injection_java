public class Viewer {

    private Controller controller;

    public Viewer() {
        System.out.println("Start viewer " + (++Main.step));
        System.out.println("end viewer");
    }

    public void setController(Controller controller) {
        this.controller = controller;
    }

}
