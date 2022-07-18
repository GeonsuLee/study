package ex1;

import java.util.Scanner;

public class ex1_8 {
	
	public static void main(String[] args) {
		
		System.out.println("a를 입력해주세요.");
		Scanner sc = new Scanner(System.in);
		double a = sc.nextInt();
		if(a<=0) {
			System.out.println("a는 0보다 크게 입력해주세요");
			a = sc.nextInt();
		}
		
		
		System.out.println("b를 입력해주세요.");
		double b = sc.nextInt();
		if(b>=10) {
			System.out.println("b는 10보다 작게 입력해주세요");
			b = sc.nextInt();
		}
		double c = a/b;
		System.out.println("a / b="+c);
		
	}
	
}
