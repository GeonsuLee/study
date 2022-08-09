package ex6;

import java.util.Scanner;

public class ex6_3 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);

		// 알파벳 소문자는 26개
		int [] arr = new int[26];
		
		for(int i=0; i<26; i++) {
			arr[i] = -1;
		}
		
		String s = sc.next();
		
		
		
		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
    
			if(arr[ch-'a'] == -1) {	// 배열 안의 원소 값이 -1 인 경우에만 초기화
				arr[ch-'a'] = i;
			}
		}
 
		for(int i : arr) {	
			System.out.print(i + " ");
		}
		
	}

}
