package ex3;

import java.util.Scanner;

public class ex3_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int Arr[] = new int[n];
		int Arr2[] = new int[n];
		
		int A;
		int B;
		
		for(int i=0; i<n; i++) {
			A = sc.nextInt();
			B  = sc.nextInt();
			
			Arr[i] = A;
			Arr2[i] = B;
		}
		
		for(int j=0; j<Arr.length; j++) {
			A = Arr[j];
			B = Arr2[j];
			
			System.out.println("Case #"+(j+1)+": "+A+" + "+B+" = "+(A+B));
		}
		
		
	}

}
