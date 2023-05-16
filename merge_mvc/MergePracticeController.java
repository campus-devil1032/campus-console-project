package merge_mvc;

import merge_mvc.calc1.Calculator;
import merge_mvc.calc2.Calculator2;
import merge_mvc.gugudan1.GugudanModel;
import merge_mvc.gugudan2.Gugudan2;

public class MergePracticeController {
	static MergePracticeView view = new MergePracticeView();

	public static void main(String[] args) {

		boolean isRunClient = true; // switch문에 while문 적용을 위한 변수

		while (isRunClient) {
			view.showMenu(); // 메뉴 표시

			try {
				int userSelect = Integer.parseInt(view.getInput()); // 유저셀렉트

				switch (userSelect) {

				case 0: // 종료
					System.out.println("프로그램을 종료합니다.");
					isRunClient = false;
					break;

				case 1: // 구구단 ver.1
					GugudanModel.gugudanInput();
					break;

				case 2: // 구구단 ver.2
					Gugudan2.gugudan();
					break;

				case 3: // 계산기 ver.1
					Calculator.calc();
					break;

				case 4: // 계산기 ver.2
					Calculator2.calc();
					break;

				default: // 다른 값 입력 시
					System.err.println("잘못된 입력입니다. 다시 입력하세요.");
					break;
				}

			} catch (NumberFormatException e) { // 자료형 불일치 시
				System.err.println("잘못된 입력입니다. 다시 입력하세요.");
			}
		}
	}
}
