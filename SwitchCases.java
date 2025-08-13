package practice;
import java.util.*;
public class SwitchCases {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		String signal=scn.nextLine();
		switch(signal) {
		case "red":
			System.out.println("Stop");
			break;
		case "Yellow":
			System.out.println("Get Ready");
			break;
		case "Green":
			System.out.println("Go");
			break;
		case "walk":
			System.out.println("wait");
			break;
		default:
			System.out.println("no possible lights colors");
		
		}
	}

}
