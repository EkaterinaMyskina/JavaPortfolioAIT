package homework06;

import java.util.Scanner;
/*
3. Калькулятор Оценок: Создайте программу, которая запрашивает
 у пользователя оценки по пяти предметам, затем рассчитывает и выводит средний балл. */

public class Homework06c {

    static Scanner scanner = new Scanner(System.in);

 public static void main(String [] args) {
     System.out.println("Введите оценку по математике: ");
     int mathEvaluation = scanner.nextInt();
     System.out.println("Введите оценку по русскому языку: ");
     int russianEvaluation = scanner.nextInt();
     System.out.println("Введите оценку по литературе: ");
     int literatureEvaluation = scanner.nextInt();
     System.out.println("Введите оценку по химии: ");
     int chemistryEvaluation = scanner.nextInt();
     System.out.println("Введите оценку по истории: ");
     int historyEvaluation = scanner.nextInt();

   double averageEvaluation = (double) (mathEvaluation + russianEvaluation + literatureEvaluation + chemistryEvaluation + historyEvaluation)/5;
   System.out.println("Средний балл по пяти предметам: " + averageEvaluation);

     scanner.close();

 }
}
