package com.koda.minitask1;

public class ContractEmployee extends Employee {

  public ContractEmployee(String id, String name, String position, String department, int salary){
    super(id, name, position, department, salary);
  }

  @Override 
  public void increaseSalary(int amount)  {
    if (amount > 500000) {
      System.out.println("Kenaikan gaji tidak boleh dari 500rb");
      return ;
    }

    addSalary(amount);
  }
}
