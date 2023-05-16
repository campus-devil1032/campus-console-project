package team5project1;

public class Star {
	public void pyramid(int floor) {
		if(floor<=2) {
			System.out.println("올바르지 않은 선택입니다");
			return;
		}
		for (int i = 0; i < floor; i++) {
			for (int j = 0; j + i < floor; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k / 2 <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

