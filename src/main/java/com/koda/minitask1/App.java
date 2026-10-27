package com.koda.minitask1;

public class App 
{
    public static void main( String[] args )
    {
        Employee employee = new ContractEmployee("EMP002", "Budi Santoso", "Frontend Developer", "IT", 5000000);
        EmployeeService employeeService = new EmployeeService(employee);
        employeeService.showEmployee();
        try {
            employeeService.giveRaise(300000);
            employeeService.getCurrentSalary();
        } catch (Exception e) {
            System.out.println("Gagal: "+e.getMessage());
        }

        try {
            employeeService.giveRaise(1000000);
            employeeService.getCurrentSalary();
        } catch (Exception e) {
            System.out.println("Gagal: "+e.getMessage());
        }

        try {
            employeeService.giveRaise(-1000000);
            employeeService.getCurrentSalary();
        } catch (Exception e) {
            System.out.println("Gagal "+ e.getMessage());
        }
    }
}
