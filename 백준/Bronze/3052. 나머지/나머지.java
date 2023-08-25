import java.util.*;
import java.io.*;

public class Main {
	
			public static void main(String[] args) throws IOException {
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				
				boolean[] arr = new boolean[42]; // 나머지 방문 배열

				for (int i = 0; i < 10; i++) { // 입력받기
					int N = Integer.parseInt(br.readLine());
					arr[N % 42] = true;
				}
				
				int count = 0; 
				for (boolean value : arr) {
					if (value) { // 만약 값이 true 라면 
						count++; //count 증가
					}

				}
				System.out.println(count);
			}

		}
	
