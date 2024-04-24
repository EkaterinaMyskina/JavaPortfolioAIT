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
    private int employeeId;
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

    private void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
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

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("homework27.Employee{");
        sb.append("department='").append(department).append('\'');
        sb.append(", employeeId=").append(employeeId);
        sb.append(", name='").append(name).append('\'');
        sb.append(", salary=").append(salary);
        sb.append('}');
        return sb.toString();
    }

    private static void displayInfo(){
        System.out.println("Наш лучший работник.");
    }

}
