package calculator;

import java.util.ArrayList;
import java.util.Scanner;

public class CalculatorModel {
	private String stScan;
	private String[] divdeString;
	private ArrayList<String> onlyNumber = new ArrayList<String>();
	private ArrayList<String> calcSimbol = new ArrayList<String>();
	private ArrayList<Double> intNumber = new ArrayList<Double>();
	private ArrayList<Integer> symbolNumber = new ArrayList<Integer>();
	private Double answer;
	public void setInputTest() {
		Scanner scan = new Scanner(System.in);
		System.out.println("계산에 입력할 수식을 넣으세요 예) 1 + 2 = ,  34 + 5 * 23 =");
		String stScan = scan.nextLine();
		System.out.println(stScan.toString());
		this.stScan = stScan;
	}
	
	public void setDivdeLine() {
		this.divdeString = this.stScan.split("\\s+");
		
		
		// 번호만 리스트에 넣기
		for (int j = 0; j < this.divdeString.length; j = j + 2) {			
			this.onlyNumber.add(this.divdeString[j]);	
		}
		
		// 특수 기호 + - * / = 만 넣기
		for (int j = 1; j < this.divdeString.length; j = j + 2) {			
			this.calcSimbol.add(this.divdeString[j]);	
		}
		
		System.out.println(this.onlyNumber.toString());
		System.out.println(calcSimbol.toString());
		
	}
	
	// 
	public void setCalculator() {
		for (String intNum : this.onlyNumber) {
			intNumber.add(Double.valueOf(intNum));
		}
		
		
		System.out.println(intNumber);
	}
	
	public void setCalcMethod() {
		// check size
		int size = this.calcSimbol.size();
		
		// string to char
		char[] chars = this.calcSimbol.toString().toCharArray();

		
		for (int i = 0; i < size; i++) {
			for (char symbol : chars) {
			if (symbol == '+' ) {
				this.answer = this.intNumber.get(0) + this.intNumber.get(1);
				if (symbol == '=') {
					break;
				}
			}
			
			if (symbol == '-' ) {
				this.answer = this.intNumber.get(0) - this.intNumber.get(1);
				if (symbol == '=') {
					break;
				}
			}
			
			if (symbol == '*' ) {
				this.answer = this.intNumber.get(0) * this.intNumber.get(1);
				if (symbol == '=') {
					break;
				}
			}
			
			if (symbol == '/' ) {
				this.answer = this.intNumber.get(0) / this.intNumber.get(1);
				if (symbol == '=') {
					break;
				}
			}
			}
		}
		
		System.out.println(answer);
	}
	
	
}
