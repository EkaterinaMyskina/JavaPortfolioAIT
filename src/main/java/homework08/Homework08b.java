package homework08;
/*
Пользователь вводит число, напечатать табличку умножения для этого числа
Например, если введено 4, нужно напечатать:
1 * 4 = 4
2 * 4 = 8
3 * 4 = 12
(и так далее до 10)
 */
import java.util.Scanner;
public class Homework08b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число на которое мы будем умножать: ");
        int mult = scanner.nextInt();
        for (int x = 1; x <= 10; x++ )
        {  int result= x * mult;
           System.out.println ("1 * " + mult + " = " + result);
        }
    }
}
