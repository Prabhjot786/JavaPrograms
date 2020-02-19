package com.cap.lab.exercise10;

class Demo {
	
	public static boolean getName(String s)
	{
		String s1="job";
		int index=s.lastIndexOf('_');
		if(s.substring(index+1).equals(s1) && index<=8)
		{
			System.out.println(s);
		}
		else
		{
			System.out.println("inValid");
		}
		return false;
		
	}
	
	
}


public class JobSeeker
{
	public static void main(String[] args)
	{
		String s1="Prabhjot_job";
		String s2="Prabh_job";
		Demo d=new Demo();
		Demo.getName(s1);
		Demo.getName(s2);
		
	}
}