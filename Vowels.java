package practice;
import java.io.*;
import java.util.*;
public class Vowels {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		String input=scn.nextLine();
		int count=0;
		int consonant=0;
		for(int i=0;i<input.length();i++) {
			char ch=input.charAt(i);
			if(ch=='a' ||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				count+=1;
			}
			else {
				consonant++;
			}
		}
		System.out.println("vowels count: "+count);
		System.out.println("consonant count: "+consonant);
	}
}
