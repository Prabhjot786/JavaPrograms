package com.cap.lab.exercise4;

	class ExceptionFlow extends Exception {
			
			String firstName;
			String secondName;
			
			ExceptionFlow(String firstName, String secondName)
			{
				this.firstName=firstName;
				this.secondName=secondName;
			
			}
			
			ExceptionFlow(String args)
			{
				
				super(args);
			}
			
			public String toString()
			{
				return " firstNameException :"+this.firstName +"secondNameException :"+this.secondName;
			}

	}


		   public class UserDefined 
		    {	
		  
				public static void details(String firstName, String secondName) throws ExceptionFlow
				{
					String fname=firstName;
				    String sname=secondName;
				    func1(fname,sname);
				   
				}
				
				public static void func1(String f,String s) throws ExceptionFlow
				{	
					System.out.println("func1");
					    if(f.length()==0 && s.length()==0)
					    {
					    	throw new ExceptionFlow(f,s);
					    }
					    System.out.println("Normal Exit");
				}

		    	public static void main(String[] args)
		    	{
		    		try
		    		{
		    		details("","");
		    		}
		    		catch(ExceptionFlow e)
		    		{
		    			System.out.println("caught"+e);
		    		}
		    	}
		    }
			
		   