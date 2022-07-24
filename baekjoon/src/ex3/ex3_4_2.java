package ex3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ex3_4_2 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(br.readLine());
		
		
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<a; i++) {
		StringTokenizer s = new StringTokenizer(br.readLine()," ");
		sb.append(Integer.parseInt(s.nextToken())+Integer.parseInt(s.nextToken())).append('\n');
		
		}
		
		br.close();
		
		System.out.println(sb);
	
	}
}
