package ex6;

import java.util.Scanner;

public class ex6_4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();

		for(int i=0; i<a; i++) {
			
			int b = sc.nextInt();	// 반복할 개수 입력
			String st = sc.next();	
			
			for(int j=0; j<st.length(); j++) {
				
				for(int n=0; n<b; n++) {
					System.out.print(st.charAt(j));
				}
			}
			
			System.out.println();
			
			
			
		}
		
		
	}

}
