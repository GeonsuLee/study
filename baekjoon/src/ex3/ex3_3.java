package ex3;

import java.util.Scanner;

public class ex3_3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int sum = 0;
		
		if(a<1 || a>10000) {
			
			while(true) {
				System.out.println("1~10,000사이로 입력해주세요");
				a = sc.nextInt();
				if(a>=1 && a<=10000) {
					break;
				}
			}
		}
		
		for(int i = 1; i <= a; i++) {
			sum += i;
		}
		
		System.out.println(sum);
		
	}

}
