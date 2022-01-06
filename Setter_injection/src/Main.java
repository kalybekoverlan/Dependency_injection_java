public class Main {

    static int step;
    public static void main(String[] args) {

        Viewer viewer = new Viewer();
        Controller controller = new Controller();
        Model model = new Model();

        viewer.setController(controller);
        controller.setModel(model);
        model.setViewer(viewer);

    }
}
