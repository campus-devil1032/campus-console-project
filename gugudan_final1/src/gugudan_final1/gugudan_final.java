package gugudan_final1;

import java.util.Scanner;

public class gugudan_final {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int x = scanner.nextInt();
		
		while (true) {
			for(int i = 1; i <= 9; i++){
				System.out.println(x + " x " + i + " = " + (x * i));
			}
			if(x < 1 || x >999) {
				System.out.println("error -> input data is wrong");
				break;
			}
		
		}
	}

}
