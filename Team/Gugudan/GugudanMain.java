package Team.Gugudan;

public class  GugudanMain { 
	public static void main(String [] args) {
	GugudanModel model = new GugudanModel();
	GugudanView view = new GugudanView();
	GugudanController controller = new GugudanController(view, model);
	controller.run();
	}
}
	