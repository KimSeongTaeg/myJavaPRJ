public class Ex08_06 {
    public static void main(String[] args) {
        int aa[] = {10, 20, 30, 40, 50};
        int count, size;

        count = aa.length;
        size = count * Integer.BYTES;

        System.out.println("int 크기 : " + Integer.BYTES);

        System.out.println("배열의 크기 : " + count);
        System.out.println("데이터 크기 : " + size);

        for (int i = 0; i < aa.length; i++) {
            System.out.println("aa[" + i + "] : " + aa[i]);
        }
    }
}
