
public class Employee {
    static int idCount;
    int id;
    String fullName;
    int department;
    double salary;

    public Employee(String fullName, int department, double salary) {
        this.id = idCount;
        idCount++;
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public int getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public void setFullName() {
        this.fullName = fullName;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String toString() {
        return String.format("Employees: Full name - %-20s Department - %-2s Salary - %-10.2f ID - %-2d", fullName, department, salary, id);
//        return "Employees: Full name - " + fullName + " Department - " + department + " Salary - " + salary;
    }
}