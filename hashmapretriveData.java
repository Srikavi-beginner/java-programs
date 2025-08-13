package practice;
//import java.util.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class hashmapretriveData {
	public static void main(String[] args) {
		Map<Integer,String> map=new HashMap<Integer,String>();
		map.put(1, "java");
		map.put(2,"python");
		map.put(3, "javascript");
		System.out.println(map.get(2));
		System.out.println(map.get(40));
		System.out.println(map);//object type
		System.out.println(map.entrySet());//return array type
		//enhanced for loop
		for(Entry<Integer,String> data: map.entrySet()) {
			//System.out.println(data);
			//System.out.println("=========");
			System.out.println(data.getKey()+", " +data.getValue());
		}
		//using foreach
		map.forEach((K,V)->System.out.println("key: "+K+"value "+V));
		
	}

}
