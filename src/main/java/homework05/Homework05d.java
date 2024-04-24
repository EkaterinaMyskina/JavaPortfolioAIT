package homework05;

public class Homework05d {
    public static void main(String[] args) {
        /*Задание с использованием if и логических операторов:

        4. Напишите программу, которая оценивает результаты теста.
                Пусть результат теста хранится в переменной score.
                Если score больше или равно 90, выведите "Отлично",
                если score между 70 и 89 – выведите "Хорошо", если между 50
                и 69 – "Удовлетворительно", и "Неудовлетворительно" во всех остальных случаях.*/
        int score= 91;

        if(score >= 90){
            System.out.println("Отлично");
        }
        else
            if(score >= 70 && score <= 89){
                System.out.println("Хорошо");
            }
            else
                if(score >= 50 && score <= 69){
        System.out.println("Удовлетворительно");
        }
                else
        System.out.println("Неудовлетворительно");
    }
}
