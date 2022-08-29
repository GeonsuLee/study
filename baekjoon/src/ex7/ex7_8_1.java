package ex7;

import java.util.Scanner;

public class ex7_8_1 {

	
	// BigInteger를 안쓴다면?
	// https://st-lab.tistory.com/199 여기서 보면 BigInteger를 안쓰고 직접 구현하는게
	// 처리속도가 더 빠르긴하다
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str_A = sc.next();
		String str_B = sc.next();
		
		
		// 두 개의 수 중 가장 긴 자리수 길이를 구해둠
		int max_length = Math.max(str_A.length(), str_B.length());
		
		// 마지막 자리수 올림이 있을 수 있으므로 +1
		int[] A = new int[max_length + 1];	
		int[] B = new int[max_length + 1];
		
		
 
		// A 초기화
		for(int i = str_A.length() - 1, idx = 0; i >= 0; i--, idx++) {
			
			// 맨 뒤 문자부터 역순으로 하나씩 저장
			A[idx] = str_A.charAt(i) - '0';	
		}
 
		
		// B 초기화
		for(int i = str_B.length() - 1, idx = 0; i >= 0; i--, idx++) {
			
			// 맨 뒤 문자부터 역순으로 하나씩 저장
			B[idx] = str_B.charAt(i) - '0';	
		}
		
		
		
		// 덧셈
		for(int i = 0; i < max_length; i++) {
			int value = A[i] + B[i];
			
			// 더한 값의 10으로 나눈 나머지가 자리값이 됨
			A[i] = value % 10;		
			
			// 더한 값의 10으로 나눈 몫이 올림값이 됨
			A[i + 1] += (value / 10);	
		}
		

		StringBuilder sb = new StringBuilder();
		
		
		// max_length(가장높은 자리수)가 0일 수도 있기 때문에 0이 아닐 경우에만 출력
		if(A[max_length] != 0) {
			sb.append(A[max_length]);
		}
		
		
		// A배열 역순 출력
		for(int i = max_length - 1; i >= 0; i--) {
			sb.append(A[i]);
		}
		
		System.out.println(sb);
		
	}

}
