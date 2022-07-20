package ex1;

import java.util.Scanner;

public class ex1_13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("3자리수의 자연수 2개를 입력해주세요");
		int a = sc.nextInt();
		
		
		if(a>999 || a<=99) {
			while(true) {
			System.out.println("3자리수를 입력해야 됩니다.");
			a = sc.nextInt();
			
				if(a<999 && a>99) {
					break;
				}
			}
		}
		
		int b = sc.nextInt();
		
		if(b>999 || b<=99) {
			while(true) {
			System.out.println("3자리수를 입력해야 됩니다.");
			b = sc.nextInt();
			
				if(b<999 && b>99) {
					break;
				}
			}
		}
		
		System.out.println(a+"x"+b);
		
		int b1 = b%10;
		int b10 = b%100/10;
		int b100 = b/100;
		
		System.out.println((a*b1)+"\n"+(a*b10)+"\n"+(a*b100)+"\n"+(a*b));
		
		
		
		
	}

}
