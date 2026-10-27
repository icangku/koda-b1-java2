package com.koda.minitask1;

public class PermanentEmployee extends Employee {

  public PermanentEmployee(String id, String name, String position, String department, int salary){
    super(id, name, position, department, salary);
  }

  @Override 
  public void increaseSalary(int amount)  {
    addSalary(amount);
  }
  
}
