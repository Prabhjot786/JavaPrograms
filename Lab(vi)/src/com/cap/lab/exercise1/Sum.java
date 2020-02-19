package com.cap.lab.exercise1;

import java.util.StringTokenizer;

public class Sum {

       public static void main(String[] args)
       {
    	   
    	   String s="1 2 3 4 5 6";
    	   StringTokenizer s1=new StringTokenizer(s);
    	   while(s1.hasMoreTokens())
    	   {
    		   System.out.println(s1.nextToken());
    	   }
    	   
       }
}
