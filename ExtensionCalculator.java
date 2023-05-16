package ProjectResult;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ExtensionCalculator {

	public static void main(String[] args) throws IOException {

		System.out.println("");
		System.out.println(
				"======================================================================================================================= ");
		System.out.println(
				"::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::: ");
		System.out.println(
				"::::::'##::::'###::::'##::::'##::::'###:::::::'########::'########:::'#######::::::::'##:'########::'######::'########: ");
		System.out.println(
				":::::: ##:::'## ##::: ##:::: ##:::'## ##:::::: ##.... ##: ##.... ##:'##.... ##::::::: ##: ##.....::'##... ##:... ##..:: ");
		System.out.println(
				":::::: ##::'##:. ##:: ##:::: ##::'##:. ##::::: ##:::: ##: ##:::: ##: ##:::: ##::::::: ##: ##::::::: ##:::..::::: ##:::: ");
		System.out.println(
				":::::: ##:'##:::. ##: ##:::: ##:'##:::. ##:::: ########:: ########:: ##:::: ##::::::: ##: ######::: ##:::::::::: ##:::: ");
		System.out.println(
				"'##::: ##: #########:. ##:: ##:: #########:::: ##.....::: ##.. ##::: ##:::: ##:'##::: ##: ##...:::: ##:::::::::: ##:::: ");
		System.out.println(
				" ##::: ##: ##.... ##::. ## ##::: ##.... ##:::: ##:::::::: ##::. ##:: ##:::: ##: ##::: ##: ##::::::: ##::: ##:::: ##:::: ");
		System.out.println(
				". ######:: ##:::: ##:::. ###:::: ##:::: ##:::: ##:::::::: ##:::. ##:. #######::. ######:: ########:. ######::::: ##:::: ");
		System.out.println(
				":......:::..:::::..:::::...:::::..:::::..:::::..:::::::::..:::::..:::.......::::......:::........:::......::::::..::::: ");
		System.out.println(
				"======================================================================================================================= ");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String put = "";

		while (true) {

			System.out.println("어떤 기능을 사용하실 건가요?");
			System.out.println("1. 별찍기");
			System.out.println("2. 구구단");
			System.out.println("3. 계산기");
			System.out.println("종료하시려면 Q를 입력하세요");

			put = br.readLine();

			if (put.equals("Q")) {
				System.out.println("계산기를 종료합니다.");
				System.exit(0);

			} else if (put.equals("1") || put.equals("2") || put.equals("3")) {
				break;
			}
			System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");

		}

		if (put.equals("1")) {
			System.out.println("만들고 싶은 삼각형의 높이를 숫자로 적어주세요.");
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();

			for (int i = 0; i < n; i++) {

				// 공백
				for (int j = 0; j < i; j++) {
					System.out.print(" ");
				}
				// 별
				for (int j = n; j > i; j--) {
					System.out.print("*");
				}
				System.out.println();

				sc.close();
			}
		}

		if (put.equals("2")) {
			Scanner sc = new Scanner(System.in);

			boolean Continue = true;

			while (Continue) {

				try {
					System.out.print("단을 입력하세요 : ");
					int dan = sc.nextInt();

					// 9단까지만 /for문 (1초기화 식, 2조건식, 4증감식){3실행문장} 순으로 동작함
					for (int i = 1; i < 10; i++) {

						int result = dan * i;
						System.out.printf(dan + " * " + i + " = " + result);
						// println() 변수의 값을 그대로 출력 / printf() 지시자를 통해 변수의 값을 변환 가능
						System.out.println();
					}

					// 계속 할 건지 질문 하기
					System.out.print("계속 하시겠습니까? (y/n): ");
					String input = sc.next();
					// equalsIgnoreCase은 대소문자 없이 문자열만 구분 equals는 대소문자까지 비교
					if (!input.equalsIgnoreCase("y") && !input.equalsIgnoreCase("yes")) {
						Continue = false;
					}
				} catch (Exception e) {
					System.out.println("잘못된 입력값입니다: " + e.getMessage());
					sc.nextLine();
				}
			}

			System.out.println("구구단 끝!");

		}
		if (put.equals("3")) {
			int num1 = 0;
			int num2 = 0;
			String op;
			int result;

			System.out.println("계산기입니다" + "\n");
			System.out.println("q를 입력하시면 계산기가 종료됩니다.");

			Scanner typing = new Scanner(System.in);

			while (true) {
				try {
					System.out.print("첫번째 수를 입력하세요 : ");
					String inputString = typing.nextLine(); // 일단 무조건 string으로 받음
					if (IsInputQ(inputString)) {
						break;
					}
					num1 = Integer.parseInt(inputString);

					System.out.println("연산자를 입력하세요 ( +, -, *, / )");
					System.out.print(">> ");
					op = typing.next().trim();
					typing.nextLine();
					if (op.equals("+") || op.equals("-") || op.equals("*") || op.equals("/")) {
					} else {
						System.out.println("올바른 연산자를 입력해주세요." + "\n");
					}

					System.out.print("두번째 수를 입력해주세요 : ");
					inputString = typing.next(); // 일단 무조건 string으로 받음
					typing.nextLine();
					if (IsInputQ(inputString)) {
						break;
					}
					num2 = Integer.parseInt(inputString);

					// 연산 및 출력
					double divide; // 나누기는 double 변수로 결과 출력하기
					if (op.equals("+")) {
						result = num1 + num2;
						System.out.println(num1 + " " + op + " " + num2 + " = " + result + "\n");
					} else if (op.equals("-")) {
						result = num1 - num2;
						System.out.println(num1 + " " + op + " " + num2 + " = " + result + "\n");
					} else if (op.equals("*")) {
						result = num1 * num2;
						System.out.println(num1 + " " + op + " " + num2 + " = " + result + "\n");
					} else if (op.equals("/")) {
						divide = (double) num1 / num2;
						System.out.println(num1 + " " + op + " " + num2 + " = " + divide + "\n");
					}
				} catch (Exception e) {
					System.out.println("숫자만 입력해주세요" + "\n");

				}
			}
		}
	}
	public static boolean IsInputQ(String input) {
		if (input.equals("q") || input.equals("Q")) {
			return true;
		}
		return false;
	}
}
