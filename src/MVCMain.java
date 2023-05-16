import java.util.Scanner;
import java.util.Stack;

import calculator.CalculatorController;
import calculator.CalculatorModel;
import calculator.CalculatorView;
import gugudan.*;
import star.StarMVCMain;
//import뒤에 *를 붙이면 거기있는 모든 자바파일을 가져옵니다.

public class MVCMain {
	public static void main(String[] args) {
		// 계산기 선언부
		CalculatorModel calcModel = new CalculatorModel();
		CalculatorView calcView = new CalculatorView();
		CalculatorController calcController = new CalculatorController(calcModel, calcView);
		// 구구단 선언부
		GugudanView guguview = new GugudanView();
		// 별찍기 선언부
		StarMVCMain star = new StarMVCMain();
		// 메인 선언부
		boolean flag = true;

		while (flag) {
			System.out.println("0:종료  "
					+ "1:구구단  "
					+ "2:계산기  "
					+ "3:별찍기 ");
			Scanner sc = new Scanner(System.in);
			int key = sc.nextInt();
			switch (key) {
			case 0: // 종료
				flag = false;
				break;
			case 1: // 구구단 실행
				guguview.run();
				break;
			case 2: // 계산기 실행
				calcController.setIntro();
				calcController.setCalcOperator();
				calcController.clearArray();
				break;
			case 3: // 별찍기 실행
				star.selcetStar();
				break;
			}

		}

	}

}
