package Team.Calculator;

import java.util.Scanner;

public class CalCon {
	double x = 0;
	double y = 0;
	String cal = " ";

	Scanner scanner = new Scanner(System.in);

	void getx() {

		x = scanner.nextInt();
	}

	void getCal() {

		cal = scanner.next();
	}

	void getY() {

		y = scanner.nextInt();
	}

	
}
