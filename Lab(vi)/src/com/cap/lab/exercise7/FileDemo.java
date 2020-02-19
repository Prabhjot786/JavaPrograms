package com.cap.lab.exercise7;

import java.io.File;
import java.util.Scanner;

public class FileDemo {

	static String getFileExtension(File f)
	{
		String name=f.getName();
		int lastIndexOf=name.lastIndexOf(".");
		if(lastIndexOf==-1)
		{
			return "";
		}
		return name.substring(lastIndexOf+1);
	}
	 public static void main(String[] args)
	  {
		  Scanner input=new Scanner(System.in);
		  String s=input.nextLine();
		  File f1=new File(s);
		  
		 
		  
		  System.out.println("This file :"+f1.exists());
		  System.out.println("file is Readable:"+f1.canRead());
		  System.out.println("file is Writable:"+f1.canWrite());
		  System.out.println("file length:"+f1.length());
		  
		  String type=getFileExtension(f1);
		  System.out.println("file type:"+type);
		  
	  }

}
