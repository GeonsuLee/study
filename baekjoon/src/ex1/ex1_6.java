package ex1;

import java.util.Scanner;

public class ex1_6 {

	public static void main(String[] args) {
		
		System.out.println("a를 입력해주세요.");
		Scanner sc = new Scanner(System.in);
		int a  = sc.nextInt();
		if(a<=0) {
			System.out.println("a는 0보다 크게 입력해주세요");
		a = sc.nextInt();
		}
		
		System.err.println("b를 입력해 주세요.");
		
		int b = sc.nextInt();
		if(b>=10) {
			System.out.println("b는 10보다 작게 입력해주세요");	
		b = sc.nextInt();
		}
		
		System.out.println("a-b="+(a-b));
	}

}
