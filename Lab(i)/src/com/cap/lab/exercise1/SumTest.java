package com.cap.lab.exercise1;

  class Sum {

	     public int Sum(int n) 
	     {
		     int sum=0;
		     for(int i=0;i<=n;i++)
		     {
		    	 if(i % 3==0 || i % 5==0)
		    		 sum=sum+i;
		    	 }
			return sum;
		     }
}
 
 public class SumTest
 {
	 public static void main(String[] args)
	 {
		 int n=7,sum;
		 Sum s=new Sum();
		 sum=s.Sum(n);
		 System.out.println(sum);
	 }
 }
