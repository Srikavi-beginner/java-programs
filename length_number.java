package com.dev;

public class length_number {
	public static void main(String[] args) {
		
	int num=8976778;
	int count=0;
	while(num!=0) {
		count++;
		num=num/10;
	}
	System.out.println(count);
}
}
