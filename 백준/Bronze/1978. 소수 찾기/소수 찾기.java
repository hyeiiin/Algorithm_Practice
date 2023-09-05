import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	    int N = Integer.parseInt(br.readLine());

	    int sum = 0;
	    StringTokenizer st = new StringTokenizer(br.readLine());
	    for (int i = 0; i < N; i++) {
	        int x = Integer.parseInt(st.nextToken());

	        if(x==1) { // 1인 경우 제외시켜주기
	            continue;
	        }
	        if (isprime(x)) {
	            
	            sum++;
	        }

	    }
	    System.out.println(sum);
	}

	static boolean isprime(int num) { // 소수 판별 함수
	    for (int i = 2; i <= Math.sqrt(num); i++) { // (int) Math.sqrt(num) 루트 씌워주기
	        if (num % i == 0) {
	            return false;
	        }

	    }
	    return true;
	}
}