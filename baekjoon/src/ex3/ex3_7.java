package ex3;

import java.util.Scanner;

public class ex3_7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int Arr[] = new int[n];
		
		
		for(int i=0; i<n; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			if(A<=0 || B>=10) {
				while(true) {
					System.out.println("A는 0보다 크게, B는 10보다 작게 입력해주세요");
					A = sc.nextInt();
					B = sc.nextInt();
					
					if(A>0 && B<10) {
						break;
					}
				}
			}
			Arr[i] = A+B;
			
		}
		
		for(int j=0; j<Arr.length; j++) {
			System.out.println("Case #"+(j+1)+": "+Arr[j]);
		}
		
	}
	
}
