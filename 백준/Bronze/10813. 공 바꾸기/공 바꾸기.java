import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[] arr = new int[N + 1];
		
		// 배열 arr는 0으로 초기화되어 있으므로 교환 작업을 수행해도 배열의 값이 변경되지 않는다.
		// 배열을 원하는 순서로 초기화하려면 다음과 같은 코드를 추가
		for (int i = 1; i <= N; i++) {
			arr[i] = i;
		}

		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());

			int temp;

			temp = arr[A];
			arr[A] = arr[B];
			arr[B] = temp;
		}

		for (int i = 1; i <= N; i++) {
			sb.append(arr[i] + " ");
		}

		System.out.println(sb);
	}
}
