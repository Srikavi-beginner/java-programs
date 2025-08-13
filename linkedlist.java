package practice;
import java.util.LinkedList;

public class linkedlist {
	public static void main(String[] args) {
		LinkedList list1=new LinkedList();
		list1.add("java");
		list1.add(10);
		list1.add(10.4);
		list1.add(false);
		System.out.println(list1);
		list1.push("python");//always the value inserted in the head
		System.out.println(list1);
		list1.pop();
		System.out.println(list1);
		list1.poll();
		System.out.println(list1);//delete the data which is work in a node where as pop used in DS
		System.out.println("=========");
		list1.pollFirst();
		System.out.println(list1);
		list1.addFirst("React");
		System.out.println(list1);
		list1.addLast("angular");
		System.out.println(list1);
		list1.removeFirst();
		System.out.println(list1);
		list1.removeLast();
		System.out.println(list1);
		list1.add(2,"srikavi");
		System.out.println(list1);
		
	}
	
}
