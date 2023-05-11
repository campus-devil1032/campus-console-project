package gugudan_mvc;

import java.util.Scanner;

public class GugudanController {

	private GugudanModel1 model;
	private GugudanView view;

	public GugudanController(GugudanModel1 model, GugudanView view) {
		this.model = model;
		this.view = view;
	}

	public void run() {
		Scanner scanner = new Scanner(System.in);

		view.printInputDan();
		int dan = scanner.nextInt();

		model.setDan(dan);
		model.calculate();

		int[] result = model.getResult();

		view.printResult(result);
	}

}
