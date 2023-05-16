package star;

import java.util.Scanner;

public class StarView {

	int height;

	public void setSquare() {
		Scanner scan = new Scanner(System.in);
		System.out.println("1. 사각형의 높이를 입력해주세요 : ");
		this.height = scan.nextInt();
	}

	public int getHeight() {
		return this.height;
	}

	/////

	public void setHalfTriangle() {
		Scanner scan = new Scanner(System.in);
		System.out.println("2. 직각 삼각형의 높이를 입력해주세요 : ");
		this.height = scan.nextInt();

	}

	public int getHeight1() {
		return this.height;
	}

	/////

	public void setLRHalfTriangle() {
		Scanner scan = new Scanner(System.in);
		System.out.println("3. 반전된 직각 삼각형의 높이를 입력해주세요 : ");
		this.height = scan.nextInt();
	}

	public int getHeight2() {
		return this.height;
	}

	/////

	public void setPyramidTriangle() {
		Scanner scan = new Scanner(System.in);
		System.out.println("4. 좌측 피라미드 삼각형의 높이를 입력해주세요 : ");
		this.height = scan.nextInt();
	}

	public int getHeight3() {
		return this.height;
	}

	/////

	public void setBasicTriangle() {
		Scanner scan = new Scanner(System.in);
		System.out.println("5. 일반 삼각형의 높이를 입력해주세요 : ");
		this.height = scan.nextInt();
	}

	public int getHeight4() {
		return this.height;
	}

	/////

	public void setDiamond() {
		Scanner scan = new Scanner(System.in);
		System.out.println("6. 다이아몬드의 높이를 입력하세요 : ");
		this.height = scan.nextInt();
	}

	public int getHeight5() {
		return this.height;
	}

	/////

	public void setHourGlass() {
		Scanner scan = new Scanner(System.in);
		System.out.println("7. 모래시계의 높이를 입력하세요 : ");
		this.height = scan.nextInt();
	}

	public int getHeight6() {
		return this.height;
	}

	/////

	public void setDiagonal() {
		Scanner scan = new Scanner(System.in);
		System.out.println("8. 대각선의 높이를 입력하세요 : ");
		this.height = scan.nextInt();
	}

	public int getHeight7() {
		return this.height;
	}

	/////

	public void setVPattern() {
		Scanner scan = new Scanner(System.in);
		System.out.println("9. V패턴의 높이를 입력하세요 : ");
		this.height = scan.nextInt();
	}

	public int getHeight8() {
		return this.height;
	}

	/////

	public void setRealStar() {
		Scanner scan = new Scanner(System.in);
		System.out.println("10. 별의 높이를 입력하세요 : ");
		this.height = scan.nextInt();
	}

	public int getHeight9() {
		return this.height;
	}

}
