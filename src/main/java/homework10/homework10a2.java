/*
Требования к выполнению задания:
    Использовать switch-case для определения страны производителя и предоставления информации о марке.
    Запрашивать у пользователя ввод марки автомобиля и года его выпуска.
    Предоставлять детализированную информацию на основе года выпуска.
    Включить обработку исключений для управления некорректным вводом года выпуска.
    Выводить сообщение об ошибке, если марка автомобиля не найдена или введены некорректные данные.

Пример работы программы:
    Пользователь вводит марку автомобиля (например, "Ford") и год выпуска (например, "2005").
    Программа определяет, что Ford - это американская марка автомобилей, и предоставляет информацию о том, что в 2005 году были популярны модели Focus и Fusion с акцентом на эко-инновации.
    Если пользователь введет год некорректно (например, текстом), программа должна вывести сообщение об ошибке, указывая на необходимость ввода года выпуска в числовом формате.

 */

package homework10;

import java.util.Scanner;

//public static String brendCar;
//public static int yearCar;
public class homework10a2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите марку автомобиля: ");

        while (scanner.hasNextInt()) {
            System.out.println("Введите верную марку автомобиля: ");
            String brendCar = scanner.next().toLowerCase().trim();
        }
        String brendCar = scanner.next().toLowerCase().trim();

        boolean exit = true;
        System.out.println("Введите год производства автомобиля: ");
        int yearOfCarProduction = scanner.nextInt();
        if (yearOfCarProduction < 1990 || yearOfCarProduction > 2024) {
            while (exit) {
                System.out.println("Вы ошиблись. Ведите верный год: ");
                yearOfCarProduction = scanner.nextInt();
                if (yearOfCarProduction < 1990 || yearOfCarProduction > 2024) {
                    exit = true;
                } else {
                    exit = false;
                }
            }
        }

        switch (brendCar.toLowerCase().trim()) {
            case "audi":
                System.out.println("Audi используют ультрасовременные материалы. Машины " + yearOfCarProduction + " года оснащены электроникой по последнему слову техники. Элегантны и красивы.");
                break;
            case "vw":
                System.out.println("Народная марка в Германии. Каждый второй автомобиль в " + yearOfCarProduction + " году это Фольксваген.");
                break;
            case "bmw":
                System.out.println("Черный бумер и этим все сказано. Для " + yearOfCarProduction + " характерны: мощный движок, тапка в пол и полетелиии!");
                break;
            case "ford":
                System.out.println("Общеизвестная марка из США. Популярные модели " + yearOfCarProduction + " года Focus и Fusion c акцентом на эко-инновации.");
                break;
            case "kia":
                System.out.println("Это машина производства Кореи. В продуктовой линейке " + yearOfCarProduction + " года есть отличная модель EV6 c электробатареей.");
                break;
            default:
                System.out.println("Введена неизвестная марка машины.");


                System.out.println("Машина " + brendCar + " произведена в " + yearOfCarProduction + " году.");
                scanner.close();
        }
    }
}




