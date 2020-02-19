package com.cap.lab.exercise4;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Students {

	public Students() {
		// TODO Auto-generated constructor stub
	}
	
	public static HashMap getStudents(HashMap<Integer,Integer> hMap)
	{
		HashMap<Integer, String> map=new HashMap<Integer,String>();
		for(Entry<Integer, Integer> entry:hMap.entrySet())
		{
			if(entry.getValue()>=90)
			{
				map.put(entry.getKey(),"Gold");
			}
			else if(entry.getValue()>=80&&entry.getValue()<90)
			{
				map.put(entry.getKey(), "Silver");
			}
			else if(entry.getValue()>=70&&entry.getValue()<80)
			{
				map.put(entry.getKey(), "Bronze");
			}
			else
			{
				map.put(entry.getKey(), "no award");
			}
		}
		return map;
	}
	
	public static void main(String[] args)
	{
		HashMap<Integer,Integer> hMap=new HashMap<Integer,Integer>();
		hMap.put(11606052,80);
		hMap.put(12345678,50);
		hMap.put(11678900, 90);
		hMap.put(11334455,85);
		System.out.println(getStudents(hMap));
	}

}
