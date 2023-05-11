package gugudan_mvc;

public class Main {

	public static void main(String[] args) {
		GugudanModel1 model = new GugudanModel1();
		GugudanView view = new GugudanView();
		GugudanController controller = new GugudanController(model, view);
		
		controller.run();
	}

}
