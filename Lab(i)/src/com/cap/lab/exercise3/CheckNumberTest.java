package com.cap.lab.exercise3;

 class Number {
	
	public boolean checkNumber(int n)
	{
	    int m=n%10;
		n=n/10;
		boolean flag=false;
		while(n>0)
		{
			if(m>n%10)
				flag=true;
			break;
		}
		m=n%10;
		n=n/10;
		if(flag)
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
		return flag;
	}
}

 class CheckNumberTest
 {
	 public static void main(String args[])
		{
			Number n=new Number();
			n.checkNumber(1234);
		}
 }
