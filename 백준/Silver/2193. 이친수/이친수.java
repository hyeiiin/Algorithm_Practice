
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		long[][] dp = new long[2][N + 1];
		// dp[i][j] = i로 끝날 때 j 자릿수의 개수
		
		dp[0][1] = 0;
		dp[1][1] = 1;
		
		for (int f = 2; f < N+1; f++) {
		for (int num = 0; num < 2; num++) {
				if (num == 1) {
					dp[num][f] = dp[0][f - 1];
				} else if (num == 0) {
					dp[num][f] = dp[1][f - 1] + dp[0][f - 1];
				}
			}
		}
		System.out.println(dp[0][N]+dp[1][N]);
	}

}

