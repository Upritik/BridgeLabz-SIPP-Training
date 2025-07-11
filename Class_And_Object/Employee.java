public class Employee {
    String name;
    int id;
    double salary;

    // constructor
    public Employee(String name,int id,double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    //method to display employee details
    public void displayDetails(){
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Salary: $" + salary);
    }
    //main method to test the Employee class
    public static void main(String[] args) {
        Employee emp1 = new Employee("John Doe", 101, 50000.00);
        emp1.displayDetails();
        
        Employee emp2 = new Employee("Jane Smith", 102, 60000.00);
        emp2.displayDetails();
    }
}
