package practice;
import java.util.*;
class Student{
	int s_id;
	String s_name;
	String s_address;
	String s_marks;
	public Student() {
		super();
		
	}
	public Student(int s_id,String s_name,String s_address,String s_marks) {
		this.s_id=s_id;
		this.s_name=s_name;
		this.s_address=s_address;
		this.s_marks=s_marks;
	}
	public int getS_id() {
		return s_id;
	}
	public void setS_id(int s_id) {
		this.s_id = s_id;
	}
	public String getS_name() {
		return s_name;
	}
	public void setS_name(String s_name) {
		this.s_name = s_name;
	}
	public String getS_address() {
		return s_address;
	}
	public void setS_address(String s_address) {
		this.s_address = s_address;
	}
	public String getS_marks() {
		return s_marks;
	}
	public void setS_marks(String s_marks) {
		this.s_marks = s_marks;
	}
	@Override
	public String toString() {
		return "Student [s_id=" + s_id + ", s_name=" + s_name + ", s_address=" + s_address + ", s_marks=" + s_marks
				+ "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(s_address, s_id, s_marks, s_name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(s_address, other.s_address) && s_id == other.s_id
				&& Objects.equals(s_marks, other.s_marks) && Objects.equals(s_name, other.s_name);
	}

	
}


public class hashmap {
	public static void main(String[] args) {
		HashMap<Integer,Student> map=new HashMap();
		map.put(1,new Student(10,"java","salem","80"));
		map.put(1,new Student(20,"python","Erode","85"));
		map.put(1,new Student(30,"react","Dharmapuri","83"));
		map.put(1,new Student(40,"angular","Nammakkal","86"));
		map.put(1,new Student(50,"Javascript","coimbatore","89"));
		System.out.println(map);
	
	}
}
