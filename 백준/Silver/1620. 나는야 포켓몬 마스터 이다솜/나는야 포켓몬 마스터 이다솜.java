import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()); 
		
		int N = Integer.parseInt(st.nextToken());  
		int M = Integer.parseInt(st.nextToken());
		
		// 순서 일치해주려면 LinkedHashMap<>()
		Map<String, String> nameMap =new LinkedHashMap<>(); // key: 포켓몬 이름, value:포켓몬 번호 
		Map<String, String> numberMap = new HashMap<>(); //key: 포켓몬 번호, value: 포켓몬 이
		for(int i=1;i<=N;i++) {
			String name = br.readLine();
			nameMap.put(name,String.valueOf(i)); //이름, 포켓몬 번호 맵에 넣음
			numberMap.put(Integer.toString(i),name); //포켓몬 번호, 이 맵에 넣음
		}
		
		// int -> String 바꾸는 대표적인 방법 2가지
		// String.valueOf(Int변수)
		// Integer.toString(int변수)

		// String -> int
		// Integer.parseInt(String 변수)
		
		
		// 포켓몬 번호를 뽑는 .get("Pikachu") 
//		System.out.println(nameMap.get("Pikachu"));
//		System.out.println(numberMap.get(25));
		
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<M; i++) {
			String answer = br.readLine(); // 한줄 입력받기 
			
			// 입력값이 포켓몬 이름을 담은맵에 key값으로 존재하면 
			if(nameMap.containsKey(answer)) {
				// 해당 포켓몬 이름에 따른 번호를 출력할 수 있게끔 StringBuilder에 저장 
				sb.append(nameMap.get(answer)).append("\n");
				
			}
			// 입력값이 포켓몬 번호를 담은 맵에 key값으로 존재하면 
			if(numberMap.containsKey(answer)) {
				// 해당 포켓몬 번호에 따른 이름을 출력할 수 있게끔 StringBuilder에 저장 
				sb.append(numberMap.get(answer)).append("\n");
			}
		}
		System.out.println(sb); //StringBuilder 저장한 거 출력 
	}

}