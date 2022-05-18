import java.util.Scanner;

public class Ex09_03 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str;

        System.out.println("문자열 입력 ==> ");
        str = s.nextLine();

        System.out.println("출력 문자열 ==> ");

        if (!str.startsWith("(")) {
            System.out.println("(");
        }

        for (int i = 0; i < str.length(); i++) {
            System.out.println("" + str.charAt(i));
        }

        if (!str.endsWith(")")) {
            System.out.println(")");
        }
    }
}
