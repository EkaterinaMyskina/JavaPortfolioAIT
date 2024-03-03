package homework13;
/*
Задача 2: Поиск хобби

Задание: Дан массив хобби (как в задаче 1). Напишите программу,
которая ищет в массиве заданное хобби и выводит на экран
сообщение о том, есть ли оно в списке.
Цель: Практика поиска элементов в массиве.
 */
import java.util.Scanner;
public class LookingForHobby {
    static Scanner scanner = new Scanner(System.in);
    static int i = 0;
    static int j = 0;
    public static void main(String[] args) {

        String[] ListOfHobbies = new String[]{"бег", "пение", "рыбалка", "переворачивание пингвинов", "вязание", "гонки на верблюдах", "прыжки в ширину"};
        System.out.println("Введите название хобби: ");
        String hobby = scanner.nextLine().toLowerCase().trim();

        while (hobby.matches("-?\\d+")) {  // в данной строке мы проверяем, является ли введенная информация строкой, либо цифрами
            System.out.println("Вы ввели неверные данные. Повторите ввод: ");
            hobby= scanner.nextLine().toLowerCase().trim();
        }

        for (i=0; i <= ListOfHobbies.length-1; i++) {
                if (ListOfHobbies[i].equals(hobby)) {
                System.out.println("Мы нашли ваше хобби в базе данных. Ваше хобби: " + ListOfHobbies[i]);
                j= 1;
               break;
            }
                else
                {j=0;}
        }
        if (j != 1) {
            System.out.println("Вашего хобби нет в нашей базе данных.");
        }
        scanner.close();
    }
}





