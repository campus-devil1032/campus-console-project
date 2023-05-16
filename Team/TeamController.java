package Team;

import java.util.Scanner;
import java.util.InputMismatchException;

import Team.Star.*;
import Team.Calculator.*;
import Team.Gugudan.*;

public class TeamController {

	private TeamView view = new TeamView();

	public void run() {
		view.getStart();
		Scanner sc = new Scanner(System.in);

		boolean num = true;
		while (num) {
			try {
				int a = sc.nextInt();
				switch (a) {
				case 1:
					while (true) {
						try {
							GugudanMain.main(null);
						} catch (InputMismatchException e) {
							System.out.println("숫자만 입력하세요");
							sc = new Scanner(System.in);
						}
					}

				case 2:
					while (true) {
						try {
							CalMain.main(null);
						} catch (InputMismatchException e) {
							System.out.println("숫자만 입력하세요");
							sc = new Scanner(System.in);
						}
					}
				case 3:
					StarMain.main(null);
					return;
				case 4:
					num = false;
					return;
				default:
					System.out.println("숫자를 1~4 값으로 입력하세요.");
					break;

				}
			} catch (InputMismatchException e) {
				System.out.println("숫자만 입력하세요");
				sc = new Scanner(System.in);

			}
		}
	}
}
