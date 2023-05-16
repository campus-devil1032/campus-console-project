package team5project1;

import java.util.Scanner;

public class View {
	Scanner scan = new Scanner(System.in);
	Calcultor calcultor=new Calcultor();
	Star star=new Star();
	Gugu gugu=new Gugu();
	
	Exit end = new Exit(); // 프로그램 종료 클래스

	public void Screen() {
		while (true) {
			while (true) {// 프로그램 선택을 잘못 할 시 다시 선택하기위한 무한루프
				System.out.println("어떤 프로그램을 원하십니까?(1번.계산기 2구구단 3.별피라미드 4.종료)");
				String program = scan.next();

				if (program.equals("1")) {//1을 선택시 게산기 프로그램
					System.out.println("계산기 프로그램\n");
					calcultor.calcultor();//계산기 클래스 실행
					break;
				}
				else if (program.equals("2")) {//2를 선택시 구구단 프로그램
					System.out.println("구구단 프로그램\n");
					System.out.println("원하는 단을 입력하십시오:");
					String dan=scan.next();
					if( isInteger(dan)) {//올바른 입력을 하였는지 점검
						gugu.setNumber(Integer.parseInt(dan));//Integer.pasreInt는 String인 dan을 int로 변환하여 입력
						gugu.gugugu();//구구단 출력
					}
					break;
				}
				else if(program.equals("3")) {//3을 선택시 별 피라미드 
					System.out.println("별 피라미드\n");
					System.out.println("몇단을 원하십니까?(2단부터)");
					String floor=scan.next();
					if( isInteger(floor)) {
						star.pyramid(Integer.parseInt(floor));
					}
					break;
				}
				else if (program.equals("4")) {//4을 선택시 프로드램 종료
					System.out.println("프로그램 종료");
					System.exit(0); // 프로그램 종료
				}
				else {//다른 선택을 할시 오류로 반응
					System.out.println("올바르지 않은 입력입니다.\n\n");
				}
			}
			end.exit();
		}
	}
	
	public static boolean isInteger(String judgment) { //정수가 올바른지 신판
		try {
			Integer.parseInt(judgment);
			return true;
		} catch (NumberFormatException e) {
			System.out.println("올바른 정수가 아닙니다.");
			return false;
		}
	}
}