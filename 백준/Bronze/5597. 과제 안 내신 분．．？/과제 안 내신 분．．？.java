import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean[] arr = new boolean[31]; 

		for (int i = 0; i < 28; i++) { //사용자로부터 28개의 숫자 입력 받음
			int N = Integer.parseInt(br.readLine()); 
			arr[N] = true; //입력받은 값을 true로 변경 
		}
		for (int i = 1; i <= 30; i++) {
			if (!arr[i])
				System.out.println(i);

		}

	}

}
