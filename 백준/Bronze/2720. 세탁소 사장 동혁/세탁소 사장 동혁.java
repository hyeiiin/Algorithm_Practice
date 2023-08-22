
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
    	
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int T = Integer.parseInt(br.readLine());
        
        int Q = 25;
        int D = 10;
        int N = 5;
        int P = 1;
        
        for(int i=0;i<T;i++) {
        	int C = Integer.parseInt(br.readLine());
        	
        	sb.append(C/Q +" ");
        	C %= Q;
        	sb.append(C/D +" ");
        	C %= D;
        	sb.append(C/N +" ");
        	C %= N;
        	sb.append(C/P +"\n");
        	C %= P;
        }
        System.out.println(sb);
    }
}