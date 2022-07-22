package ex2;

import java.util.Random;

public class ex2_7 {

	public static void main(String[] args) {
		
		Random r = new Random();

		int a = r.nextInt(6)+1;
		int b = r.nextInt(6)+1;
		int c = r.nextInt(6)+1;
		
		if(a==b && a==c) {
			System.out.println(a+","+b+","+c+" = "+(10000+(1000*a))+"원");
		}else if(a==b || a==c) {
			System.out.println(a+","+b+","+c+" = "+(1000+(100*a))+"원");
		}else if(b==c) {
			System.out.println(a+","+b+","+c+" = "+(1000+(100*b))+"원");
		}else
			System.out.println(a+","+b+","+c+" = "+(Math.max(a, Math.max(c, b)))*100+"원");

	}
	
	
	// Math.random(); 을 사용해도됨 이때는 0.0~0.99 숫자로 나오므로 곱하기0.6를 해주고 +1를 해주면
	// 1~6까지의 랜덤한 숫자를 얻을수 있다.
	
	
}
