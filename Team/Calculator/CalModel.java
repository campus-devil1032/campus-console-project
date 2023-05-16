package Team.Calculator;

public class CalModel {
	double x; double y;
	String cal;
	double result=0;
	CalModel(double x, double y, String cal){
		this.x=x;
		this.y=y;
		this.cal=cal;
		
	}
	
	
	void plus() {
		result = x+y; 
	}
	
	void minus() {
		result = x-y;
	}
	void 곱() {
		result = x*y;
	}
	void 나눗() {
		if(y!=0) {
			result = x/y;
		}else {
			System.out.println("0으로 나눌 수 없습니다.");
		}
		
	}
	
	double getResult() {
		switch (cal) {
		case "+":
			plus();
			break;
		case "-":
			minus();
			break;
		case "*":
			곱();
			break;
		case "/":
			나눗();
			break;

		default:
			System.out.println("연산자를 제대로 입력하세요.");
			break;
		}  
		return  result;
		
	}
	
	

}
