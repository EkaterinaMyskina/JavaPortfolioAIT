package houmework01;

public class Homework05c {
    public static void main(String[] args) {

        /*
       3. Задание на логические операторы:
        Напишите программу, которая проверяет, соответствует ли введенный возраст
        условиям для получения водительских прав. В разных странах возраст,
        когда можно начать учиться водить машину, может отличаться.
        Пусть в вашей программе минимальный возраст будет 16 лет, а максимальный – 75 лет.
        Программа должна выводить true, если возраст соответствует условиям, и false – если нет.         */

        int age = 76;
        boolean isCheck = false;
        if(age >= 16 && age <= 75){
            isCheck = true;
            System.out.println(isCheck);
        }
        else
            System.out.println(isCheck);
    }
}
