package ex4;

import java.util.Arrays;
import java.util.Scanner;

public class ex4_5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double m = 0;
		
		double arr[] = new double [n];
		double sum = 0;
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		m = arr[n-1];
		
		for(int i=0; i<n; i++) {
			arr[i] = arr[i]/m*100;
		}
		

		for(int i=0; i<n; i++) {
			sum += arr[i];
		}
		
		System.out.println(sum/n);
		
	}

}
