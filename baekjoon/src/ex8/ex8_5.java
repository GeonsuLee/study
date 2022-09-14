package ex8;

import java.util.Scanner;

public class ex8_5 {

	public static boolean[] p = new boolean[246913];
	
	public static void get() {
		
		p[0] = p[1] = true;
		
		for(int i=2; i<=Math.sqrt(p.length); i++) {
			if(p[i]) {
				continue;
			}
			
			for(int j=i*i; j<p.length; j+=i) {
				p[j]=true;
			}
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		get();
		
		while(true) {
			int n = sc.nextInt();
			if(n==0) {
				break;
			}
			
			int count=0;
			
			for(int i=n+1; i<=2*n; i++) {
				if(!p[i]) {
					count++;
				}
			}
			
			System.out.println(count);
			
		}
		
		
		
		
	}

}
