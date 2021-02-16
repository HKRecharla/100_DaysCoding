package java_H.basic.strings;

public class Convert_toLowerCase {
	
	
	public static void main(String[] args) {
		String s ="HUNDRED CASE";
		loweCase(s);
	}
	
	
	
	static String loweCase(String s) {
		String lower = s.toLowerCase();
		System.out.println(lower);
		return lower;
	}

	
}
