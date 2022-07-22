package ex2;

import java.util.Scanner;

public class ex2_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("a,b를 입력해주세요");

		int a = sc.nextInt();
		int b = sc.nextInt();
		
		
		if(a>b) { 
			System.out.println(">");
		}else if(a<b) { 
			System.out.println("<");
		}else 
			System.out.println("==");
	}

}
