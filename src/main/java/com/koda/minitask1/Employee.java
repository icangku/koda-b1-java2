package com.koda.minitask1;

abstract class Employee {
  private String id;
  private String name;
  private String position;
  private String department;
  private int salary;

  public Employee(String id, String name, String position, String department, int salary){
    if(salary < 0 ){
      throw new  IllegalArgumentException("Gaji Awal tidak boleh negatif");
    }
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

  protected void addSalary(int amount) {
    if (amount <= 0) {
      throw new IllegalArgumentException("Kenaikan gaji harus lebih dari 0");
    }
    int newSalary = Math.addExact(this.salary, amount);
    if (newSalary < 0) {
      System.out.println("Gaji tidak boleh negatif");
      return;
    }
    this.salary = newSalary;
  }

  public abstract void increaseSalary(int amount);

}
