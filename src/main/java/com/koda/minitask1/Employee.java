package com.koda.minitask1;

public class Employee {
  private String id;
  private String name;
  private String position;
  private String department;
  private int salary;

  public Employee(String id, String name, String position, String department, int salary){
    this.id = id;
    this.name = name;
    this.position = position;
    this.department = department;
    this.salary = salary;
  }

  public String getId(){
    return this.id;
  }

  public String getName(){
    return this.name;
  }

  public String getPosition(){
    return this.position;
  }

  public String getDepartment(){
    return this.department;
  }

  public int getSalary(){
    return this.salary;
  }

  public void increaseSalary(int amount){
    if(amount < 0){
      System.out.println("Error: Salary increase must be greater than 0");
    }else{
      this.salary += amount;
      System.out.println("Salary Increase: Rp"+this.salary);
    }
  }
}
