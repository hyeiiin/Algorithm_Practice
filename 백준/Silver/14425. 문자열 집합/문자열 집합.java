import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
//		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		Set<String> set = new HashSet<>();
		for (int i=0; i< N; i++) {
			String input = br.readLine();
			set.add(input);
		}
		int count = 0;
		for(int i=0; i<M; i++) {
			String input = br.readLine();
			
			if(set.contains(input)) {
				count++;
			}
		}
		System.out.println(count);
	}

}
