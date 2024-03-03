package homework13;
/*
Задача 1: Список хобби

Задание: Создайте массив строк, который содержит список хобби
(например, "рисование", "программирование", "велоспорт").
Выведите все хобби из массива на экран.
Цель: Практика создания массивов и итерации по элементам массива.
 */
public class ListOfHobby {
    public static void main(String[] args) {
        String [] ListOfHobbies = new String[] {"рисование", "программирование","велоспорт"};
        for (int i = 0; i <= ListOfHobbies.length; i++) {
            System.out.println(ListOfHobbies[i]);
        }
    }
}
