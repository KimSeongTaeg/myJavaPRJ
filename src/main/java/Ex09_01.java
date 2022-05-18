public class Ex09_01 {
    public static void main(String[] args) {
        String str = "IT CookBook.Java";

        int len;

        len = str.length();

        System.out.println("문자열 : " + str);
        System.out.println("문자열 길이 : " + len);

        if (str.length() > 0) {
            System.out.println("str 변수에 값이 존재");
        } else {
            System.out.println("str 변수에 값이 존재 안함");
        }
    }
}
