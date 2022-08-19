package ex7;

import java.util.Scanner;

public class ex7_2 {

	public static void main(String[] args) {
		
		// 가운데가 1이고 증가하는 존당 6개의 칸이 증가한다.
		// 즉 가운데에 1칸이 있고 그다음 감싸는 존이 6칸 그다음에 감싸는 존은 12칸 이런식으로 6의배수로증가
		// 길(route)은 존당 1씩으로 증가한다.

		
		Scanner sc = new Scanner(System.in);
		
		int n=sc.nextInt();
		
		// 	 zon = 1, 6, 12, 18, 24, ....
		// route = 1, 2,  3,  4,  5, .....	
		int zon=1;
		int route=1;
			
		
		if(n==1) {
			System.out.println(route);
		
		}else if(n>1) {
			// 존이 증가할때마다 route가 1씩 증가 하면 된다. 그걸 반복문으로 돌리면 완성
			zon=2;
			while(zon<=n) {
				zon = zon+(6*route);
				
				route++;
			}
			
			System.out.println(route);
		}
		
	}

}
