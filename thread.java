package practice;
import java.io.*;
import java.util.*;
class A extends Thread{
	@Override
	public void run() {
		for(int i=100;i<200;i++) {
			System.out.println(i);
		}
	}
	
}
public class thread {
public static void main(String[] args) {
	A obj=new A();
	obj.start();
	for(int i=1;i<100;i++) {
		System.out.println(i);
	}
}
}
