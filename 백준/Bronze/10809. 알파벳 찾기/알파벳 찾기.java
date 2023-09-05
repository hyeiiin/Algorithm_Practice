import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String S = br.readLine(); // 문자열 입력받기

		int arr[] = new int[26];

		Arrays.fill(arr, -1); // 배열 초기화

		for (int i = 0; i < S.length(); i++) {

			char ch = S.charAt(i);
			if (arr[ch - 'a'] == -1) // 처음 나온 수만 바꿔주기 위해 -1일 때만 실행
			{
				arr[ch - 'a'] = i; //문자를 int형으로 전환하기 위해 'a'를 빼준다.
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
