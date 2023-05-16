package Team9_Project1;
import java.util.Scanner;

public class StarView {
	private Scanner sc;
	private StringBuilder sb;
	private int menuSelect;
	private int size;

	public StarView() {
		sc = new Scanner(System.in);
		sb = new StringBuilder();
	}

	public void menuShow() {
		sb.append("1.네모\n");
		sb.append("2.오른쪽 위 삼각형\n");
		sb.append("3.삼각형\n");
		sb.append("4.다이아몬드\n");
		sb.append("5.별로 별찍기\n");
		sb.append("원하는 선택지를 골라주세요 : ");
		System.out.println(sb);
		sb.delete(0, sb.length());
		menuSelect = sc.nextInt();
		
		sb.append("원하는 크기를 입력해 주세요 :");
		System.out.println(sb);
		size = sc.nextInt();
	}
	
	public int getMenuSelect() {
		return this.menuSelect;
	}
	
	public int getSize() {
		return this.size;
	}

}
