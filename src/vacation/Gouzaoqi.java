package vacation;

public class Gouzaoqi {
public static void main(String[] args) {
	String n ;
	int a ;
	Person p1 =new Person();
	System.out.println(p1.getName()+p1.getAge());
	Person p2=new Person();
	p2.setAge(22);
	p2.setName("dhdh");
	System.out.println(p2.getAge()+p2.getName());
}
}
class Person{
	private String name;
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	int age;
	
	public Person(String name,int age){
		this.name = name;
		this.age = age;
		
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	
	
}