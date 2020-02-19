package com.cap.lab.exercise2;

import java.io.BufferedReader;
import java.io.File;

import java.io.FileReader;
import java.io.IOException;


public class FileDescription {

	public static void main(String[] args) throws IOException
	{
		File file=new File("FileDemo.txt");
		
		FileReader fr=new FileReader(file);
		BufferedReader br=new BufferedReader(fr);
		
		String line;
		int count=1;

	    while((line=br.readLine())!=null)
	    {
	    	count++;
	    	System.out.println(count +":"+line);
	    	
	    }
	    
	    
	}

}
