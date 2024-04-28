/*
Класс Employee:
        Атрибуты:
            employeeId (int) — уникальный идентификатор сотрудника.
            name (String) — имя сотрудника.
            department (String) — отдел, в котором работает сотрудник.
            salary (double) — заработная плата сотрудника.
        Методы:
            Конструктор для инициализации всех атрибутов.
            Геттеры и сеттеры для всех атрибутов, при этом сеттер для employeeId
            должен предотвращать изменение ID после его первоначальной установки.
            Метод displayInfo(), который выводит информацию о сотруднике.
 */

package homework27;

public class Employee {
    private final int employeeId;
    private String name;
    private String department;
    private double salary;

    public Employee(int employeeId, String name, String department, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    public String displayInfo() {
        System.out.println("\n");
        final StringBuffer sb = new StringBuffer("Employee: " + ("\n"));
        sb.append("department= ").append(department).append("\n");
        sb.append("employeeId= ").append(employeeId).append("\n");
        sb.append("name= ").append(name).append("\n");
        return sb.toString();
    }
}
