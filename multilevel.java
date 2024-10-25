package oops;
class Person {

     String name;
     int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void displayPersonalInfo() {
        System.out.println("Personal Information:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
class Employee extends Person {
    String employeeId;
     String department;

    public Employee(String name, int age, String employeeId, String department) {
        super(name, age);
        this.employeeId = employeeId;
        this.department = department;
    }
    public void displayEmployeeInfo() {
        displayPersonalInfo();
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Department: " + department);
    }
}


class Manager extends Employee {

     int teamSize;
    public Manager(String name, int age, String employeeId, String department, int teamSize) {

        super(name, age, employeeId, department);
        this.teamSize = teamSize;
    }

    public void displayManagerInfo() {
        displayEmployeeInfo();
        System.out.println("Team Size: " + teamSize);
    }
}


public class multilevel {
    public static void main(String[] args) {
        Manager manager = new Manager("Ankit", 19, "E123", "IT", 10);


       // manager.displayManagerInfo();
        //manager.displayPersonalInfo();
        manager.displayEmployeeInfo();
    }
}

