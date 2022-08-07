package ex5;

import java.util.Scanner;

public class ex5_3 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		if (n<100) {
			System.out.println(n);
			
		} else {
			int result = 99;
			
			for (int i=100; i<=n; i++) {
				result += checkHanNumber(i);
			}
			
			if (n == 1000) {
				result--;
			}
			
			System.out.println(result);
		}
	}
	
	private static int checkHanNumber(int number) {
		int n1 = number/100%10;
		int n2 = number/10%10;
		int n3 = number%10;
		
		if (n2*2 == n1+n3) {
			return 1;
		}
		
		return 0;
	}
}
