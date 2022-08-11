package ex6;

import java.util.Scanner;
import java.util.StringTokenizer;

public class ex6_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		 
		String s = sc.nextLine();
		
 
		StringTokenizer st = new StringTokenizer(s," ");
		
		int count = st.countTokens();
		
		System.out.println(count);	
		
	}
		
}


