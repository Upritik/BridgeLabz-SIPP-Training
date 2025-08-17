package EncapsulationPolymorphism;

public class EmployeeManagement {
    public static void main(String[] args) {
        FullTimeEmployee employee1=new FullTimeEmployee("employee1",10000);
        employee1.displayDetails();
        int salary=employee1.calculateSalary(12);
        System.out.println(salary);
        employee1.assignDepartment("Tech");
        String dept= employee1.getDepartmentDetails();
        System.out.println(dept);
    }
}

abstract class Employee implements Department{

    private static int totalEmployees=0;
    private final int employeeId;
    private final String name;

    private String department;
    private int baseSalary;

    Employee(String name, int baseSalary){
        this.employeeId=++totalEmployees;
        this.name=name;
        setBaseSalary(baseSalary);
    }

    private void setBaseSalary(int baseSalary){
        if(baseSalary > 0){
            this.baseSalary=baseSalary;
        }
        else {
            System.out.println("Invalid Salary");
        }
    }


    protected int getBaseSalary(){
        return this.baseSalary;
    }

    @Override
    public void assignDepartment(String department){
        this.department=department;
    }

    @Override
    public String getDepartmentDetails(){
        return this.department;
    }

    abstract int calculateSalary(int workingHours);

    void displayDetails(){
        System.out.println("Employee Id :"+this.employeeId);
        System.out.println("Employee Name : "+this.name);
        System.out.println("Employee Salary : "+this.baseSalary);
        System.out.println("Employee Department : "+this.department);
    }


}

interface Department{
    void assignDepartment(String department);

    String getDepartmentDetails();
}

class FullTimeEmployee extends Employee{

    FullTimeEmployee(String EmployeeName, int salary){
        super(EmployeeName, salary);
    }
    @Override
    int calculateSalary(int workingHours) {
        return this.getBaseSalary();
    }

}

class PartTimeEmployee extends Employee{

    PartTimeEmployee(String EmployeeName, int salary){
        super(EmployeeName, salary);
    }
    @Override
    int calculateSalary(int workingHours) {
        return 70*workingHours+this.getBaseSalary();
    }

}
