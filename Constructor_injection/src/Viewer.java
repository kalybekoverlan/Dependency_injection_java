public class Viewer {

    public Viewer() {
        System.out.println("Start viewer " + (++Main.step));
        Controller controller = new Controller(this);
        System.out.println("end viewer");

    }

}
