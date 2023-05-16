package merge_mvc.calc1;

import java.util.Scanner;

public class Calculator {

	Calculator calculator = new Calculator();

	public static void calc() {

		Scanner sc = new Scanner(System.in);

		while (true) {

			try {

				int num1; // 첫번째 입력 숫자
				int num2; // 두 번째 입력 숫자
				String operator; // 연산자
				int result = 0; // 결과 값

				System.out.println("계산하실 첫 번째 숫자를 입력하세요.");
				num1 = sc.nextInt();
				sc.nextLine();

				System.out.println("연산 기호를 입력하세요 (/, *, -, +, %)");
				operator = sc.next();
				sc.nextLine();

				System.out.println("계산하실 두 번째 숫자를 입력하세요.");
				num2 = sc.nextInt();
				sc.nextLine();

				if (operator.equals("/")) {
					result = num1 / num2;
				}

				else if (operator.equals("*")) {
					result = num1 * num2;
				}

				else if (operator.equals("-")) {
					result = num1 - num2;
				}

				else if (operator.equals("+")) {
					result = num1 + num2;
				}

				else if (operator.equals("%")) {
					result = num1 % num2;
				}

				else {
					System.out.println("알 수 없는 연산자 입니다.");
				}

				System.out.println(num1 + operator + num2 + "=" + result);
			}

			catch (NullPointerException e) { // null 개체를 참조할 때
				System.out.println(e.getMessage());
			}

			catch (NumberFormatException e) { // 문자열을 숫자로 변환할 수 없을 때
				System.out.println(e.getMessage());
			}

			catch (RuntimeException e) { // 런타임 중에 발생하는 예외
				System.out.println(e.getMessage());
			}
		}
	}
}