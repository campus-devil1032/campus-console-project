package Team.Calculator;

public class CalMain {
	public static void main(String[] args) {

		CalView view = new CalView();
		CalCon con = new CalCon();
		view.sys();

		view.sys2();
		con.getx();
		view.sys3();
		con.getCal();
		view.sys4();
		con.getY();
		CalModel model = new CalModel(con.x, con.y, con.cal);
		view.result(model.getResult());

	}

}
