package Team;

public class TeamMain {
	public static void main(String[] args) {
		TeamView view = new TeamView();
		
		TeamController controller = new TeamController();
		
		controller.run();

}
}
