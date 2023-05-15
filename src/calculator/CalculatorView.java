package calculator;

import java.util.Scanner;

public class CalculatorView {
	private String stScan;
	private Scanner scan = new Scanner(System.in);
	
	
	
	public void setInputTest() {
		
		System.out.println("계산에 입력할 수식을 넣으세요 예) 1 + 2 = ,  34 + 5 * 23 =");
		String stScan = this.scan.nextLine();
		System.out.println(stScan.toString());
		this.stScan = stScan;
	}
	
	public String getInputTest() {
		return this.stScan;
	}
	
	public void setResults(double answer) {
		System.out.println("계산기 결과는  " + answer + " 입니다");
	}
}
