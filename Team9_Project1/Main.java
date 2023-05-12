package Team9_Project1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int choice;
		
		while(true) {
			System.out.println("***********************");
			System.out.println("	1. 구구단");
			System.out.println("	2. 계산기");
			System.out.println("	3. 별찍기"); // 별찍기 안에서도 번호를 골라 원하는 이미지 출력할 수 있도록 해봅시당
			System.out.println("	4. 종료");
			System.out.println("***********************");
			try {
				System.out.println("원하는 작업의 번호를 입력하세요.");
				choice = Integer.parseInt(scanner.nextLine());
				if (choice < 1 || choice > 4) {
					throw new IllegalArgumentException(); // 목록 이외의 숫자 입력시 throw로 던짐
				}
			} catch (NumberFormatException e) {
				System.out.println("잘못된 입력입니다. 목록의 번호 중 하나를 입력하세요.");
				continue;
			} catch (IllegalArgumentException e) {
				System.out.println("잘못된 입력입니다. 목록의 번호 중 하나를 입력하세요.");
				continue;
			}
			
			if (choice == 1) {
				// 구구단 실행
			
			} else if (choice == 2) {
				// 계산기 실행
				CalculatorModel model = new CalculatorModel();
				CalculatorView view = new CalculatorView();
				CalculatorController controller = new CalculatorController(model, view);
				controller.showTable();
				
			} else if (choice == 3) {
				// 별찍기 실행
				
			} else if (choice != 4) {
				System.out.println("목록 외의 번호를 입력하셨습니다. 다시 입력하세요.");
				
			} else {
				// 프로그램 종료
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}
	}
}
