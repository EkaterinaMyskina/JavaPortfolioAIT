package homework14;
/*
Задание: Учет животных в зоопарке

Цель задания: Практика в использовании массивов и методов в Java для управления информацией о животных в зоопарке.
Задача: Вам нужно создать программу для учета животных в зоопарке, используя только массивы и базовые методы.
Программа должна позволять хранить названия видов животных и соответствующие им звуки, которые они издают.
Шаги:

    Создание массивов:
        Создайте два массива строк: один для хранения названий видов животных (String[] animalSpecies),
        другой — для звуков, которые они издают (String[] animalSounds).

    Инициализация массивов:
        Инициализируйте массивы с данными нескольких животных. Например, "Лев", "Слон", и "Обезьяна"
        для animalSpecies и соответствующие звуки для animalSounds.

    Вывод информации о животных:
        Реализуйте метод printAnimalSounds, который принимает оба массива и выводит информацию о каждом животном
        и звуке, который оно издает.

    Поиск животного по названию:
        Дополнительно, реализуйте метод findAnimalSound, который принимает название животного и оба массива,
        ищет это животное в массиве animalSpecies и выводит соответствующий звук из animalSounds.

 */

public class Zoo {
    private static int i = 0;
    private static int j = 0;

    public static void main(String[] args) {
        String[] animalSpecies = {"Лев", "Слон", "Обезьяна"};
        String[] animalSounds = {"Ррр", "Ууу", "Блаблабла"};
        String[] animalNew = {"Обезьяна","Лев","Слон"};

        printAnimalSounds(animalSpecies, animalSounds);
        findAnimalSound (animalNew, animalSpecies, animalSounds);
    }

        public static void printAnimalSounds (String[]animalSpecies, String[]animalSounds) {


            for (i = 0; i < animalSpecies.length; i++) {
                System.out.println(animalSpecies[i] + " издает звук: " + animalSounds[i]);

            }
        }
        /*
        Поиск животного по названию:
        Дополнительно, реализуйте метод findAnimalSound, который принимает название животного и оба массива,
        ищет это животное в массиве animalSpecies и выводит соответствующий звук из animalSounds.
*/
            public static void findAnimalSound (String[] animalNew, String[] animalSpecies, String[]animalSounds) {
                for (i = 0; i < animalSpecies.length; i++) {
                    for (j=0; j< animalNew.length; j++) {
                        if (animalNew[j].equals(animalSpecies[i])) {
                            System.out.println("Животное " + animalNew[j] + " издает звук: " + animalSounds[i]);
                            break;
                        }
                        else {continue;}
                    }

                }
            }
        }




