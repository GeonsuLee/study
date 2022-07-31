package ex4;

import java.util.Scanner;

public class ex4_3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(a<100 || b<100 || c<100) {
			while(true) {
				System.out.println("a,b,c는 3자리로 입력해야됩니다");
				a = sc.nextInt();
				b = sc.nextInt();
				c = sc.nextInt();
				if(a>=100 && b>=100 && c>=100) {
					break;
				}
			}
		}
		
		int abc = a*b*c;
		
		String multi = Integer.toString(abc);
		System.out.println(multi);
		
		multi.charAt(0);
		System.out.println(multi.charAt(0));
		
		for(int i=0; i<multi.length(); i++) {
			
			
			
			
		}
	}
	
}
