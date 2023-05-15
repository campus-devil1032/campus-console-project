package practice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Combine {

	public static void main(String[] args) {
		while (true) {
			int input = 0;
			System.out.println("====================================");
			System.out.println("1 : 구구단, 2 : 계산기, 3 : 프로그램 종료");
			System.out.println("====================================");
			System.out.print("번호를 입력하세요 : ");
			Scanner sc = new Scanner(System.in);
			input = sc.nextInt();
			if (input == 1) {	// 구구단 실행
				System.out.print("1~999 사이의 숫자를 입력해주세요 :  ");
				int num1 = 0; // num1 변수 초기화

				// 예외처리를 위한 try-catch 문 선언
				try {
					num1 = sc.nextInt(); // 입력받은 숫자를 num1 변수에 저장한다.
					if ((num1 > 999) || (num1 < 1)) // 입력받은 숫자가 조건의 범위를 만족하지 않을경우 안내 메시지 출력
						System.out.println("1~999 사이의 숫자를 입력해주세요 ");
					else {
						for (int i = 1; i <= 9; i++) { // 조건 만족 시 구구단 실행
							System.out.println(num1 + " * " + i + " = " + num1 * i);
						}
					}
				} catch (InputMismatchException e) {
					// 숫자가 아닌 문자를 입력할 경우, 에러메시지 출력
					System.out.println("숫자가 아닙니다.");
				}
			} else if (input == 2) { // 계산기 실행
				System.out.println("숫자 2개를 입력해주세요 ");
				int cNum1 = sc.nextInt();
				int cNum2 = sc.nextInt();
				int res = 0;

				System.out.println("하고자 하는 연산을 입력해주세요(+, -, *, /) : ");
				char cal;
				cal = sc.next().charAt(0); // 문자를 저장하는 것은 없어서 라인을 저장한 후 첫번째 문자를 저장

				if (cal == '+') {
					res = cNum1 + cNum2;
					System.out.println(cNum1 + " + " + cNum2 + " = " + res);
				} else if (cal == '-') {
					if (cNum1 < cNum2) {
						System.out.println("2번째 숫자가 더 큽니다.다시 입력해주세요");	// 결과가 음수가 나올 시 안내메시지
					} else {
						res = cNum1 - cNum2;
						System.out.println(cNum1 + " - " + cNum2 + " = " + res);
					}
				} else if (cal == '*') {
					res = cNum1 * cNum2;
					System.out.println(cNum1 + " * " + cNum2 + " = " + res);
				} else if (cal == '/') {
					if (cNum2 == '0') {
						System.out.println("나누는 숫자는 0이 될 수 없습니다.");
					} else {
						res = cNum1 / cNum2;
						System.out.println(cNum1 + " / " + cNum2 + " = " + res);
					}
				}

			} else if (input == 3) {
				System.out.println("프로그램을 종료합니다.");
				sc.close(); // OS자원 반환
				break;
			} else {
				System.out.println("지원하는 기능이 없습니다. 숫자를 다시 입력해주세요.");
			}
		} // while문 종료

	}

}
