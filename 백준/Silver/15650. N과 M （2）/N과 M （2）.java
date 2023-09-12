import java.util.*;
import java.io.*;

public class Main {

	public static int[] numbers;
	static int N;
	static int M;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		numbers = new int[N+1];
		perm(0, 1);
	}

	private static void perm(int cnt, int start) {
		if (cnt == M) {
			for (int i = 0; i < M; i++) {
				System.out.print(numbers[i] + " ");
			}
			System.out.println();
		}

		else {
			for (int i = start; i <= N; i++) {
				numbers[cnt] = i;
				perm(cnt+1,i+1); //perm(cnt+1,start+1) : 중복허용
			}
		}
	}
}
