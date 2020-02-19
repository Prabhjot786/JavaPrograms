package com.cap.lab.exercise4;

public class CharArrayDemo {

	static int freq[]=new int[1000];

	public static void findOccurence(char arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			freq[arr[i]]++;
		}
	}
	
	public static void display(char arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+""+freq[arr[i]]);
		}
	}
	
	
	public static void main(String[] args) {
		char arr[]= {'a','b','a','c','d'};
		findOccurence(arr);
		display(arr);
		
	}

}
