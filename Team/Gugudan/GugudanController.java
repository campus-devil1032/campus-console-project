package Team.Gugudan;

import java.util.List;
import java.util.Scanner;

public class GugudanController {
	
	private GugudanView view;
	private GugudanModel model;
	
	public GugudanController( GugudanView view,GugudanModel model) {
		this.view = view;
		this.model=model;
	}
	public void run() {
		Scanner sc = new Scanner(System.in);
	    view.printMessage("출력하고 싶은 구구단 단수를 입력하세요: ");
		int dan = sc.nextInt();
		model.setDan(dan);
		
		view.printMessage(dan+ "단을 출력합니다.");
		List<String> gugudan = model.calculateGugudan();
        for (String line : gugudan) {
            view.printMessage(line);
        }
    }

}
