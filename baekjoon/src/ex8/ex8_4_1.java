package ex8;

import java.util.Scanner;

public class ex8_4_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		prime(m, n);
		
	}

	
	static void prime(int m, int n) {
		int[] arr = new int [n+1];
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=2; i<=n; i++) {
			arr[i]=i;
		}
		
		
		for(int i=2; i<=n; i++) {
			if(arr[i]==0) {
				continue;
			}
			
			for(int j=i+i; j<=n; j+=i) {
				arr[j]=0;
			}
		}
		
		for(int i=m; i<=n; i++) {
			if(arr[i]!=0) {
				sb.append(i+"\n");
			}
		}
		
		System.out.println(sb);
	}
	
	
}
