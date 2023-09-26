import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static int[][] sdoku=new int[9][9];
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for (int i = 0; i < 9; i++) {	// 스도쿠 초기화
			String str = br.readLine();
			for (int j = 0; j < 9; j++) {
				sdoku[i][j] = str.charAt(j)-'0';
			}
		}
		
		fill(0, 0);

	}

	private static void fill(int row, int col) {

		if(col==9) {	// 행이 9번째라면 다음열 호출
			fill(row+1, 0);
			return;
		}
		
		if(row==9) {	// 열이 9번째라면 스도쿠 완성 -> 스도쿠 출력 후 종료
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < 9; i++) {
				for (int j = 0; j < 9; j++) {
					sb.append(sdoku[i][j]);
				}
				sb.append("\n");
			}
			System.out.println(sb);
			System.exit(0);
		}
		
		if(sdoku[row][col] == 0) {	// 현재 위치에서 0이라면
			for (int i = 1; i <= 9; i++) {	// 1부터 9까지 값을 넣을 수 있는 경우의 수 넣고
				if(possibility(row, col, i)) {	// 값을 넣을 수 있는 경우라면
					sdoku[row][col] = i;	// 현재 위치에 값을 넣고
					fill(row, col+1);	// 다음 행 호출
				}
			}
			sdoku[row][col] = 0;	// 호출하지 못한경우 0으로 돌려두기
			return;
		}
		
		fill(row, col+1);	// 이미 값이 있다면 다음 행 호출
	}

	private static boolean possibility(int row, int col, int num) {
		
		for (int i = 0; i < 9; i++) {	// 행과 열의 값 중 넣으려는 수가 있다면 false 리턴
			if(sdoku[row][i] == num || sdoku[i][col] == num) return false;
		}
		
		// 3*3 값 확인하기
		int rows = (row/3)*3;
		int cols = (col/3)*3;
		for (int i = rows; i < rows+3; i++) {
			for (int j = cols; j < cols+3; j++) {
				if(sdoku[i][j] == 0) continue;	// 아직 안채워진 부분이 있다면 다음 행 확인
				if(sdoku[i][j] == num) return false;	// 만약 넣으려는 수와 같다면 false 리턴
			}
		}
		
		return true;
	}

}
