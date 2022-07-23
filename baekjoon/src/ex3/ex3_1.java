package ex3;

import java.util.Scanner;

public class ex3_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("구구단을 입력해주세요");
		
		int gugu = sc.nextInt();
		
		
		
		for(int i=1; i<10; i++) {
			System.out.println(gugu+" * "+i+" = "+(gugu*i));
		}
		
	}
	
}
