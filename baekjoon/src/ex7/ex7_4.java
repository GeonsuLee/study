package ex7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex7_4 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		String[] abv = br.readLine().split(" ");
//		if (abv.length > 6) {
//			while(true) {
//				System.out.println("숫자 3개만 입력하세요");
//			}
//		}
		int up = Integer.parseInt(abv[0]);
		int down = Integer.parseInt(abv[1]);
		int v = Integer.parseInt(abv[2]);
		
		
		int upday = up-down;
		int day = 0;
		int sum=0;
		
		while(sum<v) {
			
			sum+=upday;
			
			if(sum==v) {
				break;
			}
			
			day++;
		}
		
		
		System.out.println(day);
		
	}

}
