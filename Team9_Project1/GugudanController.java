package Team9_Project1;

public class GugudanController {
    private GugudanModel model;
    private GugudanView view;

    public GugudanController(GugudanModel model, GugudanView view) {
        this.model = model;
        this.view = view;
    }

    public void showTable(int num) {
        model = new GugudanModel(num);
        String table = model.GetTable();
        view.displayTable(table);
    }

}
