package gugudan;

import java.util.Scanner;


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
			e.getMessage();
		}

	}
}
