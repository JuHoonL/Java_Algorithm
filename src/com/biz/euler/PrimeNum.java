package com.biz.euler;

public class PrimeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 아래 숫자가 소수인지 판별하라
		// 소수 구하는 코드
		/*
		int intNum = 3324;
		for(int i = 2 ; i < 3324 ; i++) {
			if(intNum % i == 0) {
				System.out.println("소수 아님");
				break;
			}
		}
		
		intNum = (int)(Math.random() * (100-1+1))+1;
		int j = 2;
		for(; j < intNum ; j ++) {
			if(intNum % j == 0) break;
		}
		// 위의 for문이 중단되거나 완료되었을때 j의 값을 검사하면 intNum가 소수인지 아닌지를 판단할 수 있다.
		if(j >= intNum) {
			System.out.println(intNum + "는 소수입니다.");
		} else {
			System.out.println(intNum + "는 소수가 아닙니다.");
		}
		*/
		
		for(int Num = 2 ; Num < 100 ; Num ++) {
			int index = 0 ;
			for(index = 2 ; index < Num ; index ++) {
				if(Num % index == 0) break;
			}
			if(index >= Num) {
				System.out.println(Num + "는 소수");
			}
		}
	}

}