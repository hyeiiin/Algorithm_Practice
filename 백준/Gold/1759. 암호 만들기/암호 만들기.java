import java.io.*;
import java.util.*;

public class Main {

	// 조합 문제
	static int L;
	static int C;
	static String[] arr;
	static String[] output;
	static boolean[] visited;
	static StringBuilder sb;

	public static void init() throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		L = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(st.nextToken());

		// 배열 초기화
		arr = new String[C];
		output = new String[L];
		visited = new boolean[C];
		sb = new StringBuilder();

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < arr.length; i++) {
			arr[i] = st.nextToken();
		}
		Arrays.sort(arr);
	}

	public static void main(String[] args) throws IOException {

		init();
		backTracking(0, -1);
		System.out.println(sb);

	}

	static boolean isPossible() {
		int v = 0; // 모음
		int c = 0; // 자음
		for (int i = 0; i < L; i++) {
			if (output[i].equals("a") || output[i].equals("e") || output[i].equals("i") || output[i].equals("o")
					|| output[i].equals("u")) {
				v++;
			} else {
				c++;
			}
			if (v >= 1 && c >= 2) {
				return true;
			}
		}
		return false;
	}

	private static void backTracking(int depth, int last) {

		if (depth == L) {
			if (isPossible()) {
				for (int i = 0; i < L; i++) {
					sb.append(output[i]);

				}
				sb.append("\n");
            }
				return;
		}
		for (int i = last+1; i < C; i++) {

			if (!visited[i]) {
				visited[i] = true;
				output[depth] = arr[i];
				backTracking(depth + 1, i);

				visited[i] = false;

			}

		}

	}

}
