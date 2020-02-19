package com.cap.lab.exercise4;

public class CheckNoTest {
	static boolean flag=true;
	static boolean checkNumber(int n)
	{
	        if(flag=true)
			while(n!=1)
			{
				if(n%2!=0)
				{
					flag=false;
				}
				n=n/2;
			}
	        if(flag==true)
	        {
	        	System.out.print(flag);
	        }
	        else
	        {
	        	System.out.print(flag);
	        }
			return flag;
		}
        	
	public static void main(String[] args) {
		checkNumber(256);
		}
}