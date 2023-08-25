
import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[] arr = new int[N];

		// 배열 초기화
		for (int k = 0; k < N; k++) {
			arr[k] = k + 1;
		}

		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int s = Integer.parseInt(st.nextToken()) - 1;// 인덱스는 0부터 시작
			int f = Integer.parseInt(st.nextToken()) - 1;

			// s부터 f까지 역순으로 만들기
			while (s < f) {
				int temp = arr[s];
				arr[s] = arr[f];
				arr[f] = temp;
				s++;
				f--;
			}

		}
		// 출력 준비
		for (int i = 0; i < N; i++) {
			sb.append(arr[i] + " ");
		}
		System.out.println(sb);

	}

}