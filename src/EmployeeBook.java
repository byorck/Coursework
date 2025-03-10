public class EmployeeBook {
    private static final Employee[] employeeBook = new Employee[10];

    public static void printingAllEmployeesInformation() {
        for (int i = 0; i < employeeBook.length; i++) {
            if (employeeBook[i] != null) {
                System.out.println(employeeBook[i]);
            }
        }
    }

    public static int salaryCosts() {
        int sum = 0;
        for (int i = 0; i < employeeBook.length; i++) {
            if (employeeBook[i] != null) {
                sum = sum + employeeBook[i].getEmployeeSalary();
            }
        }
        return sum;
    }

    public static Employee minSalary() {
        Employee minValueEmployee = null;
        int minSalary = Integer.MAX_VALUE;
        for (int i = 0; i < employeeBook.length; i++) {
            if (employeeBook[i] != null && employeeBook[i].getEmployeeSalary() < minSalary) {
                minValueEmployee = employeeBook[i];
                minSalary = employeeBook[i].getEmployeeSalary();
            }
        }
        return minValueEmployee;
    }

    public static Employee maxSalary() {
        Employee maxValueEmployee = null;
        int maxSalary = Integer.MIN_VALUE;
        for (int i = 0; i < employeeBook.length; i++) {
            if (employeeBook[i] != null && maxSalary < employeeBook[i].getEmployeeSalary()) {
                maxValueEmployee = employeeBook[i];
                maxSalary = employeeBook[i].getEmployeeSalary();
            }
        }
        return maxValueEmployee;
    }

    public static double averageSalary() {
        int counter = 0;
        int sum = 0;
        for (int i = 0; i < employeeBook.length; i++) {
            if (employeeBook[i] != null) {
                counter++;
                sum = sum + employeeBook[i].getEmployeeSalary();
            }
        }
        return (double) sum / counter;
    }

    public static void printingAllNames() {
        for (int i = 0; i < employeeBook.length; i++) {
            if (employeeBook[i] != null) {
                System.out.println(employeeBook[i].getEmployeeFullName());
            }
        }
    }

    public static void indexationSalaryAllEmployees(int percent) {
        for (int i = 0; i < employeeBook.length; i++) {
            if (employeeBook[i] != null) {
                employeeBook[i].setEmployeeSalary(employeeBook[i].getEmployeeSalary() + employeeBook[i].getEmployeeSalary() * percent / 100);
            }
        }
    }

    public static Employee minDivisionSalary(int division) {
        Employee minValueEmployee = null;
        int minSalary = Integer.MAX_VALUE;
        for (int i = 0; i < employeeBook.length; i++) {
            if (employeeBook[i] != null && employeeBook[i].getEmployeeSalary() < minSalary && division ==
                    employeeBook[i].getEmployeeDivision()) {
                minValueEmployee = employeeBook[i];
                minSalary = employeeBook[i].getEmployeeSalary();
            }
        }
        return minValueEmployee;
    }

    public static Employee maxDivisionSalary(int division) {
        Employee maxValueEmployee = null;
        int maxSalary = Integer.MIN_VALUE;
        for (int i = 0; i < employeeBook.length; i++) {
            if (employeeBook[i] != null && maxSalary < employeeBook[i].getEmployeeSalary() && division == employeeBook[i].getEmployeeDivision()) {
                maxValueEmployee = employeeBook[i];
                maxSalary = employeeBook[i].getEmployeeSalary();
            }
        }
        return maxValueEmployee;
    }

    public static int salaryCostsDivision(int division) {
        int sum = 0;
        for (int i = 0; i < employeeBook.length; i++) {
            if (employeeBook[i] != null && division == employeeBook[i].getEmployeeDivision()) {
                sum = sum + employeeBook[i].getEmployeeSalary();
            }
        }
        return sum;
    }

    public static double averageSalaryDivision(int division) {
        int counter = 0;
        int sum = 0;
        for (int i = 0; i < employeeBook.length; i++) {
            if (employeeBook[i] != null && division == employeeBook[i].getEmployeeDivision()) {
                counter++;
                sum = sum + employeeBook[i].getEmployeeSalary();
            }
        }
        return (double) sum / counter;
    }

    public static void indexationSalaryDivisionEmployees(int division, int percent) {
        for (int i = 0; i < employeeBook.length; i++) {
            if (employeeBook[i] != null && division == employeeBook[i].getEmployeeDivision()) {
                employeeBook[i].setEmployeeSalary(employeeBook[i].getEmployeeSalary() + employeeBook[i].getEmployeeSalary() * percent / 100);
            }
        }
    }

    public static void printingAllDivisionNames(int division) {
        for (int i = 0; i < employeeBook.length; i++) {
            if (employeeBook[i] != null && division == employeeBook[i].getEmployeeDivision()) {
                System.out.println(employeeBook[i].getId() + ". " + "Ф.И.О. сотрудника отдела: " + employeeBook[i].getEmployeeFullName() +
                        ", заработная плата: " + employeeBook[i].getEmployeeSalary());
            }
        }
    }

    public static void findEmployeeBySalaryEqualsOrGreater(int number) {
        for (int i = 0; i < employeeBook.length; i++) {
            if (employeeBook[i] != null && employeeBook[i].getEmployeeSalary() >= number) {
                System.out.println(employeeBook[i].getId() + ". " + "Ф.И.О. сотрудника отдела: " + employeeBook[i].getEmployeeFullName() +
                        ", заработная плата: " + employeeBook[i].getEmployeeSalary());
            }
        }
    }

    public static void findEmployeeBySalaryLess(int number) {
        for (int i = 0; i < employeeBook.length; i++) {
            if (employeeBook[i] != null && employeeBook[i].getEmployeeSalary() < number) {
                System.out.println(employeeBook[i].getId() + ". " + "Ф.И.О. сотрудника отдела: " + employeeBook[i].getEmployeeFullName() +
                        ", заработная плата: " + employeeBook[i].getEmployeeSalary());
            }
        }
    }

    public static boolean addEmployee(Employee employee) {
        for (int i = 0; i < employeeBook.length; i++) {
            if (employeeBook[i] == null) {
                employeeBook[i] = employee;
                break;
            }
        }
        return false;
    }

    public static void deleteEmployeeWithID(int id) {
        for (int i = 0; i < employeeBook.length; i++) {
            if (employeeBook[i] != null && employeeBook[i].getId() == id) {
                employeeBook[i] = null;
                break;
            }
        }
    }

    public static Employee findEmployeeWithID(int id) {
        for (int i = 0; i < employeeBook.length; i++) {
            if (employeeBook[i] != null && employeeBook[i].getId() == id) {
                return employeeBook[i];
            }
        }
        return null;
    }

}

