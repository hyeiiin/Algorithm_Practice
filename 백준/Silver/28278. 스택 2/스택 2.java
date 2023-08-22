import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());
		Stack<Integer> stack = new Stack<>();

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			String M = st.nextToken();

			if (M.equals("1")) {
				stack.push(Integer.parseInt(st.nextToken()));
			} else if (M.equals("2")) {
				if (!stack.isEmpty()) {
					sb.append(stack.pop()).append("\n");
				} else {
					sb.append(-1).append("\n");
				}
			} else if (M.equals("3")) {
				sb.append(stack.size()).append("\n");
			} else if (M.equals("4")) {
				if (!stack.isEmpty()) {
					sb.append(0).append("\n");
				} else {
					sb.append(1).append("\n");
				}
			} else if (M.equals("5")) {
				if (!stack.isEmpty()) {
					sb.append(stack.lastElement()).append("\n");
				} else {
					sb.append(-1).append("\n");
				}

			}

		}

		System.out.println(sb);
	}

}
