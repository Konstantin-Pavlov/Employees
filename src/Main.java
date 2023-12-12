
public class Main {

    public static void main(String[] args) {
        Employees employees = new Employees();
        employees.printAllEmployee();
        employees.addNewEmployee(new Employee("Roy Simpson", 2, 15200.50)); //  произошла ошибка - штат укомплектован
        employees.deleteEmployee(7); //  успешно удалили сотрудника
        employees.printAllEmployee();
        employees.addNewEmployee(new Employee("Roy Simpson", 2, 15200.50)); // успешно добавили нового сотрудника
        employees.printAllEmployee();
        employees.printDepartmentsAndEmployees();
    }
}









