package ex7;

import java.util.Scanner;

public class ex7_7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		if(n<5) {
			System.out.println("-1");
		
		}else if(n%5==0) {
			System.out.println(n/5);
		
		}else if(n%5<4 && n%5>0) {
			System.out.println((n/5)+1);
			
		}
		
	}

}
