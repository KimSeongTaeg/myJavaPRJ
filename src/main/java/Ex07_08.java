import java.util.Scanner;

public class Ex07_08 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a, b;

        while (true) {
            System.out.println("더할 첫번째수 입력 : ");
            a = s.nextInt();
            System.out.println("더할 두번째수 입력 : ");
            b = s.nextInt();

            if (a == 0)
                break;

            System.out.printf("%d + %d = %d \n", a, b, a + b);
        }
        System.out.println("0을 입력해서 반복문을 탈출 했습니다");
    }
}
