package ex1;

import java.util.Scanner;

public class ex1_11 {
	
	public static void main(String[] args) {
		
		System.out.println("불기 연도를 입력하세요");
		Scanner sc = new Scanner(System.in);
			
		int year = sc.nextInt();
		
		if(year > 3000 || year < 1000) {
			
			while(true) {
				System.out.println("불기연도는 1000~3000년 사이로 입력해주세요");
				year = sc.nextInt();
				
				if(year <= 3000 && year >= 1000) {
					break;
				}
			}
			
		}
		
		System.out.println("불기년도 "+year+"년도은 서기연도로 "+(year-543)+"년도 입니다");
	}
}
