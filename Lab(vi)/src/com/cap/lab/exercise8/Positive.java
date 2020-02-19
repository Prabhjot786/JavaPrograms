package com.cap.lab.exercise8;

public class Positive {

	public static boolean getPositive(String s)
	{
		int i=0,j=1;
		boolean flag=true;
		while(i<s.length()-1 && j<s.length())
		{
			if(s.charAt(i)<s.charAt(j))
			{
				i++;
				j++;
			}
			else
			{
				flag=false;
				break;
			}
		}
		return flag;	
	}
	
	public static void main(String[] args)
	{
		boolean b=getPositive("abcdefgh");
		System.out.println(b);
		
	}
}
