public class Ex07_05 {
    public static void main(String[] args) {
        int a = 100;

        while (a == 200) {
            System.out.println("while 문 내부에 들어왔습니다");
        }
        do {
            System.out.println("do ~ while 문 내부에 들어왔습니다");
        } while (a == 200);
    }
}
