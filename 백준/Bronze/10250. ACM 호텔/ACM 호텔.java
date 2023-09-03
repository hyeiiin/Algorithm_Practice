import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		StringBuilder sb = new StringBuilder();

		int T = Integer.parseInt(br.readLine());

		for (int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine());
			int H = Integer.parseInt(st.nextToken());
			int W = Integer.parseInt(st.nextToken());
			int N = Integer.parseInt(st.nextToken());

			int X, Y;

			// N % H == 0 일 때를 고려해야 함
			if (N % H == 0) {
				X = N / H;
				Y = H;
			} else {
				X = (N / H) + 1;
				Y = N % H;
			}

			if (X < 10) {
				sb.append(Y).append(0).append(X);

			} else {
				sb.append(Y).append(X);
			}
			sb.append("\n");
		}
		System.out.println(sb);

	}

}