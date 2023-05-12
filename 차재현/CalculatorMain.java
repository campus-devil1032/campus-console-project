package Cal;

public class CalculatorMain {

	public static void main(String[] args) {
		CalculatorModel model = new CalculatorModel();
		CalculatorView view = new CalculatorView();
		CalculatorController controller = new CalculatorController(model, view);
		while (true) {
			controller.calculate();
		}
	}
}