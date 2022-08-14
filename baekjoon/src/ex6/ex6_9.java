package ex6;

import java.util.Scanner;

public class ex6_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		String st = sc.nextLine();
		int count = 0;
		
		
		for (int i=0; i<st.length(); i++) {
			 
			char ch = st.charAt(i);
 
			if(ch == 'c') {			
				if(i < st.length() - 1) {
					if(st.charAt(i + 1) == '=') {		
						i++;	
						
					}else if(st.charAt(i + 1) == '-') {
						i++;
					}
				}
			}
		    
			else if(ch == 'd') {
				if(i < st.length() - 1) {
					if(st.charAt(i + 1) == 'z') {
						if(i<st.length() - 2) {
							if(st.charAt(i + 2) == '=') {
								i += 2;
							}
						}
						
					}else if(st.charAt(i + 1) == '-') {
						i++;
						
					}
				}
			}
			
			
			
		    
			else if(ch == 'l') {
				if(i<st.length() - 1) {
					if(st.charAt(i + 1) == 'j') {
						i++;
						
					}
				}
			}
		    
			else if(ch == 'n') {
				if(i < st.length() - 1) {
					if(st.charAt(i + 1) == 'j') {
						i++;
						
					}
				}
			}
 
			else if(ch == 's') {
				if(i < st.length() - 1) {
					if(st.charAt(i + 1) == '=') {
						i++;
						
					}
				}
		    }
 
			else if(ch == 'z') {
				if(i < st.length() - 1) {
					if(st.charAt(i + 1) == '=') {
						i++;
						
					}
				}
			}
		    
			count++;
 
		}
	}

}
