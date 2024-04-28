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
import java.util.List;
import org.apache.xmlbeans.impl.xb.ltgfmt.FileDesc;
import org.springframework.security.access.prepost.PreAuthorize;

public class EmployeeManager {

    private ArrayList<Employee> employees = new ArrayList<>();

    public void addEmployee(Employee employeeToSave) {
        if (!checkEmployee(employeeToSave)) { // если методв employeeToSave возвращает false, то все хорошо и мы передаем в employees значение, которое вернул нам метод employToSave
            employees.add(employeeToSave);
            System.out.println("Employee " + employeeToSave.getName() + " added to the list");
        } else {
            System.out.println("Employee already exist");
        }
    }

    //@PreAuthorize("hasRole('ROLE ADMIN')")
//       FileDesc.Role(ADMIN)
    public void updateEmployee(int employeeId, String name, String department, double salary) {
        for (Employee employee : employees) {
            if (employee.getEmployeeId() == employeeId) {
                employee.setName(name);
                employee.setDepartment(department);
                employee.setSalary(salary);
                System.out.println("Employee information updated");
                return;
            }
        }
        System.out.println("Employee with ID " + employeeId + " not found");
    }

    public void removeEmployee(int employeeId) {
        boolean removeResult = employees.removeIf(employee -> employee.getEmployeeId() == employeeId);
        if (removeResult) {
            System.out.println("Employer " + employeeId + " was removerd from list");
        } else {
            System.out.println("Employer with ID " + employeeId + " not found");
        }
    }

    public Employee findEmployeeById(int employeeId) {
        for (Employee employee : employees) {
            if (employee.getEmployeeId() == employeeId) {
                System.out.println("Employee with ID " + employeeId + " found");
                return employee;
            }
        }
        System.out.println("Employee with ID " + employeeId + " not found");
        return null;
    }

    public void setName(int employeeId, String name) {
        for (Employee employee : employees) {
            if (employee.getEmployeeId() == employeeId) {
                employee.setName(name);
                System.out.println("Employee information name was updated");
            }
        }
    }

    private boolean checkEmployee(Employee employeeToCheck) {
        for (Employee employee : employees) {
            if (employeeToCheck.getEmployeeId() == employeeToCheck.getEmployeeId()) {
                System.out.println("Employee with ID " + employeeToCheck.getEmployeeId() + " already exist");
                return true;
            }
        }
        return false;
    }

    public void displayAllEmployees() {
        if (employees.isEmpty()) {
            System.out.println("Employee list is empty");
        }
        for (Employee employee : employees) {
            System.out.println(employee.displayInfo());
        }
    }
}

