package ex6;

import java.util.Scanner;

public class ex6_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	       Scanner sc = new Scanner(System.in);
	       String st = sc.next();

	       char[] ch = st.toCharArray();
			
	       int sum = 0;
	       
	       
	       for (char i : ch) {
	           if (i >= 'A' && i <= 'C') {
	               sum += 3;
	                
	           } else if (i >= 'D' && i <= 'F'){
	               sum +=4;
	                
	           } else if (i >= 'G' && i <= 'I'){
	               sum +=5;
	                
	           }else if (i >= 'J' && i <= 'L'){
	               sum +=6;
	                
	           }else if (i >= 'M' && i <= 'O'){
	               sum +=7;
	                
	           }else if (i >= 'P' && i <= 'S'){
	               sum +=8;
	                
	           }else if (i >= 'T' && i <= 'V'){
	               sum +=9;
	                
	           }else if (i >= 'W' && i <= 'Z'){
	               sum +=10;
	               
	           }
	        }
	        
	        System.out.println(sum);
	        
	}

}
