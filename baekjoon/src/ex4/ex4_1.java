package ex4;

import java.util.Arrays;
import java.util.Scanner;

public class ex4_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        
		int n = sc.nextInt();
		int[] arr = new int[n];
        
		
		for (int i = 0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
        
		sc.close();
		Arrays.sort(arr);
		// Arrays.sort 메소드는 배열에 값을 오름차순으로 정렬해준다.
		// 그러므로 여기에 저장된 0번 인덱스(index 0)에 최솟값,
		// 마지막 인덱스인 arr.length-1 번째에 최댓값이 있으니 이걸 출력하면 된다.
		
		System.out.print(arr[0]+" "+arr[n-1]);
		
	}
	
}
