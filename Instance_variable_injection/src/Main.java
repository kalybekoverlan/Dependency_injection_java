public class Main {

    static int step;
    public static void main(String[] args) {

        Viewer viewer = new Viewer();
        Controller controller = new Controller();
        Model model = new Model();

        viewer.controller = controller;
        controller.model = model;
        model.viewer = viewer;

    }
}
