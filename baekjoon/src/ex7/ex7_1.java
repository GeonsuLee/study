package ex7;

import java.util.Scanner;

public class ex7_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int a,b,c;
		
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		
		int i=0;
		
		if(b>=c) {
			i=-1;
		}else{
			i=a/(c-b)+1;
		}
		
		
		System.out.println(i);
		
	}

}
