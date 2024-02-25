package homework11;

import java.util.Scanner;

import static java.lang.System.out;
import static java.lang.System.setOut;

/*Задание 1

Задание: Напишите программу на Java, которая демонстрирует работу с методами.
Ваша программа должна включать метод calculateArea, который принимает в качестве
аргументов значения типа double: длину и ширину прямоугольника, и возвращает значение его площади.

Также должен быть реализован метод calculatePerimeter, принимающий те же аргументы и возвращающий
периметр прямоугольника.
Главный метод (main) должен считывать значения длины и ширины,
переданные пользователем, вызывать оба эти метода для расчета площади и периметра, и выводить результаты расчетов на экран.
*/
public class homework11a {
    static double square;
    static double perimeter;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину прямоугольника: ");
        double length = scanner.nextInt();
        System.out.println("Введите ширину прямоугольника: ");
        double width = scanner.nextInt();

        calculateArea(length,width);
        calculatePerimeter(length,width);

        System.out.println("Периметр прямоугольника: " + perimeter);
        System.out.println("Площадь прямоугольника: " + square);
        scanner.close();
    }

    public static double calculateArea(double length, double width) {

        square = length * width;
        return(square);
    }

    public static double calculatePerimeter(double length, double width) {
        perimeter = (length + width) * 2;
        return (perimeter);
    }

}


