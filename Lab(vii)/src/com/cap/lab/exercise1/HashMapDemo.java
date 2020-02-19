package com.cap.lab.exercise1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class HashMapDemo {

	public HashMapDemo() {
		
	}
	
	
	
	public static List getValues(HashMap<Integer,String> hMap )
	{
		List values=new ArrayList(hMap.values());
		Collections.sort(values);
		return values;
		
	}
	
	public static void main(String[] args)
	{
		HashMap<Integer,String> map=new HashMap<>();
		map.put(1, "prabhjot");
		map.put(3,"jj");
		map.put(2, "jerry");
		
		List l1=HashMapDemo.getValues(map);
		System.out.println(l1);
	}

}
