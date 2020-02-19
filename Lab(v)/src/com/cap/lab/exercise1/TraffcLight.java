package com.cap.lab.exercise1;

import java.util.Scanner;

public class TraffcLight {

	public TraffcLight() {
		String a[]= {"Red","yellow","green"};
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		switch(s)
		{
		case "Red":
			System.out.println("Stop");
			break;
		case "yellow":
			System.out.println("Ready");
			break;
		case "green":
			System.out.println("go");
			 break;
		default:
			System.out.println("Enter the valid option");
		}
	}

}
