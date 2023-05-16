package merge_mvc.calc2;

import java.util.Scanner;

public class Calculator2 {

	private int num1, num2, result;
	private char op;

	public static void calc() {

		Calculator2 cal = new Calculator2();

		Scanner sc = new Scanner(System.in);

		System.out.println("첫번째 숫자 :");
		cal.setNum1(sc.nextInt());
		sc.nextLine();
		System.out.println("연산자 :");
		cal.setOp(sc.next().charAt(0));
		sc.nextLine();
		System.out.println("두번째 숫자 :");
		cal.setNum2(sc.nextInt());
		sc.nextLine();

		cal.setResult(cal.oper(cal.getNum1(), cal.getOp(), cal.getNum2()));

		System.out.println(cal.getResult());

	}

	public int oper(int num1, char op, int num2) {

		if (op == '+') {
			return num1 + num2;
		} else if (op == '-') {
			return num1 - num2;
		} else if (op == '*') {
			return num1 * num2;
		} else {
			return num1 / num2;
		}

	}

	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

	public char getOp() {
		return op;
	}

	public void setOp(char op) {
		this.op = op;
	}

	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}

}