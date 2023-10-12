
import java.io.*;
import java.util.*;

public class Main {

	static int[] arr;
	static int N;
	static int S;
	static int sum;
	static int cnt;
	static ArrayList<Integer> output = new ArrayList<>();

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		S = Integer.parseInt(st.nextToken());

		arr = new int[N];

		cnt = 0;

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		powerSet(0);
		if (S == 0) {
			cnt -= 1;
		}
		System.out.println(cnt);

	}

	private static void powerSet(int depth) {

		sum = 0;

		if (depth == N) {

			for (int j = 0; j < output.size(); j++) {
				sum += output.get(j);
			}

			if (sum == S) {
				cnt++;
			}

			return;
		}

		output.add(arr[depth]);
		powerSet(depth + 1);

		output.remove(output.size() - 1);
		powerSet(depth + 1);

	}

}
