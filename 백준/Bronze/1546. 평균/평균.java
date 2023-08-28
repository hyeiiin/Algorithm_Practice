import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		double arr[] = new double[n];

		double sum = 0;
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Double.parseDouble(st.nextToken());
		}

		// 반복문 써 줄 필요 X
		Arrays.sort(arr);

		for (int i = 0; i < n; i++) {
			// 점수/M*100
			sum += ((arr[i] / arr[n - 1]) * 100);
		}
		System.out.println(sum / n);
	}
}
