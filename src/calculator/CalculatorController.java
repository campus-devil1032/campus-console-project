package calculator;

public class CalculatorController {

	private CalculatorModel model = new CalculatorModel();
	private CalculatorView view = new CalculatorView();
	
	public CalculatorController(CalculatorModel model, CalculatorView view) {
		this.model = model;
		this.view = view;
	}
	
	public void setCalcOperator() {
		model.setInputTest();
		model.setDivdeLine();
	}
}
