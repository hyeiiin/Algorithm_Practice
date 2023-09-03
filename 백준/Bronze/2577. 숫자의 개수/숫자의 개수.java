
import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		int C = Integer.parseInt(br.readLine());

		int result = A * B * C;
		String S = Integer.toString(result); // = String.valueOf(result) -> int를 문자열로 변환 

		int[] arr = new int[10];
		for (int i = 0; i < S.length(); i++) {
			arr[(S.charAt(i)) - 48]++; // = arr[(S.charAt(i)) - '0']++;
		}
		
		for (int j = 0; j < 10; j++) {   // for( int v :arr) 
			System.out.println(arr[j]);   // System.out.println(v); 
		}

	}

}