package gugudan_mvc;

public class GugudanView {

	public void printInputDan() {
		System.out.println("몇 단 필요함?");
	}

	public void printInputDan(int[] result) {
		System.out.println("구구단 결과:");
		for (int i = 0; i < 9; i++) {
			System.out.println(result[i]);
		}
	}
	
	public void printResult(int[] result) {
		System.out.println("==="+model.getDan()+"단===\n");
		for(int i=0;i<result.length;i++) {
			System.out.println("%d x %d = %d\n", model.getDan(), i+1, result[i]);
		}
	}
}
