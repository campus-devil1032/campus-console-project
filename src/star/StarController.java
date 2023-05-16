package star;

public class StarController {
	
	StarModel model = new StarModel();
	StarView view = new StarView();
	int height;
			
	public StarController(StarModel model, StarView view) {
		// TODO Auto-generated constructor stub
		
		this.model = model;
		this.view = view;
		
	}
	
	public void setSquare() {
		view.setSquare();
	}
	
	public void getHeight() {
		this.height = view.getHeight();
	}
	
	public void setRectangle() {
		model.setSquare(this.height);
	}
	
	/////
	
	public void setHalfTriangle() {
		view.setHalfTriangle();
	}
	
	public void getHeight1() {
		this.height = view.getHeight(); 
	}
	
	public void setTriangle() {
		model.setHalfTriangle(this.height);
	}
	
	/////
	
	public void setLRHalfTriangle() {
		view.setLRHalfTriangle();
	}
	
	public void getHeight2() {
		this.height = view.getHeight();
	}
	
	public void setLRTriangle() {
		model.setLRHalfTriangle(this.height);
	}
	
	
	/////
	
	public void setPyramidTriangle() {
		view.setPyramidTriangle();
	}
	
	public void getHeight3() {
		this.height = view.getHeight();
	}
	
	public void setPyramid() {
		model.setPyramidTriangle(this.height);
	}
	
	/////
	
	public void setBasicTriangle() {
		view.setBasicTriangle();
	}
	
	public void getHeight4() {
		this.height = view.getHeight();
	}
	
	public void setBTriangle() {
		model.setBasicTriangle(this.height);
	}
	
	/////
	
	public void setDiamond() {
		view.setDiamond();
	}
	
	public void getHeight5() {
		this.height = view.getHeight5();
	}
	
	public void setDiamondStar() {
		model.setDiamond(this.height);
	}
	
	/////
	
	public void setHourGlass() {
		view.setHourGlass();
	}
	
	public void getHeight6() {
		this.height = view.getHeight6();
	}
	
	public void setHourGlassStar() {
		model.setHourGlass(this.height);
	}
	
	/////
	
	public void setDiagonal() {
		view.setDiagonal();
	}
	
	public void getHeight7() {
		this.height = view.getHeight7();
	}
	
	public void setDiagonalStar() {
		model.setDiagonal(this.height);
	}
	
	/////
	
	public void setVPattern() {
		view.setVPattern();
	}
	
	public void getHeight8() {
		this.height = view.getHeight8();
	}
	
	public void setVPatternStar() {
		model.setVPattern(this.height);
	}
	
	/////
	
	public void setRealStar() {
		view.setRealStar();
	}
	
	public void getHeight9() {
		this.height = view.getHeight9();
	}
	
	public void setStar() {
		model.setRealStar(this.height);
	}
	
	
	
}
