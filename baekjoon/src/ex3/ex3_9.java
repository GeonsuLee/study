package ex3;

import java.util.Scanner;

public class ex3_9 {

public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		sc.close();
		
		if(n<1 || n>100) {
			while(true) {
				System.out.println("1~100사이의 숫자를 입력해주세요");
				n = sc.nextInt();
				if(n>=1 && n<=100) {
					break;
				}
			}
		}
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
