package com.dev;
import java.util.*;

public class range {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the number of elements in an array");
		int n=scn.nextInt();
		int i;
		int arr[]=new int[20];
		for(i=0;i<n;i++) {
			arr[i]=scn.nextInt();
		}
		for(int j=0;j<n;j++) {
			System.out.print(" "+arr[j]);
		}
		System.out.println();
		int max=arr[0];
		int min=arr[0];
		for(int k=0;k<n;k++) {
			if(arr[k]<arr[0]) {
				min=arr[k];
			}
			else {
				max=arr[k];
			};
		}
		int result=max-min;
		System.out.println(result);
				
	}

}
