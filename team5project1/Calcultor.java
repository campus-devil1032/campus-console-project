package team5project1;

import java.util.Scanner;

public class Calcultor {
	public static void calcultor() {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			try {
				System.out.print("첫 번째 숫자를 입력하세요 : ");
				double num1 = scanner.nextDouble(); // 첫 번째 숫자를 입력 받음

				System.out.print("두 번째 숫자를 입력하세요 : ");
				double num2 = scanner.nextDouble(); // 두 번쨰 숫자를 입력 받음

				System.out.print("연산자를 입력하세요 (+, -, *, /) : ");
				String operator = scanner.next(); // 연산자를 입력받음

				double result = 0.0; // 결과값을 저장할 변수 선언

				switch (operator) { // 계산 수행
				case "+":
					result = num1 + num2;
					break;
				case "-":
					result = num1 - num2;
					break;
				case "*":
					result = num1 * num2;
					break;
				case "/":
					if (num2 == 0) {
						throw new ArithmeticException("0으로 나눌 수 없습니다.");
					} else {
						result = num1 / num2;
					}
					break;
				default:
					System.out.println("잘못된 연산자입니다");
					break;
				}
				System.out.println("결과 : " + result); // 계산 결과 출력
				break;
			} catch (ArithmeticException e) {
				System.out.println("결과 : " + e.getMessage());
			} catch (Exception e) {
				System.out.println("잘못된 입력입니다.");
				scanner.nextLine();
			}
		}
	}

}