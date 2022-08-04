package ex5;

public class ex5_2 {

	int DR(int n) {
		
		int dn=0;
		
		while(true) {
			
			n = n+(n/10)+(n%10);
			
			
			if(dn<10000 && dn>9990) {
				break;
			}
		}
		
		
		return dn;
		
	}
	
}
