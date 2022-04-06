import java.util.Scanner;

public class Ex05_09_1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.printf("1 ~ 4중에 선택하세요 : ");
        int a = s.nextInt();

        if (a == 1) {
            System.out.printf("1을 선택했다\n");
        } else if (a == 2) {
            System.out.printf("2를 선택했다\n");
        } else if (a == 3) {
            System.out.printf("3을 선택했다\n");
        } else if (a == 4) {
            System.out.printf("4를 선택했다\n");
        } else {
            System.out.printf("이상한걸 선택했다\n");
        }
    }
}
