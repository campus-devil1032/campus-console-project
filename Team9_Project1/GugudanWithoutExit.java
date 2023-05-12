import java.util.Scanner;
import java.util.InputMismatchException;


public class GugudanWithoutExit {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {

                System.out.print("구구단을 출력할 숫자를 입력해 주세요.(2~999)");
                int number = scanner.nextInt();

                if (number < 2 || number > 999) {
                    System.out.println("2부터 999사이의 숫자를 입력해주세요.");
                    continue;
                }

                for (int i = 1; i <= 9; i++) {
                    System.out.println(number + " x " + i + " = " + (number * i));
                }

            } catch (InputMismatchException e) {
                System.out.println("잘못된 값을 입력했습니다. 정수를 입력해주세요.");
                scanner.nextLine();
            }
        }
    }
}