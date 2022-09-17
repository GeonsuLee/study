package ex8;

import java.util.Scanner;

public class ex8_6 {

	public static boolean[] prime = new boolean[10001];
	
	// 에라토스테네스의 체
	public static void get() {
		prime[0] = prime[1] = true;
		
		for(int i=2; i<=Math.sqrt(prime.length); i++) {
			if(prime[i])
				continue;
			for(int j=i*i; j<prime.length; j+=i) {
				prime[j]=true;
			}
		}
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		get();
		
		int t=sc.nextInt();
		
		while(t-- > 0) {
			int n = sc.nextInt();
			int f_par = n/2;
			int s_par = n/2;
			
			while(true) {
				
				if(!prime[f_par] && !prime[s_par]) {
					System.out.println(f_par+" "+s_par);
					break;
				}
				
				f_par--;
				s_par--;
			}
		}
		
		
		
	}

}
