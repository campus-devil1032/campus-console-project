package star;

public class StarController {
	
	StarModel model = new StarModel();
	StarView view = new StarView();
			
	public StarController(StarModel model, StarView view) {
		// TODO Auto-generated constructor stub
		
		this.model = model;
		this.view = view;
		
	}
	
	public void getSquareStar() {
		this.model.setSquare();
	}
	
	
}
