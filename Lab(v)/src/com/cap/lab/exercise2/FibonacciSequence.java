package com.cap.lab.exercise2;

public class FibonacciSequence {

	 public void getFibonacci(int n)
	 {
		 System.out.println("fibonacci series:");
		 int a1=1, b1=0;
		 for(int i=0;i<n;i++)
		 {
			 int c=a1+b1;
			 System.out.println(c);
			 a1=b1;
			 b1=c;
		 }
	 }

}
class TestSeries
{
	
	public static void main(String [] args)
	{
	     FibonacciSequence series=new FibonacciSequence();
	     series.getFibonacci(5);
	}
}
