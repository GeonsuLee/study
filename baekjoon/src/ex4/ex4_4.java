package ex4;

import java.util.Scanner;

public class ex4_4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int [10];
		int count = 0;
		int temp = 0;
		
		for(int i=0; i<10; i++)	{
			arr[i] = sc.nextInt()%42;
		}
		
		for(int j=0; j<10; j++) {
			temp = 0;
			for(int n=j+1; n<arr.length; n++) {
				
				if(arr[j] == arr[n]) {
					temp++;
				}
			}
			
			if(temp == 0) {
				count++;
			}
			
		}
		
		System.out.println(count);
		
	}

}
