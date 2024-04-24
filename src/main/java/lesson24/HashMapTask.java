/*
    Создайте HashMap, который будет хранить имена студентов
    (тип String) и их оценки (тип Integer).
    Добавьте в HashMap данные трех студентов:
    Иван (оценка 5), Светлана (оценка 4) и Алексей (оценка 3).
     */
package lesson24;
import java.util.HashMap;
import java.util.Map;

public class HashMapTask {
    public static void main(String[] args) {

        HashMap<String, Integer> studentGrades = new HashMap<>();
        studentGrades.put("Иван", 5);
        studentGrades.put("Светлана", 4);
        studentGrades.put("Алексей", 3);
            /*
            Используя HashMap из предыдущего упражнения,
            получите и напечатайте оценку Светланы.
             */

        Integer svetlanaGrade = studentGrades.get("Светлана");
        System.out.println("Оценка Светланы: " + svetlanaGrade);


/*
проверьте, содержится ли в вашем Hash Map cтудент с именем Антон.
 */
        if (studentGrades.containsKey("Антон")) {
            System.out.println("Антон найден");
        } else {
            System.out.println("Антон не найден");
        }
        studentGrades.remove("Алексей");
        System.out.println(studentGrades);
    /*
  Напечатайте имена и оценки всех студентов из HashMap.
    Используйте для этого метод entrySet() и расширенный цикл for
     */

        System.out.println("Имена и оценки всех студентов");
        for (Map.Entry<String, Integer> entry : studentGrades.entrySet()) {
            String name = entry.getKey();
            Integer grade = entry.getValue();
            System.out.println(name + " :" + grade);
        }

    /*
    Измените оценку Светланы на 5 в вашем HashMap. Проверьте,
    была ли оценка изменена, и выведите содержимое HashMap после изменения.
     */

        studentGrades.replace("Светлана", 5);
        System.out.println(studentGrades);
    /*
    Напечатайте имена всех студентов,
    у которых оценка равна 5, используя HashMap `studentGrades`.
     */
        for (Map.Entry<String, Integer> entry : studentGrades.entrySet()) {
            String name = entry.getKey();
            Integer grade = entry.getValue();
            if (grade == 2) {
                System.out.println(name);
            }
            /*
            Очистите HashMap `studentGrades` от всех записей.
            Проверьте, пуст ли он после этого, и выведите соответствующее сообщение.
             */

            studentGrades.clear();
            if (studentGrades.isEmpty()){
            System.out.println("HashMap studentGrades пуст после очистки.");}
            else {
                System.out.println("HashMap studentGrades не может быть очищен. ");}
            }
        }
    }

