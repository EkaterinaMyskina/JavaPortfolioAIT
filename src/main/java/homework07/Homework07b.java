/*
Задание 2:
Напишите программу для тестирования знаний.
Программа должна задать три вопроса связанных с программированием.

Ответом на первый вопрос должно быть да/нет,
на второй вопрос один вариант ответа из трех (a, b, c),
на третий вопрос открытый ответ (надо ввести ответ вручную)

Если пользователь правильно ответил хотябы на два вопроса, вывести сообщение "Вы хорошо знаете программирование!",
в противном случае вывести "Вам нужно учиться больше!".
 */

package homework07;
import java.util.Scanner;

public class Homework07b {

    static public void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rightAnswers = 0;

        System.out.println("Тест. Силен ли ты в программировании?");
        System.out.println("Нужно ли в процессе разработки программ на Java использовать JRE? Отвечайте yes или no.");
        String firstQuestion = scanner.next();
        System.out.println("Выберите сложный тип переменной в Java: ");
        System.out.println("Вариант: a - char ");
        System.out.println("Вариант: b - integer ");
        System.out.println("Вариант: c - byte");
        System.out.println("Укажите только один вариант a,b или с: ");
        String secondQuestion = scanner.next();
        System.out.println("В чем разница передачи параметров по ссылке и значению?");
        String thirdQuestion = scanner.next();

        if  (firstQuestion.equals("yes")) {
            rightAnswers += 1;
            System.out.println("Ответ 1 верный. JRE (Java Runtime Enviroment)– это один из трех компонентов платформы Java," +
                    "которые необходимы для успешного выполнения любой программы на Java.");
        }
        else {
            System.out.println("Ответ 1 неверный. JRE (Java Runtime Enviroment)– это один из трех компонентов платформы Java," +
                    "которые необходимы для успешного выполнения любой программы на Java.");
        }

        if (secondQuestion.equals("b")) {
            rightAnswers += 1;
            System.out.println("Ответ 2 верный. Integer - это сложный тип переменной, описывающий целые числа, находящиеся в промежутке -2147483648 до 2147483647");
        }
        else {
            System.out.println("Ответ 2 неверный. Integer - это сложный тип переменной, описывающий целые числа, находящиеся в промежутке -2147483648 до 2147483647");
        }

        if (thirdQuestion == null)
             {
            System.out.println("Ответ 3: Просто нет слов?");
            }
        else
        {
            rightAnswers += 1;
            System.out.println("Ответ 3: Интересно описано, но ничего не понятно.");
        }

        if ( rightAnswers >= 2){
            System.out.println("Вы хорошо знаете программирование!");
        } else {
            System.out.println("Приходите учиться в школу программирования!");
               }
    System.out.println("Количество верных ответов: " + rightAnswers);
        scanner.close();
    }
}
