package merge_mvc;

import java.util.Scanner;

class MergePracticeView {

	private Scanner userInput = new Scanner(System.in);
	private String input;

	// 메뉴 표시
	public void showMenu() {
		System.out.println("<실행할 작업>");
		System.out.println("1 : 구구단 ver.1");
		System.out.println("2 : 구구단 ver.2");
		System.out.println("3 : 계산기 ver.1");
		System.out.println("4 : 계산기 ver.2");
		System.out.println("0 : 종료");
		System.out.println("----------");
	}

	// 입력값 받아오기
	public String getInput() {
		input = userInput.next();
		userInput.nextLine();
		return input;
	}

}
