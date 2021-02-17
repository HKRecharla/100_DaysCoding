package java_H.basic.enum_E;

public class Customised_Enum {

	public static void main(String[] args) {
		System.out.println(Ref.MONDAY.getstring());
	}
}


enum Ref{
	MONDAY("Monday");
	
	String string;
	
	public String getstring() {
		return this.string;
	}

	Ref(String string) {
		this.string = string;
	}
}