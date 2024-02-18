package houmework01;

import java.util.Scanner;

public class Homework09a {
/*
Запросить у пользователя выбор операции:
сложение, вычитание, умножение, деление.
Запросить у пользователя ввод двух чисел.
*/

    // Игорь, код немного поправила. Он сложносочиненный, но по минимуму все работает (без проверок на неверный ввод).
    public static void main(String[] args) {
        boolean exit = false;
        double result = 0;

        do {
            Scanner scanner = new Scanner(System.in);

            System.out.println(" Выберите операцию: +, -, *, /. ");
            String operation = scanner.next();

            System.out.println("Введите число 1:");
            double numberOne = scanner.nextDouble();

            System.out.println("Введите число 2:");
            double numberTwo = scanner.nextDouble();

            if (operation.equals("+")) {    // сложение работает
                result = numberOne + numberTwo;
                System.out.println("Результат операции " + operation + " = " + result);
            }
            if (operation.equals("-")) {          //вычитание работает
                result = numberOne - numberTwo;
                System.out.println("Результат операции " + operation + " = " + result);
            }
            if (operation.equals("*")) {              // умножение работает
                result = numberOne * numberTwo;
                System.out.println("Результат операции " + operation + " = " + result);
            }


            if ((operation.equals("/") && (numberTwo != 0))) {  // деление работает
                result = numberOne / numberTwo;
                System.out.println("Результат операции " + operation + " = " + result);
            } else {
                if ((operation.equals("/") && (numberTwo == 0))) {
                    System.out.println("Деление на 0 невозможно. ");
                }
            }

            System.out.println("Вы хотите продолжить расчеты? Введите да или нет: ");
            String userAnswer = scanner.next();
            if (userAnswer.equals("да")) {
                exit = false;
            } else {
                System.out.println("Программа завершена. Спасибо за участие.");
                exit = true;
                scanner.close();
            }
        }
        while (!exit);
    }
}