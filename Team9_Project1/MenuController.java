package Team9_Project1;

public class MenuController {
	private MenuView view;
	
	public MenuController() {
		this.view = new MenuView();
	}
	
	public void showMainMenu() {
		while(true) {
			int inputNum;
			try {
				inputNum = view.printMenuNum();
				if (inputNum < 1 || inputNum > 4) {
					throw new IllegalArgumentException();
				}
			} catch (NumberFormatException e) {
				view.errorMsg();
				continue;
			} catch (IllegalArgumentException e) {
				view.errorMsg();
				continue;
			}
			
			if (inputNum == 1) {
				// 구구단 실행
				GugudanController gc = new GugudanController();
				gc.showTable();
			} else if (inputNum == 2) {
				// 계산기 실행
				CalculatorController cc = new CalculatorController();
				cc.showTable();
			} else if (inputNum == 3) {
				// 별찍기 실행
				StarController sc = new StarController();
				sc.showMenu();
			} else if (inputNum != 4) {
				view.errorMsg();
			} else {
				// 프로그램 종료
				view.closeMsg();
				break;
			}
		}
	}
}
