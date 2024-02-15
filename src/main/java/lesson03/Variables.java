package lesson03;

public class Variables {
    // -128 до 127 1 байт
        static byte age = 12;

    // -32768 до 32767 2 байт
        static short preis = 10000;

    // -32768 до 32767 4 байт
        static int number;
        static long bigNumberPeople = 343434343434L;
        static float euroPreis = 0.85f;
        static double dollarPreis = 0.855;
        static char charLetter = 'A';
        static boolean result;
        static String text = "Hello!";

public static void main (String[] args) {

    System.out.println("Возраст " + age);
    System.out.println("Курс валюты евро/доллар " + euroPreis);
    System.out.println(charLetter);
    System.out.println(text);
    System.out.println(result);
    System.out.println(number);
    }
}
