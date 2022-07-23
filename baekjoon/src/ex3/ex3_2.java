package ex3;

import java.util.Scanner;

public class ex3_2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		int Arr[] = new int[T]; 
		
		for(int i=0; i<T; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			Arr[i] = A+B;
		}
		
		for(int j : Arr) {
			System.out.println(j);
		}
		
	}
	
}
