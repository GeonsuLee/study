package ex6;

import java.util.Scanner;
import java.util.StringTokenizer;

public class ex6_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
        
		String s = sc.nextLine();
		StringTokenizer st = new StringTokenizer(s," ");
		
                
		int a = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
		int b = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
		
		int max = Math.max(a, b);
		
		System.out.print(max);
		
		
	}

}
