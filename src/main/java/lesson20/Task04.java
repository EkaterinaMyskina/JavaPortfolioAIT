package lesson20;

import java.util.ArrayList;

public class Task04 {
    public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<>();

    list.add ("Monday");
    list.add ("Tuesday");
    list.add ("Wednesday");
    list.set (2,"Sunday");

    System.out.println(list);
}
}
