package ex8;

import java.util.Scanner;

public class ex8_4 {

	
	public static boolean[] arr;
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		arr = new boolean[n+1];
		get();
		
		for(int i=m; i<=n; i++) {
			
			if(!arr[i]==true) {
				System.out.println(i);
			}
		}
		
	}
		
	
	
	// 에라토스테네스의 체 알고리즘
	public static void get() {
		
		
		arr[0] = true;	// false 경우 소수
		arr[1] = true;
		
		for(int i=2; i<=Math.sqrt(arr.length); i++) {
			
			if(arr[i]) {
				continue;
			}
			
			for(int j=i*i; j<arr.length; j+=i) {
				arr[j] = true;
			}
			
		}
		
	}	
		

}
