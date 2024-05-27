/*
Упражнение: Обработка исключений для приготовления напитков
Описание

Вам нужно создать программу, которая будет симулировать процесс приготовления напитков.
В программе будет массив с названиями доступных напитков. Пользователь вводит номер напитка,
который он хочет приготовить. Ваша задача — обработать возможные исключения, которые могут
возникнуть при неправильном вводе данных.
Задачи

    Создайте массив с названиями напитков (например, "Кофе", "Чай", "Сок").
    Запросите у пользователя ввод номера напитка, который он хочет приготовить.
    Используйте блок try-catch, чтобы обработать следующие возможные исключения:
        Ввод нецелого числа (NumberFormatException).
        Ввод номера, который выходит за пределы массива (ArrayIndexOutOfBoundsException).
    Если введен корректный номер, выведите сообщение о том, что напиток готовится.
    Используйте блок finally, чтобы вывести сообщение о завершении программы независимо от результата.

Ожидаемый результат

    При вводе корректного номера: сообщение о приготовлении выбранного напитка.
    При вводе некорректного номера или нецелого числа: соответствующее сообщение об ошибке.
    В любом случае сообщение о завершении программы в блоке finally.


 */

package homework35;


import java.util.InputMismatchException;
import java.util.Scanner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DrinksManager {
    private static int choosenDrink;
    private static final Logger LOGGER = LoggerFactory.getLogger(DrinksManager.class);
    static String[] drinks = new String[]{"Чай","Кофе","Сок"};

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        try {
            // Код, который может вызвать исключение

            System.out.println("Please make your choice of a drink: 1-TEA, 2-COFFEE, 3-JUICE ");
            choosenDrink = scanner.nextInt();

            System.out.println("Напиток " + drinks[choosenDrink - 1] + " готовится. Время ожидания - 40 секунд.");


        } catch (InputMismatchException exception) {
            // Обработка исключения типа ExceptionType0
            System.out.println("Введены неверные данные.");

            System.out.println("Извините, похоже сегодня мы не можем вас обслужить.");
            LOGGER.error("Wrong data input");
            LOGGER.error(exception.getLocalizedMessage());


        } catch (NumberFormatException e1) {
            // Обработка исключения типа ExceptionType1
            //   if (choosenDrink % 1 == 0) {
            System.out.println("Введено не целое число. ");
            LOGGER.error("Digit is not integer");
            LOGGER.error(e1.getLocalizedMessage());


        } catch (ArrayIndexOutOfBoundsException e2) {
            // Обработка исключения типа ExceptionType2
            //    { if ((choosenDrink < 1) || (choosenDrink > 3)){
            System.out.println("Введеное число не равно 1,2 или 3.");

            System.out.println("Извините, похоже сегодня мы не можем вас обслужить.");
            LOGGER.error("Digit is not equal 1,2 or 3");
            LOGGER.error(e2.getLocalizedMessage());
        }


         finally {
            // Код, который будет выполнен в любом случае
            System.out.println("Спасибо, что воспользовались нашим сервисом.");
            scanner.close();
        }
    }
}


