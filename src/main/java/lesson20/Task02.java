package lesson20;

import java.util.ArrayList;

public class Task02 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add ("Red");
        list.add ("Green");
        list.add ("Blue");
        list.add ("Yellow");

        list.remove("Green");
        list.remove("Yellow");

        System.out.println(list);

    }
}
