import calculator.CalculatorController;
import calculator.CalculatorModel;
import calculator.CalculatorView;

public class MVCMain {
public static void main(String[] args) {

	
	
	
	CalculatorModel calcModel = new CalculatorModel();
	CalculatorView calcView = new CalculatorView();
	CalculatorController calcController = new CalculatorController(calcModel, calcView);
	
	calcController.setCalcOperator();
}

}
