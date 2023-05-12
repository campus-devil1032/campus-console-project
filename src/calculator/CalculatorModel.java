package calculator;

import java.util.Scanner;

public class CalculatorModel {
	private String stScan;
	private String[] divdeString;
	private StringBuilder onlyNumber = new StringBuilder();
	private StringBuilder calcSimbol = new StringBuilder();

	public void setInputTest() {
		Scanner scan = new Scanner(System.in);
		System.out.println("계산에 입력할 수식을 넣으세요 예) 1 + 2 = ,  34 + 5 * 23 =");
		String stScan = scan.nextLine();
		System.out.println(stScan.toString());
		this.stScan = stScan;
	}
	
	public void setDivdeLine() {
		this.divdeString = this.stScan.split("\\s+");
		
//		for (int i = 0; i < this.divdeString.length; i++) {			
//			System.out.println(this.divdeString[i]);
//			
//		
//		}
		// 번호만 리스트에 넣기
		for (int j = 0; j < this.divdeString.length; j = j + 2) {			
			this.onlyNumber.append(this.divdeString[j]);	
		}
		
		// 특수 기호 + - * / = 만 넣기
		for (int j = 1; j < this.divdeString.length; j = j + 2) {			
			this.calcSimbol.append(this.divdeString[j]);	
		}
		
		System.out.println(this.onlyNumber.toString());
		System.out.println(calcSimbol.toString());
		
	}
}
