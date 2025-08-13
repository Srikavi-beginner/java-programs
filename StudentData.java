package practice;

import java.util.Scanner;

public class StudentData 
{
	public static void main(String[] args) 
	{
	String display="";
	int Total_marks;
	double average;
	String display1;
	double cut_off;
	Scanner scn=new Scanner(System.in);
	System.out.println("Enter your Tamil mark");
	int Tamil=scn.nextInt();
	System.out.println("Enter your English mark");
	int English=scn.nextInt();
	System.out.println("Enter your Maths mark");
	int Maths=scn.nextInt();
	System.out.println("Enter your Physics mark");
	int Physics=scn.nextInt();
	System.out.println("Enter your Chemistry mark");
	int Chemistry=scn.nextInt();
	System.out.println("Enter your Biology mark");
	int Biology=scn.nextInt();
	if(Tamil>100 || English>100 || Maths>100 || Physics>100 || Chemistry>100 || Biology>100)
	{
		System.out.println("Invalid mark");
	}
	else if(Tamil>=40 && English>=40 && Maths>=40 && Physics>=40 && Chemistry>=40 && Biology>=40) 
	{
		System.out.println("Congradulations!");
		if(Tamil>English && Tamil>Maths && Tamil>Physics && Tamil>Chemistry && Tamil>Biology)
		{
			display="Tamil mark is Maximum";
		}
		else if(English>Maths && English>Physics && English>Chemistry && English>Biology)
		{
			display="English mark is Maximum";
		}
		else if(Maths>Physics && Maths>Chemistry && Maths>Biology)
		{
			display="Maths mark is Maximum";
		}
		else if( Physics>Chemistry && Physics>Biology)
		{
			display="Physics mark is Maximum";
		}
		else if(Chemistry>Biology)
		{
			display="Chemistry mark is Maximum";
		}
		else
		{
			display="Biology mark is Maximum";
		}
		System.out.println(display);
		if(Tamil<English && Tamil<Maths && Tamil<Physics && Tamil<Chemistry && Tamil<Biology)
		{
			display1="Tamil mark is Minimum";
		}
		else if(English<Maths && English<Physics && English<Chemistry && English<Biology)
		{
			display1="English mark is Minimum";
		}
		else if(Maths<Physics && Maths<Chemistry && Maths<Biology)
		{
			display1="Maths mark is Minimum";
		}
		else if( Physics<Chemistry && Physics<Biology)
		{
			display1="Physics mark is Minimum";
		}
		else if(Chemistry<Biology)
		{
			display1="Chemistry mark is Minimum";
		}
		else 
		{
			display1="Biology mark is Minimum";
		}
		System.out.println(display1);
		Total_marks=Tamil+English+Maths+Physics+Chemistry+Biology;
		System.out.println("Total Marks : "+Total_marks);
		average=Total_marks/6;
		System.out.println("Average : "+average);
		cut_off=((Physics+Chemistry)/2+Maths);
		System.out.println("Cut Off : "+cut_off);
		if(Total_marks>=550) 
		{
			System.out.println("Grade A");
		}
		else if(Total_marks>=500)
		{
			System.out.println("Grade A+");
			
		}
		else if(Total_marks>=460)
		{
			System.out.println("Grade B");
			
		}
		else if(Total_marks>=400)
		{
			System.out.println("Grade B+");
			
		}
		else if(Total_marks>=350)
		{
			System.out.println("Grade c");
			
		}
		else
		{
			System.out.println("Grade D ");
			
		}
	}
	else 
	{
		System.out.println("Better luck next time");
	}

	}
}
