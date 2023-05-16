package Team9_Project1;

public class GugudanModel {

    private int num;

    public GugudanModel(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public String GetTable() {
        StringBuilder sb = new StringBuilder();
        System.out.println(num + "단을 출력합니다.");
        for (int i = 1; i <= 9; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
        return sb.toString();
    }
}
