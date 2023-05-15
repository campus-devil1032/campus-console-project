package calculator;

import java.util.ArrayList;

public class CalculatorModel {

	private String[] divdeString;
	private ArrayList<String> onlyNumber = new ArrayList<String>();
	private ArrayList<String> calcSimbol = new ArrayList<String>();
	private ArrayList<Double> intNumber = new ArrayList<Double>();
	private Double answer = (double) 0;

	public void setDivdeLine(String scan) {
		this.divdeString = scan.split("\\s+");

		// 번호만 리스트에 넣기
		for (int j = 0; j < this.divdeString.length; j = j + 2) {
			this.onlyNumber.add(this.divdeString[j]);
		}

		// 특수 기호 + - * / = 만 넣기
		for (int j = 1; j < this.divdeString.length; j = j + 2) {
			this.calcSimbol.add(this.divdeString[j]);
		}
	}

	//
	public void setCalculator() {
		for (String intNum : this.onlyNumber) {
			intNumber.add(Double.valueOf(intNum));
		}
	}

	// 정답 구하기
	public void setCalcMethod() {
		// check size
		char[] chars = this.calcSimbol.toString().toCharArray();
		int i = 0;

		if (this.calcSimbol.toString().contains("=") == true) {
			for (char symbol : chars) {

				if (symbol == '+') {

					this.answer = this.intNumber.get(0) + this.intNumber.get(i + 1);
					this.intNumber.set(0, this.answer);
					i++;
					continue;
				}

				else if (symbol == '-') {
					this.answer = this.intNumber.get(0) - this.intNumber.get(i + 1);
					this.intNumber.set(0, this.answer);
					i++;
					continue;
				}

				else if (symbol == '*') {
					this.answer = this.intNumber.get(0) * this.intNumber.get(i + 1);
					this.intNumber.set(0, this.answer);
					i++;
					continue;
				}

				else if (symbol == '/') {
					this.answer = this.intNumber.get(0) / this.intNumber.get(i + 1);
					this.intNumber.set(0, this.answer);
					i++;
					continue;
				}

			}
		} else {
			 throw new NumberFormatException(" = 을 마지막에 써주세요.  = 을 안쓰면 계산기 잘동 안됩니다");
		}

	}

	public double getAnswer() {
		return this.answer;
	}

}
