package Team9_Project1;

/**
 * 
 * 두 개의 실수 값을 입력 받아 "+, -, *, /" 네가지 연산을 수행합니다.
 * 
 * @param operator
 */

public class CalculatorModel {
	private double num1;
	private double num2;
	private String operator;
	private double result;
	
	public double calculate(double num1, double num2, String operator) {
		switch (operator) {
			case "+":
				result = num1 + num2;
				break;
			case "-":
				result = num1 - num2;
				break;
			case "*":
				result = num1 * num2;
				break;
			case "/":
				result = num1 / num2;
				break;
		}
		return result;
	}

	public double getNum1() {
		return num1;
	}

	public void setNum1(double num1) {
		this.num1 = num1;
	}

	public double getNum2() {
		return num2;
	}

	public void setNum2(double num2) {
		this.num2 = num2;
	}

	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

}
