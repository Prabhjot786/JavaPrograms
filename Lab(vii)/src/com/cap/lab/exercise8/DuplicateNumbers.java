package com.cap.lab.exercise8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class DuplicateNumbers {

	public DuplicateNumbers() {
		// TODO Auto-generated constructor stub
	}
	
	public static int[] modifyArray(int arr[])
	{
		Set<Integer> set=new LinkedHashSet<Integer>();
		for(int i=0;i<arr.length;i++)
		{
			set.add(arr[i]);
		}
	
		List<Integer> list = new ArrayList<Integer>(set);
		Collections.sort(list, Collections.reverseOrder());
	//	System.out.println(list);
		Set<Integer> result=new LinkedHashSet<Integer>(list);
		//System.out.println(result);
		
		int[] a = new int[result.size()];
		int i = 0;
		for (Integer val: result) 
		a[i++] = val;
		
		
		return a;
		  
		
	}
	
	public static void main(String[] args)
	{
		int a[]= {1,2,2,0,3,4,5,5,6,7,7};
		int arr[]=modifyArray(a);
		for(int i=0;i<arr.length;i++)
		{
		System.out.println(arr[i]);
		}
	}

}
