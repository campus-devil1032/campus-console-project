package Team9_Project1;

import java.util.Scanner;

public class MenuView {
	private Scanner scanner;
	private int choiceMenuNum;
	
	public MenuView() {
		scanner = new Scanner(System.in);
	}
	
	public int printMenuNum() {
		System.out.println("***********************");
		System.out.println("	1. 구구단");
		System.out.println("	2. 계산기");
		System.out.println("	3. 별찍기");
		System.out.println("	4. 종료");
		System.out.println("***********************");
		System.out.println("원하는 작업의 번호를 입력하세요.");
		choiceMenuNum = Integer.parseInt(scanner.nextLine());
		return choiceMenuNum;
	}
	
	public void errorMsg() {
		System.out.println("잘못된 입력입니다. 목록의 번호 중 하나를 입력하세요.");
	}
	
	public void closeMsg() {
		System.out.println("프로그램을 종료합니다.");
	}
}
