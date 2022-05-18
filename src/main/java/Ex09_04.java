public class Ex09_04 {
    public static void main(String[] args) {
        String str = "Java 공부중,Java 공부끝";

        System.out.println("문자열 ==> " + str);

        System.out.print("처음 나오는 Java 위치 ==> ");
        System.out.println(str.indexOf("Java"));
        System.out.print("마지막에 나오는 Java 위치 ==> ");
        System.out.println(str.lastIndexOf("Java"));
    }
}
