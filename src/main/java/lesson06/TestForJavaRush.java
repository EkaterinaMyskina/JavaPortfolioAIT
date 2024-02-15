package lesson06;

import org.jetbrains.annotations.NotNull;
import org.w3c.dom.ls.LSOutput;

public class TestForJavaRush {

 /*
Минимум четырех чисел
*/

  //public class Main {
        public static void main(String[] args) {
            Cat cat =  new Cat(); // Tом - возвращенное значение из класса Toм

            System.out.println(cat.name); // print Tom
            changeName(cat); // go to object changeName
            System.out.println(cat.name); // print Jerry
        }

        public static void changeName(Cat cat) {
            cat.name = "Jerry";
        }

        public static class Cat {
            String name = "Tom";



        }
    }



