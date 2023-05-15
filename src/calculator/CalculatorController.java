package calculator;

public class CalculatorController {

	private CalculatorModel model = new CalculatorModel();
	private CalculatorView view = new CalculatorView();
	private String scan;
	private double answer;
	
	public CalculatorController(CalculatorModel model, CalculatorView view) {
		this.model = model;
		this.view = view;
	}
	
	public void setIntro() {
		view.setInputTest();
	}
	
	
	public void getIntro() {
		this.scan = view.getInputTest();
	}
	
	public void getDivideLine() {
		model.setDivdeLine(this.scan);
	}
	
	public void getAnswer() {
		this.answer = model.getAnswer();
	}
	

	
	public void setCalcOperator() {
		getIntro();
		getDivideLine();
		model.setCalculator();
		model.setCalcMethod();
		getAnswer();
		view.setResults(this.answer);
	}
	
	
}
