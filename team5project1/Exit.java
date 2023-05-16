package team5project1;

import java.util.Scanner;

public class Exit {
	Scanner scan = new Scanner(System.in);

	public void exit() {

		System.out.println("종료 하시겠습니까?(종료를 원하시면 y)");
		String end = scan.next();
		if (end.equals("y")) { // 입력이 y와 일치 하면
			System.out.println("프로그램 종료");
			System.exit(0); // 프로그램 종료

		}

	}

}
