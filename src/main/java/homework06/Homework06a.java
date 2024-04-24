package homework06;

import java.util.Scanner;

public class Homework06a {
    /*
    1.Калькулятор Суммы: Напишите программу, которая
    запрашивает у пользователя два числа и выводит их сумму.
     */
    static Scanner scanner = new Scanner (System.in); //объявляем дочерний метод scanner, который считывает информацию из ввода с клавиатуры


    public static void main(String[] args) {
        System.out.println("Введите первое число: ");
        int numberOne = scanner.nextInt();
        System.out.println("Введите второе число: ");
        int numberTwo = scanner.nextInt();
        System.out.println("Сумма первого и второго числа= "+ (numberOne+numberTwo));
        scanner.close();
    }
}
