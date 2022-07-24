package ex3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class ex3_4 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int a = Integer.parseInt(br.readLine());
		
		for (int i=0; i<a; i++) {
			StringTokenizer s = new StringTokenizer(br.readLine()," ");
			bw.write((Integer.parseInt(s.nextToken())+ 
					  Integer.parseInt(s.nextToken()))+"\n");
			
		}
		
		br.close();
		bw.flush();
		bw.close();
		// 입력은 되는데 출력이 안되어서 찾아보니 close로 닫아줘야했다...

		
	}
	
}
