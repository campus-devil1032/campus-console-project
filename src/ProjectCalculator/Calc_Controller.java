package ProjectCalculator;

import java.util.Scanner;

public class Calc_Controller {

	private static Calc_Model model;
	private static Calc_View view;

	public Calc_Controller(Calc_Model model, Calc_View view) {
		this.model = model;
		this.view = view;

	}

	public void run() {

		Calc_View.firstScreen();

		Scanner sc = new Scanner(System.in);

		while (true) {
			try {
				view.inputFirstNum();
				int firstNum = sc.nextInt();
				model.setFirstNum(firstNum);

				view.inputOperator();
				String operator = sc.next();
				model.setOperator(operator);

				view.inputSecondNum();
				int secondNum = sc.nextInt();
				model.setSecondNum(secondNum);

				int result = model.calculate();
				view.printCalculationResult(result);

			} catch (Exception e) {
				view.errorMessage();
				run();
			}

		}

	}
}
