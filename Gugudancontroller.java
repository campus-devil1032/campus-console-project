package gugudan;

import java.util.Scanner;

import two_week_project.UserExcpetion;

public class Gugudancontroller {

	public void runner() {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		try {
			if (num1 >= 1 && num1 <= 9) {
				GugudanModel gugudan = new GugudanModel(num1);
				gugudan.Calcu();

			} else {
				throw new UserExcpetion();
			}
		} catch (RuntimeException e) {
			System.out.println("1~9사이에 입력해주세요");
		}

	}
}
