

import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder(); 
		
		int N = Integer.parseInt(br.readLine());
		
		for(int i = 0;i<N/4;i++) {
			if((N/4)!=0) {
				sb.append("long ");
			}
		}
		sb.append("int");
		System.out.println(sb);
	}

}