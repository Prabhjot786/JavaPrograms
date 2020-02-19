package com.cap.lab.exercise3;

public class ImageDemo {

	public static String getImage(String s)
	{
		StringBuffer sb=new StringBuffer(s);
		
	 
		String s1=s+"|"+sb.reverse();
		
		return s1;	
	}
	
	public static void main(String[] args)
	{
		String s="EARTH";
		String mirror_image=getImage(s);
		System.out.println(mirror_image);
	}
}
