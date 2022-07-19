package ex1;

import java.util.Scanner;

public class ex1_12 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 a를 입력해주세요");
		int a = sc.nextInt();
		if(a<2 || a>10000) {
			while(true) {
				System.out.println("a는 2~10000 사이로 입력해주세요");
				a = sc.nextInt();
				if(a>=2 && a<=10000) {
					break;
				}
			}
		}
		
		System.out.println("정수 b를 입력해주세요");
		int b = sc.nextInt();
		if(b<2 || b>10000) {
			while(true) {
				System.out.println("b는 2~10000 사이로 입력해주세요");
				b = sc.nextInt();
				if(b>=2 && b<=10000) {
					break;
				}
			}
		}
		System.out.println("정수 c를 입력해주세요");
		int c = sc.nextInt();
		if(c<2 || c>10000) {
			while(true) {
				System.out.println("c는 2~10000 사이로 입력해주세요");
				c = sc.nextInt();
				if(c>=2 && c<=10000) {
					break;
				}
			}
		}
			
		int out1 = (a+b)%c;
		int out2 = ((a%c)+(b%c))%c;
		int out3 = (a*b)%c;
		int out4 = ((a%c)*(b%c))%c;
		
		System.out.println("(a+b)%c= "+out1+"\n"+"((a%c)+(b%c))%c= "+out2+"\n"+"(a*b)%c= "+out3+"\n"+"((a%c)*(b%c))%c= "+out4);
		
//		System.out.println("(a+b)/c= "+out1+"\br"
//							+"((a/c)+(b/c))/c= "+out2+"\br"
//							+"(a*b)/c= "+out3+"\br"
//							+"((a/c)*(b/c))/c= "+out4);
		
	}
}
