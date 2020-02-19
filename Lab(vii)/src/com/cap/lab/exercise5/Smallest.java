package com.cap.lab.exercise5;

import java.util.ArrayList;
import java.util.Collections;

class  CollectionDemo
 {

	public CollectionDemo() {
		// TODO Auto-generated constructor stub
	}

	public static int getSecondSmallest(int[] arr)
	{
		ArrayList<Integer> list=new ArrayList<Integer>(arr.length);
		for(int i:arr)
		{
			list.add(i);
		}
		Collections.sort(list);
        System.out.println(list);
		return list.get(1);
		
	}
}

 public class Smallest
 {
	 public static void main(String[] args)
	 {
	 int[] a= {1,2,2,7,5,6,3,9};
	 int s=CollectionDemo.getSecondSmallest(a);
	 System.out.println(s);
	 }
}
