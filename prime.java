package practice;

public class prime {
	public static void main(String[] args) {
		int num=99;
		boolean flag=false;
		int count=0;
		for(int i=2;i<Math.sqrt(num);i++)/*m/2 is to reduce the no of loop running*/ {
			if(num%i==0 && num!=i ) {
				flag=true;
			}
			count++;
		}
		if(flag) 
		{
			System.out.println(num +"is  not prime");
		}
		else {
			System.out.println(num +"is prime");
		}
		System.out.println(count);
	}

}
