package com.koda.minitask1;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Employee employee = new Employee("0921", "Budiarta", "Java Developer", "IT", 5000000);
        EmployeeService employeeService = new EmployeeService(employee);
        employeeService.showEmployee();

        employeeService.giveRaise(1000000);
        employeeService.getCurrentSalary();

        employeeService.giveRaise(-5000000);
        employeeService.getCurrentSalary();
    }
}
