package ex6;

import java.util.Scanner;

public class ex6_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int n=sc.nextInt();
		int cnt=0;
		
		for(int i=0; i<n; i++) {
			String s=sc.next();
			boolean bl [] = new boolean[26];
			boolean taf = true;
			
			for(int j=0; j<s.length(); j++) {
				int index=s.charAt(j)-'a';
				
				if(bl[index]==true) {			// ==ture는 생략 가능하다.
					if(s.charAt(j) != s.charAt(j-1)) {
						taf = false;
					}
				}else {
					bl[index] = true;
				}
			}
			
			if(taf==true) {
				cnt++;
			}
			
		}
		
		
		
		System.out.println(cnt);
		
	}

}
