public class Controller {

    private Model model;

    public Controller(Viewer viewer) {
        System.out.println("Start controller " + (++Main.step));
        model = new Model(viewer);
        System.out.println("end controller");
        return;
    }
}
