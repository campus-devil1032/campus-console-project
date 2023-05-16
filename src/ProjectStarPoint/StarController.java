package ProjectStarPoint;

import java.util.Scanner;

public class StarController {
	private StarModel model;
	private StarView view;
	
	public StarController(StarModel model, StarView view) {
		this.model = model;
		this.view = view;
		
	}
	
	public void run () {
		view.firstScreen();
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		
		while (true) {
		if (input.equals("3")) {
			System.out.println("계산기를 종료합니다.");
			System.exit(0);

		} else if (input.equals("1") || input.equals("2")) {
			break;
		}
		System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
	}
		
		if (input.equals("1")) {
			model.triangle();
			run();
		}

		if (input.equals("2")) {
			model.square();
			run();

		}
		
	}
	

}
