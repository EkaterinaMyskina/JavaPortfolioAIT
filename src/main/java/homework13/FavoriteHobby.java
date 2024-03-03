package homework13;

import java.util.Scanner;

/*
Задача 3: Любимое хобби
Задание: Используя массив хобби (как в задаче 1), попросите пользователя
ввести номер своего любимого хобби из списка. Выведите на экран название выбранного хобби.
Цель: Практика работы с пользовательским вводом и доступом к элементам массива.
 */
public class FavoriteHobby {
    Scanner listOfFavoriteHobbies = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String listOfHobbies[] = new String[]{"бег", "прыжки", "борьба", "бокс", "макраме"};

        System.out.println("Введите цифру вашего любимого хобби из списка: 1-бег, 2- прыжки,3-борьба,4-бокс,5-макраме");
        int hobbyNumber = scanner.nextInt();

        if (hobbyNumber > 1  || hobbyNumber < 6 ) {
            System.out.println("Ваше любимое хобби: " + listOfHobbies[hobbyNumber - 1]);
        }
        else {
            System.out.println("Вы ввели неверные данные.");
        }
        scanner.close();
    }
}


