
import java.util.*;
import java.io.*;

public class Main {

	static int A,B = 0;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		StringBuilder sb = new StringBuilder();

		while(true) {
			st = new StringTokenizer(br.readLine());
			A = Integer.parseInt(st.nextToken());
			B = Integer.parseInt(st.nextToken());
		if(A==0 && B==0) {
			break;
		}
		
		sb.append((A+B)).append('\n');
			
		}
		System.out.println(sb);
	}

}
