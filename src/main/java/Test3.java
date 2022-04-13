public class Test3 {
    public static void main(String[] args) {

        int hap = 0;

        for (int i = 0; i < 101; i++) {
            if ((i % 3 == 0) || (i % 5 == 0)) {
                hap +=i;

                System.out.println("합은" + hap);
            }
        }
    }
}
