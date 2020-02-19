package com.cap.lab.exercise6;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ValidateAge {

	public ValidateAge() {
		// TODO Auto-generated constructor stub
	}

	public static List votersList(HashMap<Integer,String> hMap)
	{
		Date d1=null;
		//Date formatDate=null;
		List<Integer> list=new ArrayList<Integer>();
		
	
		Set<?> entrySet=hMap.entrySet();
		Iterator<?> it=entrySet.iterator();
		while(it.hasNext())
		{
			Map.Entry me=(Map.Entry)it.next();
		    Object value=me.getValue();
			DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
			 try
			 {
				 d1=df.parse((String) value);
					 
				  Calendar c = Calendar.getInstance();
				  c.setTime(d1);
				  int year = c.get(Calendar.YEAR);
				  int month = c.get(Calendar.MONTH) + 1;
				  int date = c.get(Calendar.DATE);
				  LocalDate l1 = LocalDate.of(year, month, date);
				  LocalDate now1 = LocalDate.now();
				  Period diff1 = Period.between(l1, now1);
				  int age=diff1.getYears();

				  
				  if(age>18)
				  {
					 int k= (int) me.getKey();
					  list.add(k);
				  }
				 
			 }
			 catch(Exception e)
			 {
				 System.out.println(e);
			 }
			 
		}
			
		return list;	
	}
	
	public static void main(String[] args) throws ParseException
	{
		HashMap<Integer,String> map=new HashMap<>();
		
		map.put(2,"05/08/1998");
		map.put(3,"12/05/1978");
		map.put(4,"14/09/2001");
		System.out.println(map);
		
	    List l1=votersList(map);
		System.out.println(l1);
		
	}
}
