import java.util.Scanner;

public class Ex08_03 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] aa = new int[4];
        int hap;

        for (int i = 0; i < 4; i++) {
            System.out.printf("%d번째 숫자를 입력하세요 : ", i + 1);
            aa[i] = s.nextInt();
        }

        hap = aa[0] + aa[1] + aa[2] + aa[3];

        System.out.println("합계 : " + hap);

    }
}
