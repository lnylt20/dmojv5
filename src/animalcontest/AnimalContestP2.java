package animalcontest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class AnimalContestP2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long[] lineOne = Arrays.stream(br.readLine().split(" ")).mapToLong(Long::parseLong).toArray();
		int N =  (int) lineOne[0];
		long D = lineOne[1];
		int K = (int) lineOne[2];
		long X = lineOne[3];
		Long[] speeds = new Long[N];

        for(int i = 0; i < N; i++) {
        	speeds[i] = (long)Integer.parseInt(br.readLine());
        }
        
        int P = Integer.parseInt(br.readLine());
        Arrays.sort(speeds, Collections.reverseOrder());


        if(canWin(P, K, X, speeds)) 
        	System.out.println("YES");
        else
        	System.out.println("NO");
	}
	
	public static boolean canWin(long P, int K, long X, Long[] speeds) {
		int lastIndex = K - 1;
		if(K > speeds.length) 
			lastIndex = speeds.length - 1;
		
		double temp = (double) speeds[0] * ((100.0 - X)/100.0);
		if(Math.floor(temp) >= P) {
			return false;
		}
		else {
			if(Math.floor(speeds[lastIndex] * ((100 - X)/100)) >= P) {
				return false;
			}
			else {
				return true;
			}
		}
	}
	
	public static boolean canWinV2(long P, int K, long X, Long[] speeds) {
		int count = 0;
		int index = 0;
		while(count < K) {
			double temp = (double) speeds[index] * ((100.0 - X)/100.0);
			speeds[index] = (long) Math.floor(temp);
			if(speeds[index] >= P) {
				
			}
			count++;
		}
		return false;
	}

}
