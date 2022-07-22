package ex2;

import java.util.Scanner;

public class ex2_5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("알람을 설정해주세요");
		
		int H = sc.nextInt();
		int M = sc.nextInt();
		
		if(H<0 || H>=24) {
			while(true) {
				System.out.println("시간은 24시간으로 표현해서 입력해주세요");
				H = sc.nextInt();
				if(H>=0 && H<=23) {
					break;
				}
			}
		}
		
		if(M<0 || M>60) {
			while(true) {
				System.out.println("분은 60분으로 표현해서 입력해주세요");
				M = sc.nextInt();
				if(H>=0 && H<=60) {
					break;
				}
			}
		}
		
		
		int Mm = M - 45;
		
		if(Mm==0) {
			if(H==0) {
				H = 23;
			}else {
				H--;
			}
			System.out.println(H+":"+M);
			
		}else if(Mm<0) {
			if(H==0) {
				H = 23;
			}else {
				H--;
			}
			int Mmm = 60+Mm; 
			System.out.println(H+":"+Mmm);
		}
		
	}
}
