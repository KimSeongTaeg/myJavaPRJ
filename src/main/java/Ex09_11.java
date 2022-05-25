import java.util.Scanner;

public class Ex09_11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int coffee;
        int ret;

        System.out.println("어떤 커피를 드릴까요? (1:보통, 2:설탕, 3:블랙)");
        coffee = s.nextInt();

        CoffeeMachine cm = new CoffeeMachine();
        cm.coffee_machine(coffee);

        System.out.println("커피 나왔습니다");
    }
}
