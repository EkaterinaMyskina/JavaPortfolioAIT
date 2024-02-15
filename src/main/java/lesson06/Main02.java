package lesson06;//package lesson07;
import java.util.Scanner;

import static java.lang.System.out;

/*
Сделать программу-предсказатель будущего:
в нее нужно ввести свое имя и дату рождения,
а она скажет насколько счастливая жизнь вас ожидает
 */
public class Main02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Как вас зовут?");

        String name = scanner.nextLine();
        System.out.println("Введите день рождения");
        int day = scanner.nextInt();
        System.out.println("Введите месяц рождения (числом)");
        int month = scanner.nextInt();
        System.out.println("Введите год рождения");
        int year = scanner.nextInt();

        double result = (name.length() + day * month + year);
        result = Math.sin(result);
        if (result < 0.15) {
            System.out.println("У вас будет обычная жизнь");
        } else if (result < 0.25) {
            System.out.println("У вас будет редко веселая жизнь");
        } else if (result < 0.7) {
            System.out.println("У вас будет хорошая жизнь");
        } else if (result < 0.95) {
            System.out.println("У вас будет отличная жизнь");
        }
    }
}

