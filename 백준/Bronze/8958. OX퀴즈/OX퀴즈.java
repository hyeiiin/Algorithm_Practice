import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());

		String arr[] = new String[N];

		for (int i = 0; i < N; i++) {
			arr[i] = br.readLine();
		}

		for (int i = 0; i < N; i++) {
			
			int cnt = 0; // 연속횟수
			int sum = 0; // 누적 합산
			
			for (int j = 0; j < arr[i].length(); j++) {
				if (arr[i].charAt(j) == 'O') { // 'O'라면
					cnt++; // 연속 횟수 증가
				} else { // 'X'라면
					cnt = 0; // 연속 횟수 초기화
				}
				sum += cnt; // 누적 점수에 연속 횟수를 더함
			}
			
			sb.append(sum).append('\n');
		}

		System.out.print(sb);
	}
}