package com.cap.lab.exercise5;

public class Difference {

	public static int modifyNumber(int number)
	{
		String s1=Integer.toString(number);
		StringBuffer sb=new StringBuffer();
		
		        int i = 0,j = 1;
			    while(i<s1.length()-1&&j<s1.length())
				{
				int diff=Math.abs(s1.charAt(j)-s1.charAt(i));
				sb.append(diff);
				i++;
				j++;
				}
			    sb.append(s1.charAt(s1.length()-1));
			    String s=sb.toString();
			
			int no=Integer.parseInt(s);
			return no;
		}
	public static void main(String[] args)
	{
		System.out.println(modifyNumber(179));
	}
}
