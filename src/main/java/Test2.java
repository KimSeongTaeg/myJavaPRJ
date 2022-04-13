import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();

        if (a % 2 == 0) {
            System.out.println("짝입니다");
        } else {
            System.out.println("홀입니다");
        }
    }
}
