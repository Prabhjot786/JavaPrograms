package com.cap.lab.exercise5;

	class AgeValidate extends Exception
	{
		int age;
		AgeValidate(int age)
		{
			this.age=age;
		}

		
	    public String toString()
		{
			return "Age of person should be above 15";
			
		}
	}

	public class UserDefinedExcep
	{
		public static void checkAge(int age) throws AgeValidate
		{
			if(age<15)
			{
				throw new AgeValidate(age);
			}
			System.out.println("Age"+age);
		}

		public static void main(String[] args)
		{
			try
			{
			checkAge(14);
			checkAge(20);
			}
			catch(AgeValidate ae)
			{
				System.out.println(ae);
			}
		}
	}
	
