package practice;
import java.util.*;
public class Calculator {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("addition:+");
		System.out.println("subraction:-");
		System.out.println("multiplication:*");
		System.out.println("division:/");
		System.out.println("modulus:%");
		System.out.println("Enter a number for a operations");
		int a=scn.nextInt();
		int b=scn.nextInt();
		System.out.println("Enter a symbol");
		char symbol=scn.next().charAt(0);
		scn.nextLine();
		switch(symbol) {
		case '+':
			int add=a+b;
			System.out.println(add);
			break;
		case '-':
			int sub=a-b;
			System.out.println(sub);
			break;
		case '*':
			int mul=a*b;
			System.out.println(mul);
			break;
		case '/':
		    double div=a/b;
			System.out.println(div);
			break;
		case '%':
			double mod=a%b;
			System.out.println(mod);
			break;
		default:
			System.out.println("Invaild symbol");
			break;
		}
		
		
	}

}

