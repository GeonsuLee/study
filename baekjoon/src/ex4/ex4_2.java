package ex4;

import java.util.Arrays;
import java.util.Scanner;

public class ex4_2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[9];
		int arr2[] = new int[9];
		int index = 0;
		int max = 0;
		
		for(int i=0; i<9; i++) {
			arr[i] = sc.nextInt();
			arr2[i] = arr[i];
		}
		
		Arrays.sort(arr2);
		
		for(int j=0; j<9; j++) {
			
			if(arr2[8] == arr[j]) {
				max = arr[j];
				index = j+1;
			}
		}
		
		System.out.println(max);
		System.out.println(index);
		
	}
	
}
