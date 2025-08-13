package practice;
import java.util.LinkedHashMap;

public class linkedhashmap {
	public static void main(String[] args) {
		LinkedHashMap map=new LinkedHashMap();
		map.put(1, "java");
		map.put(null, "java");
		map.put(3, "python");
		map.put(1, true);
		map.put(4, "Script");
		map.put(null,null);
		System.out.println(map);
		map.put(1, 10);
		System.out.println(map);
	}
}
