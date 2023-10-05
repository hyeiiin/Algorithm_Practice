

import java.io.*;
import java.util.*;

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
		output = new int[M];
		visited = new boolean[N];
		sb = new StringBuilder();

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);

		// -1인 이유는 아래 for문에서 i가 last+1에서 시작하는데 0 으로 하면 인덱스 1부터 시작하니까 -1로 줘야함
		backTracking(0, -1);
		System.out.println(sb);
	}

	private static void backTracking(int depth, int last) {
		if (depth == M) {
			for (int i = 0; i < M; i++) {
				sb.append(output[i]).append(" ");
			}
			sb.append("\n");
			return;
		}

		for (int i = last + 1; i <N; i++) {
			if (!visited[i]) {
				visited[i] = true;
				output[depth] = arr[i];
				// 다음  output 배열 인덱스 뽑기, 현재  arr i값 내보내기
				backTracking(depth + 1, i);
				visited[i] = false;

			}
		}

	}

}
