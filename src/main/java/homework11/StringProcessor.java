/*
Задание 2 (Сложное)
Тема: Расширенная работа с методами в Java.
Задание: Разработайте класс StringProcessor, который будет предоставлять статические методы для работы со строками:
        Метод reverseString, который принимает строку и возвращает её в перевёрнутом виде.
        Метод isPalindrome, который проверяет, является ли переданное слово палиндромом
        (читается одинаково в обоих направлениях). Метод должен возвращать булево значение.
*/

package homework11;

import java.util.Scanner;

public class StringProcessor {
    public static String str2;
    public static String str1 = "";
    public static String str0 = "";

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку: ");

        boolean data = false;
        while (data == false) {
            if (scanner.hasNextInt()) {
                System.out.println("Ошибка, введите строку");
                str0 = scanner.nextLine().replaceAll(" ", "");
                data = false;
            } else {
                str1 = scanner.nextLine().replaceAll(" ", "");
                data = true;
            }
        }

        reverseString(str1);
        isPalindrome(str1, str2);
        System.out.println("Вы ввели строку (без пробелов): " + str1 + " и строку: " + str2);
        scanner.close();
    }

    public static String reverseString(String str1) {
        return str2 = (new StringBuilder(str1).reverse().toString());
    }

    public static boolean isPalindrome(String str1, String str2) {

        if (str1.equals(str2)) {
            System.out.println("Это палиндром!");
            return true;
        } else {
            System.out.println("Строки разные. Это не палиндром! ");
            return false;
        }
    }
}


