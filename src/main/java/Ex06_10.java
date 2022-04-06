import java.util.Scanner;

public class Ex06_10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int hap = 0;
        int num;

        System.out.println("값입력 : ");
        num = s.nextInt();

        for (int i = 1; i <= num; i++) {
            hap += i;
        }

        System.out.println("1부터 " + num + "까지의 합 : " + hap);

    }
}
