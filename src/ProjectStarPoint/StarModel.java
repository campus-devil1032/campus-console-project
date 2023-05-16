package ProjectStarPoint;

import java.util.Scanner;

public class StarModel {

	public void triangle() {
		int line;
		Scanner input = new Scanner(System.in);
		System.out.print("How long is the line? : ");
		line = input.nextInt();

		for (int i = line, add = 0; i > 0; i--, add++) {
			for (int j = 0; j < i - 1; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < line - (i - 1) + add; j++) {
				System.out.print("*");
			}
			System.out.println();

		}
	}

	public void square() {

		Scanner sc = new Scanner(System.in);
		System.out.println("만들고 싶은 사각형의 가로. 세로 길이를 순서대로 적어주세요.");
		System.out.print("가로 길이를 넣으세요: ");
		int n = sc.nextInt();
		System.out.print("세로 길이를 넣으세요: ");
		int m = sc.nextInt();

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		}

	}

