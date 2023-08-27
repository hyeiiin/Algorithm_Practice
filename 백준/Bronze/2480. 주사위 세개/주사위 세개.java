
import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int max = 0;

		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());

		if ((A == B) && (B == C)) {
			System.out.println(10000 + A * 1000);
		} else if ((A == B) || (A == C)) {
			System.out.println(1000 + A * 100);
		} else if ((B == C) || (A == C)) {
			System.out.println(1000 + B * 100);
		} else {
			if ((A != B) && (B != C)) {
				max = Math.max(A, Math.max(B, C));
			}
			System.out.println(max * 100);
		}

	}

}