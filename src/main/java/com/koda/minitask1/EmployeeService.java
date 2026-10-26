package com.koda.minitask1;

public class EmployeeService {
  Employee employee;

  public EmployeeService(Employee employee){
    this.employee = employee;
  }

  public void showEmployee(){
    System.out.println("=================================");
    System.out.println("          KODA ENTERPRISE");
    System.out.println("=================================");
    System.out.println("Employee ID :"+employee.getId());
    System.out.println("Name :"+employee.getName());
    System.out.println("Position :"+employee.getPosition());
    System.out.println("Department :"+employee.getDepartment());
    System.out.println("Salary :"+employee.getSalary());
  }

  public void giveRaise(int salary){
    employee.increaseSalary(salary);
  }

  public void getCurrentSalary(){
    System.out.println("Current salary: "+employee.getSalary());
  }
}
