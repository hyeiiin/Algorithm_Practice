
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

		// 배열 초기화
		arr = new int[N];
		output = new int[M];
		visited = new boolean[N];
		sb = new StringBuilder();

		// 배열 초기화 먼저 한 다음 for문 돌려서 값 입력받기
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		// 입력받은 배열 순서대로 진행되기 때문에 오름차순으로 바꿔주기
		Arrays.sort(arr);

// arr를 입력받지 않을 때 단순 1,2,3,4 등 순서대로 arr 넣을 때 	
//		for (int i = 0; i < N; i++) {
//			arr[i] = i + 1;
//		}

		backTracking(0);
		System.out.println(sb);

	}

	private static void backTracking(int depth) {
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
