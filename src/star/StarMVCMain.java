package star;

public class StarMVCMain {
	public static void main(String[] args) {
		
		StarView view = new StarView();
		StarModel model = new StarModel();
		StarController controller = new StarController(model, view);
		
		controller.setSquare();
		
		controller.getHeight(); 
		
		controller.setRectangle();
		
		/////
		
		controller.setHalfTriangle();
		
		controller.getHeight1();
		
		controller.setTriangle();
		
		/////
		
		controller.setLRHalfTriangle();
		
		controller.getHeight2();
		
		controller.setLRTriangle();
		
		
		/////
		
		controller.setPyramidTriangle();
		
		controller.getHeight3();
		
		controller.setPyramid();
		
		/////
		
		controller.setBasicTriangle();
		
		controller.getHeight4();
		
		controller.setBTriangle();
		
		/////
		
		controller.setDiamond();
		
		controller.getHeight5();
		
		controller.setDiamondStar();
		
		/////
		
		controller.setHourGlass();
		
		controller.getHeight6();
		
		controller.setHourGlassStar();
		
		/////
		
		controller.setDiagonal();
		
		controller.getHeight7();
		
		controller.setDiagonalStar();
		
		/////
		
		controller.setVPattern();
		
		controller.getHeight8();
		
		controller.setVPatternStar();
		
		/////
		
		controller.setRealStar();
		
		controller.getHeight9();
		
		controller.setStar();
		
		
		
	}
}
