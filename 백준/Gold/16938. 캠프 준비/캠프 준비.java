
import java.util.*;
import java.io.*;

public class Main {

	static int N;
	static int L;
	static int R;
	static int X;
	static int[] arr;
	static ArrayList<Integer> output = new ArrayList<>();
	static int cnt;
	static int sum;

	public static void init() throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		L = Integer.parseInt(st.nextToken());
		R = Integer.parseInt(st.nextToken());
		X = Integer.parseInt(st.nextToken());

		arr = new int[N];

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(arr);

	}

	public static void main(String[] args) throws IOException {

		init();
		powerSet(0);
		System.out.println(cnt);

	}

	private static void powerSet(int depth) {
		if (depth == N) {

			sum = 0;
			if (output.size() >= 2)
				if (X <= ((output.get(output.size() - 1)) - output.get(0))) {
//				if (X <= arr[arr.length - 1] - arr[0]) {

					for (int i = 0; i < output.size(); i++) {
						sum += output.get(i);
					}

					if (L <= sum && sum <= R) {
						cnt++;

					}

//					System.out.println(output + " " + sum);
				}
			return;
		}

		output.add(arr[depth]);
		powerSet(depth + 1);
		output.remove(output.size() - 1);

		powerSet(depth + 1);

	}
}
