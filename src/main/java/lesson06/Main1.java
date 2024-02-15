package lesson06;
import java.util.Scanner;

import static java.lang.System.out;

public class Main1 {
    public static void main(String[] args) {
        /*  Scanner scanner = new Scanner(System.in);
        System.out.println("Как вас зовут?");
        String name = scanner.nextLine();
        System.out.println("Привет, "+ name +'!');

    }
}*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите два числа, которые нужно разделить");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        if (b == 0) {
           System.out.println("Делить на ноль нельзя!");
        }
        else {

        String result = (a + "/" + b) + "=" + (a / b);
        System.out.println(result);}
    }
}

