import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException{
	BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
	
	int N = Integer.parseInt(br.readLine());
	int M = Integer.parseInt(br.readLine());
	
	System.out.println(N*(M%10));
	System.out.println(N*((M%100/10)));
	System.out.println(N*(M/100));
	System.out.println(N*M);
	
	}
}
