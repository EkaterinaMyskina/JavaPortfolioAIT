    /*
    Напечатать "пирамидку" из звездочек
    Высота пирамидки вводится с клавиатуры
    Примерный вид:
    *
    **
    ***
    ****
    *****
    *******
    ******
    *****
    ****
    ***
    **
    *
     */

package homework08;
import java.util.Scanner;
public class Homework08e {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите высоту пирамидки: ");
        int high = scanner.nextInt();
        String temp = "";
        String up = "";
        String down = "";

        for (int i = 1; i <= high; i++) {
            temp += "*";
            up += temp + "\n";
            if (i != high) {
                down = temp + "\n" + down;
            }
        }
        System.out.println(up + down);

    }
}


/*
package houmework01.lesson07;
import java.util.Scanner;
public class Homework08e {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите высоту пирамидки: ");
        int high = scanner.nextInt();
        String temp = "";
        String up = "";
        String down = "";

        for (int i = 1; i <= high; i++) {
            temp += "*";
            up += temp + "\n";
            if (i != high) {
                down = temp + "\n" +down;
            }
            System.out.println(up+down);
        }
        }
    }

 */