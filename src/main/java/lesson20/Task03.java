package lesson20;
/*
 **Задание**: Дан `ArrayList` с элементами 1, 2, 3, 4, 5. Выведите на экран третий элемент списка.
 */
import java.util.ArrayList;

public class Task03 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add ("1");
        list.add ("2");
        list.add ("3");
        list.add ("4");
        list.add ("5");
        String element = list.get (2);
        System.out.println(element);
    }
}
