package ex4;

import java.util.Scanner;

public class ex4_6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String str = null;
		int sum = 0;
		
		for(int i=0; i<n; i++) {
			
			int count = 0;
			sum = 0;
			str= sc.next();
			
			for(int j=0; j<str.length(); j++) {
				if(str.charAt(j)=='O') {
					count++;
					sum = sum + count;
					
				} else {
					count = 0;
				}
			}
			System.out.println(sum);
		}

	}

}
