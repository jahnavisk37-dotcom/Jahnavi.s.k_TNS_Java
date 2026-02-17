package oopsdemo;

class Employee {
    int empId;
    String empName;

    void setEmployee(int id, String name) {
        empId = id;
        empName = name;
    }

    void displayEmployee() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
    }
}

class Department {
    String deptName;

    void setDepartment(String dept) {
        deptName = dept;
    }

    void displayDepartment() {
        System.out.println("Department: " + deptName);
    }
}

public class Multipleclassdemo {
	 public static void main(String[] args) {

	        Employee e1 = new Employee();
	        e1.setEmployee(11, "janu");
	        
	        Department d1 = new Department();
	        d1.setDepartment("IT");

	        e1.displayEmployee();
	        d1.displayDepartment();
	    }
	}