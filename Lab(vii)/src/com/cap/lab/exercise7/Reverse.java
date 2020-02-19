package com.cap.lab.exercise7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Reverse {

	public static int[] getSorted(int arr[])
	{
		StringBuffer sbNumbers=new StringBuffer();
		
		String speratorStr=" ";
		if(arr.length>0)
		{
			sbNumbers.append(arr[0]);
		}
		for(int i=1;i<arr.length;i++)
		{
			sbNumbers.append(speratorStr).append(arr[i]);
		}
		
		System.out.println(sbNumbers);
		
		sbNumbers.reverse();
		System.out.println(sbNumbers);
		
	
		int[] a=new int[sbNumbers.length()];
		for(int i=0;i<a.length;i++)
		{
			
		}
		Arrays.sort(a);
		return arr;
			
	}
	
	public static void main(String[] args)
	{
		int arr[]= {123,219,366,786,488};
		getSorted(arr);
		//System.out.println(a);
	}
}
