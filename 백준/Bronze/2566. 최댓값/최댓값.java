
import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;

		int[][] arr = new int[9][9];

		for (int i = 0; i < 9; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 9; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		int rowOrder = 0;
		int columnOrder = 0;
		int num = 0;
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (num < arr[i][j]) {
					num = arr[i][j];
					rowOrder = i;
					columnOrder = j;
				}
			}

		}
		System.out.println(num);
		System.out.println((rowOrder + 1) + " " + (columnOrder + 1));

	}

}
