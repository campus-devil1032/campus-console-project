package Team9_Project1;

public class GugudanModel {

    public String GetTable(int num) {
        StringBuilder sb = new StringBuilder();
        System.out.println(num + "단을 출력합니다.");
        for (int i = 1; i <= 9; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
        return sb.toString();
    }
}