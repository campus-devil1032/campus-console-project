package team5project1;

import java.util.InputMismatchException;

public class Gugu {
	private int integer; // 구하고자하는 구구단 단 수

	public int getNumber() {
		return integer;
	}

	public void setNumber(int integer) {
		this.integer = integer;
	}

	public void gugugu() {
		if (integer >= 1 && integer <= 999) { // 숫자의 범위는 1~999까지
			for (int i = 1; i < 10; i++) {
				System.out.println("" + integer + "x" + i + " = " + integer * i);
			}
			System.out.println("------------------");
		} else { // 숫자 범위 넘어가면 에러메시지
			System.out.println("유효하지 않은 숫자입니다.");

		}
	}
}
