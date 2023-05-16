package star;

import java.util.Scanner;

public class StarMVCMain {

	StarView view = new StarView();
	StarModel model = new StarModel();
	StarController controller = new StarController(model, view);

	public void square() {
		controller.setSquare();
		controller.getHeight();
		controller.setRectangle();
	}

	public void halfTriangle() {
		controller.setHalfTriangle();
		controller.getHeight1();
		controller.setTriangle();
	}

	/////
	public void lRHalfTriangle() {
		controller.setLRHalfTriangle();
		controller.getHeight2();
		controller.setLRTriangle();
	}

	/////
	public void pyramidTriangle() {
		controller.setPyramidTriangle();
		controller.getHeight3();
		controller.setPyramid();
	}

	/////
	public void basicTriangle() {
		controller.setBasicTriangle();
		controller.getHeight4();
		controller.setBTriangle();
	}

	/////
	public void diamond() {
		controller.setDiamond();
		controller.getHeight5();
		controller.setDiamondStar();
	}

	/////
	public void hourGlass() {
		controller.setHourGlass();
		controller.getHeight6();
		controller.setHourGlassStar();
	}

	/////
	public void diagonal() {
		controller.setDiagonal();
		controller.getHeight7();
		controller.setDiagonalStar();
	}

	/////
	public void vPattern() {
		controller.setVPattern();
		controller.getHeight8();
		controller.setVPatternStar();
	}

	/////
	public void realStar() {
		controller.setRealStar();
		controller.getHeight9();
		controller.setStar();
	}

	public void selcetStar() {
		Scanner sc = new Scanner(System.in);
		System.out.println("1:사각형  " + "2:직각 삼각형  " + "3:반전된 직각 삼각형  " + "4:좌측 피라미드 삼각형  " + "5:일반 삼각형  " + "6:다이아몬드  "
				+ "7:모래시계  " + "8:대각선  " + "9:V패턴  " + "10:Real별");
		int num = sc.nextInt();
		switch (num) {
		case 1:
			square();
			break;
		case 2:
			halfTriangle();
			break;
		case 3:
			lRHalfTriangle();
			break;
		case 4:
			pyramidTriangle();
			break;
		case 5:
			basicTriangle();
			break;
		case 6:
			diamond();
			break;
		case 7:
			hourGlass();
			break;
		case 8:
			diagonal();
			break;
		case 9:
			vPattern();
			break;
		case 10:
			realStar();
			break;

		default:
			break;
		}
	}
}
