package com.cap.lab.exercise1;

//Create a method to find the sum of the cubes of the digits of an n digit number

public class Cubes 
{
	int digitNo;
	Cubes(int digitNo)
	{
		this.digitNo=digitNo;
	}
	
	public void sum()
	{
		int cubes,sum=0,num;
		num=digitNo%10;
		digitNo=digitNo/10;
		while(num>0)
		{ 
		 cubes=num*num*num;
		 sum=sum+cubes;
		 num=digitNo%10;
		 digitNo=digitNo/10;
		}	
		System.out.println(sum);
	}
	 
}

 class Test
 {
	public static void main(String args[])
	{
		Cubes c=new Cubes(123456);
		c.sum();
	}
 }
