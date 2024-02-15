package houmework01;

import java.util.Scanner;

public class Homework06b {
/*
2. Проверка Чётных и Нечётных Чисел: Напишите программу, которая запрашивает
у пользователя целое число и сообщает, является ли это число чётным или нечётным.
 */
    static Scanner scanner = new Scanner (System.in);

    public static void main(String[] args) {
        System.out.println("Введите целое число: ");
        int number = scanner.nextInt();

        if  ((number % 2) == 0) {
            System.out.println("Введенное число:" + number + " четное");
        }
            System.out.println("Введенное число: " + number + " нечетное");

        scanner.close();
    }
}
