import java.util.Objects;

public class Employee {
    private final String employeeFullName;
    private int employeeDivision;
    private int employeeSalary;
    private final int id;
    static int count = 1;

    public Employee(String employeeFullName, int employeeDivision, int employeeSalary) {
        this.employeeFullName = employeeFullName;
        this.employeeDivision = employeeDivision;
        this.employeeSalary = employeeSalary;
        this.id = count++;
    }

    public int getId() {
        return id;
    }

    public String getEmployeeFullName() {
        return employeeFullName;
    }

    public int getEmployeeDivision() {
        return employeeDivision;
    }

    public int getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(int employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    public void setEmployeeDivision(int employeeDivision) {
        this.employeeDivision = employeeDivision;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return employeeDivision == employee.employeeDivision && employeeSalary == employee.employeeSalary &&
                Objects.equals(employeeFullName, employee.employeeFullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeFullName, employeeDivision, employeeSalary);
    }

    @Override
    public String toString() {
        return id + ". " + "Ф.И.О. сотрудника: " + employeeFullName + ", подразделение: " +
                employeeDivision + ", заработная плата: " + employeeSalary;
    }
}
