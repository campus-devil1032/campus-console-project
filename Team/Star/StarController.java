package Team.Star;

import java.util.InputMismatchException;
import java.util.Scanner;


public class StarController {
	private StarModel model;
	private StarView view;

	public StarController(StarModel model, StarView view) {
		this.model = model;
		this.view = view;
	}

	public void run() {
		view.getStart();
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			try {
				int a = sc.nextInt();
				switch (a) {
				case 1:
					model.dia();
					break;
				case 2:
					model.square();
					break;
				case 3:
					model.tri();
					break;
				case 4:
					model.retri();
					break;
				case 5:
					model.center();
					break;
				case 6:
					model.recen();
					break;
				default:
					System.out.println("숫자를 1~6 값으로 입력하세요.");
					break;
				}
			} catch (InputMismatchException e) {
				System.out.println("숫자만 입력하세요");
				sc = new Scanner(System.in);
				
			}
		}
	}
}
