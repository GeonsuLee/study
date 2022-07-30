package ex3;

import java.util.Scanner;

public class ex3_14 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int end = a;
		int n=0;
		
		while(true) {
			
			a=((a%10)*10)+(((a/10)+(a%10))%10);
			n++;
			if(end == a) {
				break;
			}
		}
		System.out.println(n);
		
	}
	
}
