package Team9_Project1;

public class GugudanController {
    private GugudanModel model;
    private GugudanView view;

    public GugudanController() {
        this.model = new GugudanModel();
        this.view = new GugudanView();
    }

    public void showTable() {
        view.runGugudan();
        String table = model.GetTable(view.getNum());
        view.displayTable(table);
    }

}