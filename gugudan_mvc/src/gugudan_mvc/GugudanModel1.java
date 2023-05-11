package gugudan_mvc;

public class GugudanModel1 {

	private int dan;
	private int[] result;

	public void setDan(int dan) {
		this.dan = dan;
	}

	public void calculate() {
		result = new int[9];

		for (int i = 0; i < 9; i++) {
			result[i] = dan * (i + 1);
		}
	}
	
	public int[] getResult() {
		return result;
	}

}
