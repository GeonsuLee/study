package ex6;

import java.util.Scanner;

public class ex6_2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		String st = sc.next();
		int sum = 0;
		for(int i=0; i<n; i++) {
			sum += st.charAt(i)-'0';		// -0를 해줘야지 숫자값으로 사용가능하다
		}
		
		System.out.println(sum);
			
		
		
	}

}
