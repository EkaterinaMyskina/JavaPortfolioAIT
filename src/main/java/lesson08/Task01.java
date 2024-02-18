package lesson08;
import java.util.Scanner;
/*
Пользователь вводит числа с клавиатуры. Как только будет введено отрицательное число, программа завершается и
выводит сообщение о самом наименьшем и наибольшем числе.
 */
/*
public class Task01 {
    public static void main(String[] args) {

        int min = 0;
        int max = 0;
        boolean exit = false;

        while (exit == false) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите число: ");
            int number = scanner.nextInt();

            if (number == 0 || number == min && number == max) {
                min = number;
                max = number;
            }
            else {
                if (number > min && number < max || number < min) {
                    min = number;
                }
                if (number > max && number > min) {max = number;}

                (number >= 0 || number > min) {
                max = number;
            }

               if (number == 0) {
                min = number;
                   exit = false;
                }
                else {
                   if (number > min) {
                       max = number;
                       exit = false;}
                   else
                   {
                       min=number;
                       exit = false;
                   }
               }
               // System.out.println("Введите число: ");
               // int number = scanner.nextInt();


            }
            exit = true;
            System.out.println("Число меньше нуля. Конец программы.");
        }
    }
}
*/