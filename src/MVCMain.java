import calculator.CalculatorController;
import calculator.CalculatorView;
import gugudan.GugudanController;

public class MVCMain {
public static void main(String[] args) {
	CalculatorController ts = new CalculatorController();
	CalculatorView ts2 = new CalculatorView();
	GugudanController ts3 = new GugudanController();
		ts.say();	
		ts2.say2();
		System.out.println("Hello worlid");
}
}
