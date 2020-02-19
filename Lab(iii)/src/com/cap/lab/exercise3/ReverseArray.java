package com.cap.lab.exercise3;

import java.util.Arrays;

 class Reverse 
{	
	int arr[]=new int[10];
	int num,rem;
	
	public  int[] getSorted(int arr[])
			{
		        int rev=0;
		     for(int i=0;i<arr.length;i++)
		     { 
		    	 while(arr[i]!=0)
		    	 {
		    	  rem=arr[i]%10;
		    	  rev=rev*10+rem;
		    	  arr[i]=arr[i]/10;
		    	 }
		    	 arr[i]=rev;
		    	 System.out.println(arr[i]);
                 rev=0;
                
		     }
		     
		     Arrays.sort(arr);
		    
			return arr;
		     
			}


}

  
public class ReverseArray

 {
	 public static void main(String[] args)
	 {
		
		 int arr[]={454,27,38,49,50};
		 int a[]=new int[arr.length];
		 Reverse r=new Reverse();
		  a=r.getSorted(arr);
		  for(int i=0;i<a.length;i++)
			  System.out.println(a[i]);
	 }
 }
 