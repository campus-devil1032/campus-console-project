package calculator;

import java.util.Scanner;

public class CalculatorView {
	private String stScan;
	private Scanner scan = new Scanner(System.in);
	
	
	
	public void setInputTest() {
		
		System.out.println("계산에 입력할 수식을 넣으세요 예) 1 + 2 = ,  34 + 5 * 23 =");
		String stScan = this.scan.nextLine();
		if (stScan.contains("+") || stScan.contains("-") || stScan.contains("*") || stScan.contains("/")) {
			System.out.println(stScan.toString());
			this.stScan = stScan;
		} else {
			 throw new NumberFormatException("양식에 맞춰 제대로 정보를 기입해주세요 ");
		}
			
			
		
	}
	
	public String getInputTest() {
		return this.stScan;
	}
	
	public void setResults(double answer) {
		System.out.println("계산기 결과는  " + answer + " 입니다");
	}
}
