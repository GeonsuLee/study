package ex7;

import java.io.IOException;
import java.util.Scanner;

public class ex7_5 {
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for(int i=0; i<t; i++) {
			
			
			int h = sc.nextInt();
			int w = sc.nextInt();	// 안쓰는데 문제에서 입력하라고 하니 넣었다 쓸모없는변수임
			int n = sc.nextInt();
			
			
			if(n%h==0) {
				System.out.println((h*100)+(n/h));
			
			}else {
				System.out.println(((n%h)*100)+((n/h))+1);
				
			}
		}
	
	
	}
}
