package ex8;

import java.util.Scanner;

public class ex8_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int cnt=0;
		
		for(int i=0; i<n; i++) {
			int j=sc.nextInt();
			boolean tnf = true;
			
			if(j==1) {
				continue;
			}
			
			for(int k=2; k<Math.sqrt(j); k++) {
				if(j%k==0) {
					tnf=false;
				}
			}
			
			if(tnf==true) {
				cnt++;
			}
		}
		
		System.out.println(cnt);
		
		
		
	}

}
