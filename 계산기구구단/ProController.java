package Program;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ProController {
	void run() {

		Scanner sc = new Scanner(System.in);
		System.out.println("구구단을 실행하려면 숫자 1, 계산기를 실행하려면 숫자 2를 입력하요.");

		while (true) {
			try {
				int s = sc.nextInt();
				if (s == 1) {
					System.out.println("숫자를 1~999 사이 값으로 입력하세요");

					while (true) {
						try {
							int dan = sc.nextInt();
							if (dan > 0 && dan < 1000) {
								Pro gugudan = new Pro();
								gugudan.setDan(dan);
								gugudan.print1();
								
							} else {
								System.out.println("숫자를 1~999 사이 값으로 다시 입력하세요");

							}

						} catch (InputMismatchException e) {
							sc = new Scanner(System.in);
							System.out.println("숫자만 입력하세요");

						}
					}

				}

				else if (s == 2) {

					while (true) {

						try {
							System.out.println("첫번째 숫자를 입력하세요.");
							int a = sc.nextInt();
							System.out.println("연산 기호를 입력하세요.");
							String act = sc.next();
							System.out.println("두번째 숫자를 입력하세요.");
							int b = sc.nextInt();

							Pro cal = new Pro();
							cal.setA(a);
							cal.setB(b);
							cal.setAct(act);
							cal.print2();
							sc.close();

						} catch (InputMismatchException e) {
							sc = new Scanner(System.in);
							System.out.println("숫자만 입력하세요");
						} catch (ArithmeticException e) {
							sc = new Scanner(System.in);
							System.out.println("0으로 나눌 수 없습니다.");
						}

					}
					
				} else {

					System.out.println("프로그램을 실행시킬 숫자를 다시 입력하세요."); //구구단 혹은 계산기 실행시키는 숫자가 아닌 다른 숫자 입력한 경
					sc = new Scanner(System.in);

				}
			} catch (InputMismatchException e) {
				sc = new Scanner(System.in);
				System.out.println("1 또는 2 숫자만 입력하세요"); //프로그램 실행시키는 숫자를 입력해야 되는데 문자열을 입력한 경
			}
		}
	}
}
