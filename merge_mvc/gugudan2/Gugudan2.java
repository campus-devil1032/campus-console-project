package merge_mvc.gugudan2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Gugudan2 {

	public static void gugudan() {

		System.out.println("단 입력: ");

		try {

			while (true) {
				Scanner sc = new Scanner(System.in);
				int num = sc.nextInt();

				if (num > 0 || num < 1000) {
					for (int i = 1; i <= 9; i++) {
						System.out.println(num + "x" + i + "=" + (num * i) + "");
					}
				} else {
					System.out.println("1에서 999까지의 숫자만 입력하세요.");
					continue;
				}
			}
		} catch (InputMismatchException e) {
			System.out.println("다시 입력하세요.");
		}
	}
}


