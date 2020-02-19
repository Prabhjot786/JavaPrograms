package com.cap.lab.exercise3;

public class PrimeSeries {
	int arr[];
	int no;
	PrimeSeries(int n)
	{
		no=n;
		arr=new int[no];
	}
	
	public boolean getPrimeNo(int n)
	{
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				return false;
			}
		}
		return true;
	}
	
	public void getPrimeSeries()
	{
		for(int i=0;i<arr.length;i++)
		{
			if(getPrimeNo(arr[i])==true)
			{
				System.out.println(arr[i]);
			}
		}
	}

}


 class PrimeTest
 {
	 public static void main(String[] args)
	 {
		 PrimeSeries prime=new PrimeSeries(3);
		 prime.getPrimeSeries();
		 
	 }
 }