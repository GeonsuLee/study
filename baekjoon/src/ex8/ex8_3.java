package ex8;

import java.util.Scanner;

public class ex8_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i=2; i<=n; i++) {
			while(n%i==0) {
				System.out.println(i);
				n/=i;
			}
		}
		
		if(n!=1) {
			System.out.println(n);
		}
		
	}

}
