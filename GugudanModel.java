package gugudan;

public class GugudanModel {

	private int num1;

	public GugudanModel(int num) {
		this.num1 = num;
	}

	public void Calcu() {
		for (int i = 1; i < 10; i++) {
			System.out.printf("%d * %d = %d\n", num1, i, num1 * i);
		}
	}
}
