public class Employees {

    Employee[] employeesArray;

    public Employees() {
        employeesArray = generateEmployees();
    }

    private Employee[] generateEmployees() {
        Employee[] employeesArr = new Employee[10];
        employeesArr[0] = new Employee("Roy Jons Sapper", 1, 15600.56);
        employeesArr[1] = new Employee("Janni Cappi Sappi", 5, 11500.12);
        employeesArr[2] = new Employee("Chai Ti Li", 4, 13400.02);
        employeesArr[3] = new Employee("Alla Anya Semenova", 3, 12700.45);
        employeesArr[4] = new Employee("Sara Kalli Liss", 1, 17600.89);
        employeesArr[5] = new Employee("Kya Sin Jei", 2, 15600.78);
        employeesArr[6] = new Employee("Fedor Benni Bil", 4, 18260.45);
        employeesArr[7] = new Employee("lilla Lai Sunndi", 2, 14350.36);
        employeesArr[8] = new Employee("Dedy Dos Tolli", 5, 18600.12);
        employeesArr[9] = new Employee("Donni Li Fu", 3, 18405.01);
        return employeesArr;
    }


    public void printDepartmentsAndEmployees() {
        System.out.println("выводим сотрудников по департаментам");
        for (int i = 1; i <= 5; i++) {
            System.out.printf("department %d Employees list: *** ", i);
            for (Employee employee : employeesArray) {
                if (employee.getDepartment() == i) {
                    System.out.printf("%s *** ", employee.getFullName());
                }
            }
            System.out.println();
        }
        printStars();
    }

    public void addNewEmployee(Employee newEmployee) {
        for (int i = 0; i < employeesArray.length; i++) {
            if (employeesArray[i] == null) {
                employeesArray[i] = newEmployee;
                System.out.println("успешно добавили нового сотрудника");
                printStars();
                return;
            }
        }
        System.out.println("произошла ошибка - штат укомплектован");
        printStars();
    }

    public void deleteEmployee(int id) {
        for (int i = 0; i < employeesArray.length; i++) {
            if (employeesArray[i].getId() == id) {
                employeesArray[i] = null;
                System.out.println("успешно удалили сотрудника");
                printStars();
                return;
            }
        }
        System.out.println("произошла ошибка - сотрудник не найден");
        printStars();
    }

    public void changeEmployeeInfo(String fullName, double newSalary, int newDepartment) {
        for (Employee employee : employeesArray) {
            if (employee.getFullName().equals(fullName)) {
                employee.setSalary(newSalary);
                employee.setDepartment(newDepartment);
                System.out.println("успешно задали новую зарплату и департамент для сотрудника");
                printStars();
                return;
            }
        }
        System.out.println("произошла ошибка - сотрудник не найден");
        printStars();
    }


    public void printAllEmployee() {
        System.out.println("выводим всех сотрудников и их данные");
        for (Employee employee : employeesArray){
            if (employee != null) {
                System.out.println(employee);
            }
        }
        printStars();
    }

    public void calculateTotatlSalary() {
        double totalSalary = 0;
        for (Employee employee : employeesArray) {
            if (employee != null) {
                totalSalary += employee.salary;
            }
        }
        System.out.println("Total salary of all employee - " + totalSalary);
        printStars();
    }

    public void findAnEmployeeMinSalary() {
        Employee minSalary = employeesArray[0];
        for (Employee employee : employeesArray) {
            if (employee != null && employee.getSalary() < minSalary.getSalary()) {
                minSalary = employee;
            }
        }
        System.out.println(" Minimum wage for workers - " + minSalary.getFullName() + "-" + minSalary.getSalary());
        printStars();
    }

    public void findAnEmployeeMaxSalary() {
        Employee maxSalary = employeesArray[0];
        for (Employee employee : employeesArray) {
            if (employee != null && employee.getSalary() > maxSalary.getSalary()) {
                maxSalary = employee;
            }
        }
        System.out.println(" Maximum wage for workers - " + maxSalary.getFullName() + "-" + maxSalary.getSalary());
        printStars();
    }

    public void calculateAvarageSalary() {
        double totalSum = 0;
        double avarageSum;
        for (Employee employee : employeesArray) {
            totalSum += employee.getSalary();
        }
        avarageSum = totalSum / employeesArray.length;
        System.out.println("Avarage salary - " + avarageSum);
        printStars();
    }

    public void printEmployeeFullName() {
        for (Employee employee : employeesArray) {
            if (employee != null) {
                System.out.println("Employee full name - " + employee.getFullName());
            }
        }
        printStars();
    }

    private void printStars(){
        System.out.println("\n" + "*".repeat(42) + "\n");
    }
}
