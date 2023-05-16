package CompleteProject;

import ProjectStarPoint.*;
import ProjectCalculator.*;
import ProjectGuGuDan.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {

	public static void main(String[] args) throws IOException {
		System.out.println("");
		System.out.println(
				"======================================================================================================================= ");
		System.out.println(
				"::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::: ");
		System.out.println(
				"::::::'##::::'###::::'##::::'##::::'###:::::::'########::'########:::'#######::::::::'##:'########::'######::'########: ");
		System.out.println(
				":::::: ##:::'## ##::: ##:::: ##:::'## ##:::::: ##.... ##: ##.... ##:'##.... ##::::::: ##: ##.....::'##... ##:... ##..:: ");
		System.out.println(
				":::::: ##::'##:. ##:: ##:::: ##::'##:. ##::::: ##:::: ##: ##:::: ##: ##:::: ##::::::: ##: ##::::::: ##:::..::::: ##:::: ");
		System.out.println(
				":::::: ##:'##:::. ##: ##:::: ##:'##:::. ##:::: ########:: ########:: ##:::: ##::::::: ##: ######::: ##:::::::::: ##:::: ");
		System.out.println(
				"'##::: ##: #########:. ##:: ##:: #########:::: ##.....::: ##.. ##::: ##:::: ##:'##::: ##: ##...:::: ##:::::::::: ##:::: ");
		System.out.println(
				" ##::: ##: ##.... ##::. ## ##::: ##.... ##:::: ##:::::::: ##::. ##:: ##:::: ##: ##::: ##: ##::::::: ##::: ##:::: ##:::: ");
		System.out.println(
				". ######:: ##:::: ##:::. ###:::: ##:::: ##:::: ##:::::::: ##:::. ##:. #######::. ######:: ########:. ######::::: ##:::: ");
		System.out.println(
				":......:::..:::::..:::::...:::::..:::::..:::::..:::::::::..:::::..:::.......::::......:::........:::......::::::..::::: ");
		System.out.println(
				"======================================================================================================================= ");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String put = "";

		while (true) {

			System.out.println("어떤 기능을 사용하실 건가요?");
			System.out.println("1. 별찍기");
			System.out.println("2. 구구단");
			System.out.println("3. 계산기");
			System.out.println("종료하시려면 Q를 입력하세요");

			put = br.readLine();

			if (put.toUpperCase().equals("Q")) {
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);

			} else if (put.equals("1") || put.equals("2") || put.equals("3")) {
				break;
			}
			System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");

		}
		
		if (put.equals("1")) {
	    	StarModel model = new StarModel();
	    	StarView view = new StarView();
	    	StarController controller = new StarController(model, view);
	    	
	    	controller.run();
	    	
		}

		if (put.equals("2")) {
	    	GuGuModel model = new GuGuModel();
	    	GuGuView view = new GuGuView();
	        GuGuController controller = new GuGuController(model, view);
	        
	        controller.run();
	        System.out.println("종료합니다.");
	        System.exit(0);

		}
		
		if (put.equals("3")) {
			Calc_Model calc_Model = new Calc_Model();
			Calc_View calc_View = new Calc_View();
			Calc_Controller calc_Controller = new Calc_Controller(calc_Model, calc_View);
			
			calc_Controller.run();
		}


	}

}
