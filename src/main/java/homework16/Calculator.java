package homework16;

import java.util.Arrays;

/*
Задание: Создание Утилиты для Анализа Данных с Использованием Varargs
Цель задания:

Понять и применить механизм Varargs для создания функций, способных принимать переменное количество аргументов.
Задачи:

    Базовый Уровень: Создание функции суммирования.
        Создайте функцию sum, которая принимает переменное количество целочисленных
        аргументов и возвращает их сумму.
        Продемонстрируйте работу функции, передав ей различное количество аргументов.

    Средний Уровень: Статистический Анализатор.
        Реализуйте функцию statistics, принимающую переменное количество вещественных
        чисел (double) и выводящую на экран базовую статистику: минимальное значение,
        максимальное значение, среднее значение.
        Для расчета используйте Varargs. Обеспечьте обработку случая, когда аргументы не
        передаются (выведите соответствующее сообщение).

Дополнительно:

    Попробуйте добавить в свою программу обработку ошибок, например, проверку на отрицательные
    числа при суммировании или при расчете статистики.
 */
public class Calculator {
    public static void main(String... sss) {

        sum(1, -2, 3);
        sum(1);
        sum(4, 5, 6, 7, 8);

        statisticalData(1.1);
        statisticalData(2.2, 3.3);
        statisticalData(-4.4, 5.5, 6.6);
    }

    public static int finalResult = 0;

    public static void sum(int... numbers) {
        for (int number : numbers) {
            if (number < 0) {
                System.out.println("Вы ввели отрицательное число. Эту строку складывать отказваюсь!");
                finalResult = 0;
                break;
            } else {
                finalResult = number + finalResult;
            }
        }
        System.out.println("Результат сложения: " + finalResult);
    }

    static double valueMin = 0;
    static double valueMax = 0;
    static double valueEntered = 0;
    static double valueMiddle = 0;

    public static int counter = 0;

    public static void statisticalData(double... values) {
        for (double value : values) {
            if (value < 0) {
                System.out.println("Вы ввели отрицательное число. Я так не играю!");
                valueMiddle = 0;
                valueMin =  0;
                valueMax = 0;
                valueEntered = 0;
                break;
            }

            counter++;
            valueEntered = value;
                if (value <= valueEntered) {
                    valueMin = value;
                } else {
                    valueMax = value;
                }
                if (counter == 1) {
                    valueMax = value;
                }
                valueMiddle = valueMiddle + value;
                System.out.println(value);
            }

            System.out.println("Минимальное значение: " + valueMin);
            System.out.println("Максимальное значение: " + valueMax);
            System.out.println("Среднее значение: " + (String.format("%.2f", valueMiddle / counter))); // String.format("%.2f",... нужен для округления числа формата double, когда вычисляем среднее значение.

        }
    }

