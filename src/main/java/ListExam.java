import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExam {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");

        int listSize = list.size();

        for (int i = 0; i < listSize; i++) {
            System.out.println("name : " + list.get(i));
        }

        for (String name : list) {
            System.out.println("이름 : " + name);
        }

        list.forEach(name -> System.out.println("name : " + name));

        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String name = it.next();
            System.out.println("이름 : " + name);
        }
    }
}
