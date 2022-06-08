public class Ex10_03 {
    public static void main(String[] args) {
        int a = 100, b = 0;
        int result;
        try {
            result = a / b;
        } catch (ArithmeticException e) {
            System.out.print("발생 오류 ==> ");
            System.out.println(e.getMessage());
        }
    }
}
