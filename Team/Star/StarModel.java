package Team.Star;

public class StarModel {

	public void dia() {
		System.out.println("마름모를 출력합니다.");
		for (int i = 1; i <= 6; i++) {
			for (int k = 6; k > i; k--) {
				System.out.print(" ");
				;
			}
			for (int j = 1; j < (i * 2); j++) {

				System.out.print("*");
			}
			System.out.println();
		}
		for (int s = 1; s <= 6; s++) {
			for (int x = 0; x < s; x++) {
				System.out.print(" ");
			}
			for (int q = 11; q > s * 2; q--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	public void square() {
		System.out.println("사각형을 출력합니다.");
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	public void tri() {
		System.out.println("삼각형을 출력합니다.");
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void retri() {
		System.out.println("역삼각형을 출력합니다.");
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j <= 9 - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void center() {
		System.out.println("중앙삼각형을 출력합니다");
		for (int i = 1; i <= 10; i++) {
			for (int k = 10; k > i; k--) {
				System.out.print(" ");
			}
			for (int j = 1; j < i * 2; j++) {

				System.out.print("*");
			}
			System.out.println();
		}

	}

	public void recen() {
		System.out.println("역중앙삼각형을 출력합니다.");
		for (int i = 0; i <= 10; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int k = 19; k > i * 2; k--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}