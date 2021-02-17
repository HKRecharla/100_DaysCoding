package java_H.oops_J;

public class Object_Initialize {
	
	String name;
	int age;
	String color;
	
	
	public Object_Initialize(String name,int age,String color) {
		this.name = name;
		this.age =age;
		this.color = color;
	}
	
	
	public String getName() {
		return name;
	}
	
	
	public int getAge() {
		return age;
	}
	
	
	
	public String getColor() {
		return color;
	}
	
	
	
	@Override
	public String toString() {
		
		return ("HI my name is "+name+" and age "+age+" and interested color  "+color+"");
	}

	
	
	public static void main(String[] args) {
		Object_Initialize ob = new Object_Initialize("Hari",29,"Blue");
		
		System.out.println(ob.toString());
	}
}
