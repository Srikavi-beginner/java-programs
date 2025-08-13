package practice;

public class maximum {
	public static void main(String[] args) {
		int mark1=60;
		int mark2=75;
		int mark3=80;
		int mark4=95;
		int mark5=76;
		String Max_marks=(mark1>mark2 && mark1>mark3 && mark1>mark4 && mark1>mark5)?"mark1 is maximum":(mark2>mark3 && mark2>mark4 && mark2>mark5)?"mark2 is maximum":(mark3>mark4 && mark3>mark5)?"mark3 is maximum":(mark4>mark5)?"mark4 is maximum":"mark5 is maximum";
		
		System.out.println(Max_marks);
		System.out.println(args);
	}

}
