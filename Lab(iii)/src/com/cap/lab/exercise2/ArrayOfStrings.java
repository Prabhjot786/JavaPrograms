package com.cap.lab.exercise2;

public class ArrayOfStrings {
	
	public  String[] SortStringObjects(String [] s)
	{
		int lenStr=s.length;
		String temp;
		
		for(int i=0;i<lenStr-1;i++)
		{
			
			for(int j=i+1;j<lenStr;j++)
			{
				if(s[i].compareTo(s[j])>0)
				{
					temp=s[i];
					s[i]=s[j];
					s[j]=temp;
				}
			}
		}
		
		if(lenStr%2==0)
		{ 
			
			for(int i=0;i<lenStr;i++)
			{
				if(i<lenStr/2)
					s[i]=s[i].toUpperCase();
				else
					s[i]=s[i].toLowerCase();
				
			}
		}
		else
		{
			for(int i=0;i<lenStr;i++)
			{
				if(i<(lenStr/2)+1)
					s[i]=s[i].toUpperCase();
				else
					s[i]=s[i].toLowerCase();
			}
		}
		
			
		return s;
		
		
	}

}


 class TestString
 {
	 public static void main(String[] args)
	 {
		 String s1[];
		 String obj[]= {"prabhj","kajal","sahil","himanshi","renu"};
		 ArrayOfStrings a=new ArrayOfStrings();
		 s1=a.SortStringObjects(obj);
		 for(int i=0;i<s1.length;i++)
		 {
		 System.out.println(s1[i]);
		 }
	 }
 }
