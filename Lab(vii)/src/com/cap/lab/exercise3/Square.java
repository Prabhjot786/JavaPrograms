package com.cap.lab.exercise3;

import java.util.HashMap;

import java.util.Map;

public class Square {

	public Square() {
		// TODO Auto-generated constructor stub
	}
	
	public static Map getSquares(int arr[])
	{
		
		HashMap<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<arr.length;i++)
		{
          	map.put(arr[i], arr[i]*arr[i]);
		}
		return map;	
	}
	
	public static void main(String[] args)
	{
		int arr[]= {1,2,3,4,5,6};
		System.out.println(getSquares(arr));
		
	}

}
