
import java.util.*;
import java.io.*;

public class Main {

	static int N;
	static int M;
	static int[] arr;
	static int[] output;
	static boolean[] visited;
	static StringBuilder sb;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

		arr = new int[N];
		visited = new boolean[N];
		output = new int[N];
		sb = new StringBuilder();

		for (int i = 0; i < N; i++) {
			arr[i] = i + 1;
		}

		backTracking(0);
		System.out.println(sb);
	}

	public static void backTracking(int depth) {
		if (depth == M) {
			for (int i = 0; i < M; i++) {
				sb.append(output[i]).append(" ");
			}
			sb.append("\n");
			return;
		}
		for (int i = 0; i < N; i++) {
			if (!visited[i]) {
				visited[i] = true;
				output[depth] = arr[i];
				backTracking(depth + 1);

				visited[i] = false;
			}
		}
	}
}