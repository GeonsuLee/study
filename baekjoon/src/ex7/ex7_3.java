package ex7;

import java.util.Scanner;

public class ex7_3 {

	public static void main(String[] args) {

		
		// 표를 잘보면
		// 짝수번째면 분자가 큰숫자(가로쪽)부터 시작하고
		// 홀수번째면 분모가 큰숫자(세로쪽)부터 시작한다
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		int sum = 0;
		int cut = 1;
		
		// 우선 어느칸에 있는지 확인을 해야된다.
		// 순차적으로 더해가며 증가.
		
		while(true) {
			
			
			if(x<=sum+cut) {
			
				// 2로 나눠서 짝수인지 홀수인지 확인
				if(cut%2==1) {
					int odddeno = cut-(x-sum-1);
					int oddnume = x-sum;
					System.out.println(odddeno+"/"+oddnume);
					break;
				
				}else if(cut%2==0) {
					int odddeno = x-sum;
					int oddnume = cut-(x-sum-1);
					System.out.println(odddeno+"/"+oddnume);
					break;
				}
				

			}else {
				
				sum+=cut;
				cut++;
			}
		}
		
	}

}
