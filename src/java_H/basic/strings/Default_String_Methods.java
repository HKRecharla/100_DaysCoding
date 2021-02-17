package java_H.basic.strings;

public class Default_String_Methods {
	
	
	public static void main(String[] args) {
		
		
		String s = "Default strings";
		
		System.out.println("Initial String  ==> "+s);
		
		//Getting individual character of string -- based on index
		char c = s.charAt(1); // index 1 = e
		System.out.println("Char AT of ==> 1"+c);
		
		//concatinate
		String con = s.concat("e");
		System.out.println(con);
	}

}
