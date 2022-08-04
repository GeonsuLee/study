package ex4;

import java.util.Scanner;

public class ex4_6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String str;
		int sum = 0;
		

		
		for(int i=0; i<n; i++) {
			
			int count = 0;
			sum = 0;
			str= sc.next();
			
			if(str.length()!=n) {
				while(true) {
					System.out.println("O,X는"+n+"개 만큼 입력이 가능합니다");
					str=sc.next();
					if(str.length() == n) {
						break;
					}
				}
			}
			
			for(int j=0; j<n; j++) {
				if(str.charAt(j)=='O') {
					count++;
					sum = sum + count;
					
				} else {
					count = 0;
				}
			}
			System.out.println(sum);
		}

	}

}
