public class Controller {

    private Model model;

    public Controller() {
        System.out.println("Start controller " + (++Main.step));
        System.out.println("end controller");
    }

    public void setModel(Model model) {
        this.model = model;
    }
}
