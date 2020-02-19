package com.cg.eis.exception;

public class EmployeeException extends Exception

{
	
	EmployeeException(String args)
	{
		super(args);
	}
	

}

 class EmployeeSalary
 {
	 public static void checkEmployeeSalary(int salary) throws EmployeeException 
	 {
		 if(salary<3000)
		 {
			 throw new EmployeeException( "Exception: Salary is below 3000 that is"+salary);
		 }
	 }
	 
	 public static void main(String args[])
	 {
		 try
		 {
			 checkEmployeeSalary(30);			 
		 }
		 catch(EmployeeException e)
		 {
			 System.out.println(e.getMessage());
		 }
	 }
 }
