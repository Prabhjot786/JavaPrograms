package com.cap.lab.exercise2;

import java.util.HashMap;
import java.util.Map;

public class CharacterDetails {


	public static Map countCharacter(char c[])
	{
		Map<Character,Integer> map=new HashMap<Character,Integer>();
	for(int i=0;i<c.length;i++)
	{
	    Integer val=map.get(c[i]);
		if(val!=null)
		{
			map.put(c[i],val+1);
		}
		else 
		{
		map.put(c[i], 1);
		}
	}
		
		return map;
		
	}
	public static void main(String[] args)
	{
		char c[]= {'A','P','P','L','E'};
		System.out.println(countCharacter(c));
		
	}
}
