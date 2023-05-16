package calculator;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

public class CalculatorModel {

	private String[] divdeString;
	private ArrayList<String> onlyNumber = new ArrayList<String>();
	private Deque<String> calcSimbol = new LinkedList<String>();
	private Deque<Double> intNumber = new LinkedList<Double>();
	private Double answer = (double) 0;

	public void setDivdeLine(String scan) {
		divdeString = scan.split("\\s+");

		// 번호만 리스트에 넣기
		for (int j = 0; j < divdeString.length; j = j + 2) {
			onlyNumber.add(divdeString[j]);
		}

		// 특수 기호 + - * / = 만 넣기
		for (int j = 1; j < divdeString.length; j = j + 2) {
			calcSimbol.add(divdeString[j]);
		}
	}

	//
	public void setCalculator() {
		for (String intNum : onlyNumber) {
			intNumber.add(Double.valueOf(intNum));
		}
	}

	// 정답 구하기
	public void setCalcMethod() {
		// check size
		double temp = 0;
		if (calcSimbol.toString().contains("=") == true) {
			for (int i = 0; i < calcSimbol.size(); i++) {

				if (calcSimbol.poll().equals("+")) {
					answer = intNumber.poll() + intNumber.poll();
					intNumber.addLast(answer);
				} else if (calcSimbol.poll().equals("-")) {
					answer = intNumber.poll() - intNumber.poll();
					intNumber.addLast(answer);
				} else if (calcSimbol.poll().equals("*")) {
					answer = intNumber.poll() * intNumber.poll();
					intNumber.addLast(answer);
				} else if (calcSimbol.poll().equals("/")) {
					answer = intNumber.poll() / intNumber.poll();
					temp = answer;
				}
				i++;
			}
		} else {
			throw new NumberFormatException(" = 을 마지막에 써주세요.  = 을 안쓰면 계산기 잘동 안됩니다 ");
		}

	}
	public void clearArray() {
		intNumber.clear();
		calcSimbol.clear();
		onlyNumber.clear();
		
	}
	public double getAnswer() {
		return answer;
	}

}