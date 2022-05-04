public class Test4 {
    public static void main(String[] args) {

        for (int i = 1; i < 10; i++) {
            for (int k = 2; k < 10; k++) {
                System.out.printf("%3d x %d = %2d", k, i, k * i);
            }
            System.out.println();
        }
        for (int j = 1, y = 1; j < 10; j++, y++) {
            System.out.printf("%d x %d = %d \n", j, y, j * y);
        }
    }
}
