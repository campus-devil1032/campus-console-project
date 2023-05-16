package Team.Star;

public class StarMain {

	public static void main(String[] args) {
			StarView view = new StarView();
			StarModel model = new StarModel();
			StarController controller = new StarController(model, view);
			
			controller.run();

	}

}
