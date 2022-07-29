package ex3;

import java.util.Scanner;

public class ex3_13 {

	public static void main(String[] args) {
		
		
		
//		두 정수는 공백으로 나뉘어 구분된다.
//		입력의 종료는 더이상 읽을 수 있는 데이터 (EOF) 가 없을 때 종료한다.
		
//		여기서 EOF란?
//			End Of File 의 줄임말로 데이터 없을때 없을때 종료한다는 뜻이다
		
		Scanner sc = new Scanner(System.in);
		System.out.println("a와 b를 입력하세요");
		while(true) {
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println(a+b);
		}
		
		
		
	}
	
}
