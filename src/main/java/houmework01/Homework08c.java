package houmework01;
/*
Задание 3. Пользователь вводит число, посчитать
сумму всех натуральных чисел, которые идут до него включительно.
 */
import java.util.Scanner;
public class Homework08c {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int num = scanner.nextInt();
        int res=0;
        while (num >= 1)
        {
            res = res + num;
            num--;
        }
        System.out.println("Сумма всех натуральных чисел < " + num + " = " + res);
        }
    }

