
import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int[] arr = new int[8];

		for (int i = 0; i < 8; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		String result = ""; // 문자열 초기
		for (int j = 0; j < arr.length-1; j++) { //배열은 arr.length-1

			if (arr[j] == arr[j + 1] - 1) { // 오름차순 (현재원소 == 다음원소 - 1이 큰지 확인) 
				result="ascending";
			} else if (arr[j] == arr[j + 1] + 1) { // // 내림차순 (현재원소 == 다음원소 - 1이 작은지  확인)
				result="descending";
			} else {
				result="mixed";
				break; //  "mixed"로 판단되는 순간 더 이상의 반복이 필요하지 않기 때문 
			}
		}
		System.out.println(result);
	}

}