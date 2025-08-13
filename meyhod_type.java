package practice1;
import java.util.*;
public class meyhod_type {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a numbers");
		int a=scn.nextInt();
		int b=scn.nextInt();
		add ad=new add();
		System.out.println(ad.Addition(a,b));

}
}
class add{
	int Addition(int num1, int num2) {
		return num1+num2;
	}
}

