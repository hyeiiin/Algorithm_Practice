import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String st = br.readLine();
		int N = Integer.parseInt(br.readLine());

		System.out.println(st.charAt(N - 1));
	}

}