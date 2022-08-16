package ex6;

import java.util.Scanner;

// 다른방법
public class ex6_10_1 {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int count = 0;
		int n = sc.nextInt();
 
		for(int i=0; i<n; i++) {
			if(check() == true) {
				count++;
			}
		}
		System.out.println(count);
		
	}
	
	
	public static boolean check() {
		
		boolean[] check = new boolean[26];
		
		// ch라는 변수를 생성해서 다음 글자랑 같은지 다른지 비교를 해준다
		int ch = 0;
		String s = sc.next();
		
		for(int i=0; i<s.length(); i++) {
			int now = s.charAt(i);	
			
			if(ch != now) {		
				
				if(check[now-'a'] == false) {
					
					check[now-'a'] = true;	
					ch = now;		
					
				}else {
					
					return false;	
				}
				
			}else {
				continue;
				
			}
			
		}    
		
		return true;
	}
	
	

}
