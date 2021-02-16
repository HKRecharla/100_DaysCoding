package java_H.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadInput_Buffer {
	
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(bf.readLine());
		
		
		while(t--> 0) {
			String S = bf.readLine();
			System.out.println(S);
		}
	}
}
