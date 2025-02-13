public class Main {
    public static void main(String[] args) {

        EmployeeBook.addEmployee(new Employee("Иванов Иван Иванович", 1, 35000));
        EmployeeBook.addEmployee(new Employee("Сидоров Сидор Сидорович", 2, 42000));
        EmployeeBook.addEmployee(new Employee("Романов Роман Романович", 1, 36000));
        EmployeeBook.addEmployee(new Employee("Петров Петр Петрович", 2, 37000));
        EmployeeBook.addEmployee(new Employee("Дмитриев Дмитрий Дмитриевич", 2, 34650));
        EmployeeBook.addEmployee(new Employee("Сергеев Сергей Сергеевич", 5, 38000));
        EmployeeBook.addEmployee(new Employee("Алексеев Алексей Алексеевич", 4, 39000));
        EmployeeBook.addEmployee(new Employee("Максимов Максим Максимович", 3, 40000));
        EmployeeBook.addEmployee(new Employee("Максимов Максим Максимович", 3, 40000));
        EmployeeBook.addEmployee(new Employee("Максимов Максим Максимович", 3, 40000));
        EmployeeBook.addEmployee(new Employee("Лишний Максим Максимович", 3, 40000));

        EmployeeBook.printingAllEmployeesInformation();
        System.out.println("Сумма затрат на ЗП в месяц: " + EmployeeBook.salaryCosts());
        System.out.println("Сотрудник с минимальной ЗП: " + EmployeeBook.minSalary());
        System.out.println("Сотрудник с максимальной ЗП: " + EmployeeBook.maxSalary());
        System.out.println("Среднее значение ЗП: " + EmployeeBook.averageSalary());
        EmployeeBook.printingAllNames();
        EmployeeBook.indexationSalaryAllEmployees(7);
        EmployeeBook.printingAllEmployeesInformation();
        System.out.println("Сотрудник с максимальной ЗП в отделе: " + EmployeeBook.maxDivisionSalary(2));
        System.out.println("Сотрудник с минимальной ЗП в отделе: " + EmployeeBook.minDivisionSalary(2));
        EmployeeBook.printingAllDivisionNames(2);
        System.out.println("Сумма затрат на ЗП в месяц в отделе: " + EmployeeBook.salaryCostsDivision(2));
        EmployeeBook.findEmployeeBySalaryEqualsOrGreater(39000);
        System.out.println("Среднее значение ЗП в отделе: " + EmployeeBook.averageSalaryDivision(2));
        EmployeeBook.indexationSalaryDivisionEmployees(2, 5);
        EmployeeBook.findEmployeeBySalaryLess(39000);
        EmployeeBook.deleteEmployeeWithID(7);
        EmployeeBook.printingAllEmployeesInformation();
        EmployeeBook.deleteEmployeeWithID(9);
        EmployeeBook.printingAllEmployeesInformation();
        System.out.println(EmployeeBook.findEmployeeWithID(10));
    }
}