package com.dev;

public class power {
	public static void main(String[] args) {
		int num = 5;
		int power = 4;
        int resultpower = 5;
		int i = 1;
		while(i < power ) {
			resultpower = resultpower * num;
			
			i++;
			
		}
		System.out.println("the power of 5 ^ 4 is :  " + resultpower );
	}

}
