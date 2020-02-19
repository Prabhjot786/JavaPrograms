package com.cap.lab.exercise6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileCount {
	
	static int line_count=0;
	static int char_count=0;
	static int word_count=0;
	
	public static void main(String[] args) throws IOException
	{
		File file=new File("FileDemo.txt");
		FileReader fr=new FileReader(file);
		BufferedReader br=new BufferedReader(fr);
		
		String line;
		
		
		while((line=br.readLine())!=null)
		{
			line_count+=1;	
			char_count+=line.length();
			String[] wordList=line.split(" ");
			word_count+=wordList.length;
		}
		
		System.out.println(line_count);
		System.out.println(char_count);
		System.out.println(word_count);
		
	}
}
