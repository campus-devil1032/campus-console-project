package gugudan_mvc;

public class GugudanView {

	public void printInputDan() {
		System.out.println("�� �� �ʿ���?");
	}

	public void printInputDan(int[] result) {
		System.out.println("������ ���:");
		for (int i = 0; i < 9; i++) {
			System.out.println(result[i]);
		}
	}
	
	public void printResult(int[] result) {
		System.out.println("==="+model.getDan()+"��===\n");
		for(int i=0;i<result.length;i++) {
			System.out.println("%d x %d = %d\n", model.getDan(), i+1, result[i]);
		}
	}
}
