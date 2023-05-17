package Team9_Project1;
public class StarController {
	private StarView view;
	private StarModel model;
	
	public StarController() {
		this.view = new StarView();
		this.model = new StarModel();
	}
	
	public void showMenu() {
		this.view.menuShow();
		
		switch(this.view.getMenuSelect()) {
		case 1:
			this.model.square(this.view.getSize());
			break;
		case 2:
			this.model.upright(this.view.getSize());
			break;
		case 3:
			this.model.triangle(this.view.getSize());
			break;
		case 4:
			this.model.diamond(this.view.getSize());
			break;
		case 5:
			this.model.starstar(this.view.getSize());
			break;
		}
	}

}
