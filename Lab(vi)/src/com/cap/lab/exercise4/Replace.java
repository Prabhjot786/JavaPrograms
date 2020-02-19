package com.cap.lab.exercise4;

public class Replace {

	public static String alterString(String s)
	{
		String s1="";
		char ch;
		
		for(int i=0;i<s.length();i++)
		{
			ch=s.charAt(i);
			int a=ch;
			if(ch!='a'&& ch!='i' &&ch!='e'&& ch!='o'&& ch!='u')
			{
				ch=(char) (a+1);
				s1=s1+ch;
			}
			else
			{
				s1=s1+ch;
			}
		}
		
		return s1;
		
	}
	
	public static void main(String[] args)
	{
		String s="java";
		System.out.println(alterString(s));
	}
}
