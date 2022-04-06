public class Ex06_08 {
    public static void main(String[] args) {
        int hap = 0;
        int i;

        for (i = 1; i < 11; i++) {
            System.out.println("hap : " + hap + " | i : " + i);
            hap += i;
            System.out.println("더한값 : " + hap);
            System.out.println("-----------------");
        }

        System.out.println("1에서 10까지의 합 : %d " + hap);

    }
}
