package ex6;

import java.util.Scanner;

public class ex6_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		Scanner sc = new Scanner(System.in);
		 
		int[] arr = new int[26];
		
		String s = sc.next();
 
		for (int i=0; i<s.length(); i++){
			if ('A'<=s.charAt(i) && s.charAt(i)<='Z') {
				arr[s.charAt(i)-'A']++;	
				
			}else {								// 위에서 대문자를 걸렀으니 남은건 소문자 뿐이다.
				arr[s.charAt(i) - 'a']++;
			}
		}
 
 
		char ch = '?';
 
		for (int i=0; i<26; i++) {
			int m = -1;
			if (arr[i] > m) {
				m = arr[i];
				ch = (char)(i+65);				
				// 아스키코드에서 대문자는 65부터 시작인데 i는 0부터 시작이므로 +65을 해준다.
			
			}else if (arr[i] == m) {
				ch = '?';
			}
		}
 
		System.out.print(ch);
		
		
	}

}
