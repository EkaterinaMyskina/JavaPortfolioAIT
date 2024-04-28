/*
Задание: Разработка и рефакторинг системы учета сотрудников
Цель задания

Ваша задача — создать систему для управления информацией о сотрудниках компании с
использованием принципов инкапсуляции. Система должна обеспечивать безопасный доступ к
данным сотрудников, позволяя регистрировать, обновлять и извлекать информацию о каждом сотруднике.
Описание системы

Система должна состоять из следующих компонентов:

    Класс Employee:
        Атрибуты:
            employeeId (int) — уникальный идентификатор сотрудника.
            name (String) — имя сотрудника.
            department (String) — отдел, в котором работает сотрудник.
            salary (double) — заработная плата сотрудника.
        Методы:
            Конструктор для инициализации всех атрибутов.
            Геттеры и сеттеры для всех атрибутов, при этом сеттер для employeeId должен предотвращать изменение ID после его первоначальной установки.
            Метод displayInfo(), который выводит информацию о сотруднике.

    Класс EmployeeManager:
        Атрибуты:
            employees (List) — список всех сотрудников.
        Методы:
            addEmployee(Employee employee) — добавляет нового сотрудника в систему, при этом проверяет, что сотрудник с таким ID ещё не зарегистрирован.
            updateEmployee(int employeeId, String name, String department, double salary) — обновляет данные сотрудника.
            removeEmployee(int employeeId) — удаляет сотрудника по ID.
            findEmployeeById(int employeeId) — возвращает сотрудника по его ID.
            displayAllEmployees() — выводит информацию о всех сотрудниках.

Задачи

    Разработка:
        Реализуйте класс Employee с необходимыми полями, методами и инкапсуляцией.
        Создайте класс EmployeeManager, который будет управлять списком сотрудников с использованием коллекций.

    Рефакторинг и инкапсуляция:
        Убедитесь, что все аспекты управления данными сотрудников защищены и инкапсулированы.
        Проверьте, что классы корректно обрабатывают ошибочные сценарии, такие как попытка
        добавления сотрудника с уже существующим ID.

    Тестирование:
        Напишите несколько тестовых случаев, используя JUnit или другую библиотеку
        для тестирования в Java, чтобы проверить функциональность вашей системы.


 */

package homework27;

import java.util.ArrayList;

public class TestEmployee {

    public static void main(String[] args) {

        Employee employee1 = new Employee(1, "Ivan Ivanich", "Accounting", 1000);
        EmployeeManager employeeManager = new EmployeeManager();
        employeeManager.addEmployee(employee1);
        Employee employee2 = new Employee(1, "Petr Petrovich", "Office worker", 1500);
        employeeManager.addEmployee(employee2);

        employeeManager.displayAllEmployees();

        employeeManager.findEmployeeById(3);
    }
}
