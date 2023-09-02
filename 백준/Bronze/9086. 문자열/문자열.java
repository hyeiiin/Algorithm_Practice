
import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		for (int i = 0; i < N; i++) {
			String st = br.readLine();

			System.out.println(st.charAt(0) + "" + st.charAt(st.length()-1));
		}
	}

}
