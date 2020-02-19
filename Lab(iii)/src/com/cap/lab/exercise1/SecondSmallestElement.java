package com.cap.lab.exercise1;

import java.util.Arrays;

class SecSmallest {

	
	public  int getSecondSmallest(int arr[])
	{
		Arrays.sort(arr);
		return arr[1];	
	}
}

public class SecondSmallestElement
{
	 public static void main(String args[])
		{
			int arr[]= {2,3,4,1,6,8,7,9};
			SecSmallest s=new SecSmallest();
			int min1=s.getSecondSmallest(arr);
			System.out.println(min1);
		}
}