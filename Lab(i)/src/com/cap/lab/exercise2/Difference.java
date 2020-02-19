package com.cap.lab.exercise2;

public class Difference {
	
		public int calculateDifference(int n)
			{
				int sumOfSquare=0;
				int squareOfSum=0,DifferenceOfSum=0;
				for(int i=1; i<=n; i++)
				{
					sumOfSquare=sumOfSquare+i*i;
					squareOfSum=squareOfSum+i;
					DifferenceOfSum=sumOfSquare-squareOfSum;
				}
				return DifferenceOfSum;
			}
	}

 class DifferenceTest
 {
	 public static void main(String args[])
		{
		    int differenceOfSum;
			Difference d = new Difference();
			differenceOfSum=d.calculateDifference(3);
			System.out.println(differenceOfSum);
		}
 }
