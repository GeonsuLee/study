package ex3;

import java.util.Scanner;

public class ex3_5 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		if(a>100000) {
			while(true) {
			System.out.println("100,000보다 작게 입력해주세요");
			a = sc.nextInt();
				if(a<=10000) {
					break;
				}
			
			}
		}
		
		for(int i=1; i<=a; i++) {
			
			System.out.println(i);
			
		}
		
		
	}
	
}
