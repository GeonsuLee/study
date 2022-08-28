package ex7;

import java.util.Scanner;

public class ex7_7_1 {

	public static void main(String[] args) {
		
		// 다른방식
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int b = 0;
		
		while(true) {
			if(n%5==0) {
				b+=n/5;
				System.out.println(b);
				break;
				
			}else {
				n-=3;
				b++;
				
			}
			
			if(n<0) {
				System.out.println("-1");
				break;
			}
		}
		
	}

}
