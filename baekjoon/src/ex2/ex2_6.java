package ex2;

import java.util.Scanner;

public class ex2_6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("A,B,C를 입력해주세요");
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		int a = A*60;
		int total = a+B+C;
		int totalA = (total/60);
		int totalB = (int) (Math.round((((total/(double)60)-(total/60))*60)));
		
		if(totalA == 24) {
			totalA = 0;
		}else if(totalA > 24){
			totalA = totalA-24;
		}
		
		
		System.out.println(totalA+" "+totalB);
		
	}
	
	// 하긴 했는데 뭔가 이상한데? .... totalB쪽이 너무 복잡하다... 으음..
	
}
