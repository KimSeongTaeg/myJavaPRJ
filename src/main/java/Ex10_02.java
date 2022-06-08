public class Ex10_02 {
    public static void main(String[] args) {
        int[] aa = new int[3];
        try {
            aa[2] = 100 / 0;
            aa[3] = 100;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("배열 첨자가 배열 크기보다 커요");
            System.out.println("에러 메시지 : " + e);
        } catch (ArithmeticException e) {
            System.out.println("0으로 나누는 등의 오류에요");
            System.out.println("에러 메시지 : " + e);
        } finally {
            System.out.println("무조건 나와요");
        }
    }
}
