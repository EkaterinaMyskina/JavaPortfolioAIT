/*
Класс EmployeeManager:
        Атрибуты:
            employees (List) — список всех сотрудников.
        Методы:
            addEmployee(Employee employee) — добавляет нового сотрудника в систему, при этом проверяет, что сотрудник с таким ID ещё не зарегистрирован.
            updateEmployee(int employeeId, String name, String department, double salary) — обновляет данные сотрудника.
            removeEmployee(int employeeId) — удаляет сотрудника по ID.
            findEmployeeById(int employeeId) — возвращает сотрудника по его ID.
            displayAllEmployees() — выводит информацию о всех сотрудниках.
 */

package homework27;

import java.util.ArrayList;
public class EmployeeManager extends Employee {
    ArrayList<Employee> employee = new ArrayList<>();


    public EmployeeManager(int employeeId, String name, String departement, double salary) {
        super(employeeId, name, departement, salary);
        this.employee = employee;
    }

    public ArrayList<Employee> getEmployee() {
        return employee;
    }

    public void setEmployee(ArrayList<Employee> employee) {
        this.employee = employee;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("homework27.EmployeeManager{");
        sb.append("employee=").append(employee);
        sb.append('}');
        return sb.toString();
    }

    private int addEmployee(Employee employee) {   //добавляет нового сотрудника в систему, при этом проверяет, что сотрудник с таким ID ещё не зарегистрирован.
        if (addEmployee(employee) != getEmployeeId()) {
            addEmployee(employee);
            System.out.println("Мы добавили нового сотрудника: " + employee);
        } else {
            System.out.println("Такой сотрудник уже существует: " + employee);
        }

     /*   private void  updateEmployee(int employeeId, String name, String department,double salary) {  //обновляет данные сотрудника.

        }
*/
        private void removeEmployee (int employeeId){  //удаляет сотрудника по ID.

        }

        private int findEmployeeById ( int employeeId){ //выводит информацию о всех сотрудниках.
            return employeeId;
        }
        private void displayAllEmployees () {  // выводит информацию о всех сотрудниках.
        }
    }
}


