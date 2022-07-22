package ex2;

import java.util.Scanner;

public class ex2_4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("x,y를 입력해주세요");

		int x = sc.nextInt();
		int y = sc.nextInt();
		
		
		if(x==0 || y==0) {
			
			while(true) {
				System.out.println("x또는 y는 0을 입력할수 없습니다");

				x = sc.nextInt();
				y = sc.nextInt();
				if(x!=0 && y!=0) {
					break;
				}
			}
		}
		
		if(x>0 && y>0) {
			System.out.println("1사분면 입니다");
		}else if(x<0 && y>0) {
			System.out.println("2사분면 입니다");
		}else if(x<0 && y<0) {
			System.out.println("3사분면 입니다");
		}else if(x>0 && y<0){
			System.out.println("4사분면 입니다");
		}
		
		
		
	}

}
