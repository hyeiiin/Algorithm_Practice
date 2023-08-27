import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());

		int C = Integer.parseInt(br.readLine());
			if (B + C < 60) {
				System.out.println(A +" "+ (B + C));
			} else {
				int hour= A + ((B + C) / 60);
				int mintue = (B + C) % 60;
				if(hour>=24){
					System.out.println((hour % 24) + " " + mintue);
				}
				else System.out.println(hour + " " + mintue);
			}
		}
	}
