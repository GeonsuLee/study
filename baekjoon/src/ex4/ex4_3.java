package ex4;

import java.util.Scanner;

public class ex4_3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(a<100 || b<100 || c<100 || a>999|| b>999 || c>999) {
			while(true) {
				System.out.println("a,b,c는 3자리로 입력해야됩니다");
				a = sc.nextInt();
				b = sc.nextInt();
				c = sc.nextInt();
				if(a>=100 && b>=100 && c>=100 && a<1000 && b<1000 && c<1000) {
					break;
				}
			}
		}
		
		int abc = a*b*c;
	
		
		String multi = Integer.toString(abc);
		System.out.println(multi);
		
	
		
		
		for(int i=0; i<10; i++) {
			int count=0;
			
			for(int j=0; j<multi.length(); j++) {
				if(i==(multi.charAt(j)-'0')) {
					count++;
				}
			}
			System.out.println(count);	
			
			
		}
	}
	
}
