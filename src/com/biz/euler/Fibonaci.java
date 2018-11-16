package com.biz.euler;

public class Fibonaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1st = 1;
		int num2nd = 2;
		int fibNum = num2nd;
		
		System.out.println(num1st);
		System.out.println(num2nd);
		
		fibNum = num1st + num2nd;
		System.out.println(fibNum);
		
		int intSum = num1st + num2nd;
		while(true) {
			
			fibNum = num1st + num2nd;
			System.out.println(fibNum);
			if(fibNum > 100) break;
			intSum += fibNum;
			
			num1st = num2nd;
			num2nd = fibNum;
			
		}
			System.out.println("합 : " + intSum);		
	
		num1st = 1;
		num2nd = 2;
		intSum = num2nd;
		
		while(true) {
		
			fibNum = num1st + num2nd;
			if(fibNum > 1000) break;
			System.out.println(fibNum);
			if(fibNum % 2 == 0)
				intSum += fibNum;	
				num1st = num2nd;
				num2nd = fibNum;
			
			
		}
		System.out.println("피츠수열중 짝수의 합은 : " + intSum);
	}

}
