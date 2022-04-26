package bsspc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class BSSPC_J2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String strM = br.readLine();
		Integer M = Integer.parseInt(strM);
		ArrayList<Integer> classTimes = new ArrayList<Integer>();
		
		for(int i = 0; i < M; i++) {
			String temp = br.readLine();
			String[] times = temp.split(" ");
			
			for(int j = Integer.parseInt(times[0]); j <= Integer.parseInt(times[1]); j++) {
				classTimes.add(j);
			}
			
		}
		
		String strN = br.readLine();
		Integer N = Integer.parseInt(strN);
		int[] allowed = new int[N];
		
		for(int i = 0; i < N; i++) {
			String temp = br.readLine();
			String[] times = temp.split(" ");
			
			if(classTimes.contains(Integer.parseInt(times[0])) || classTimes.contains(Integer.parseInt(times[1]))) {
				allowed[i] = 1;
			}
			else {
				allowed[i] = 0;
			}
			
		}
		
		for(int i : allowed) {
			if(i == 1) {
				System.out.println("Break is Over! Stop playing games! Stop watching Youtube!");
			}
			else {
				System.out.println(":eyy:");
			}
		}

	}

}
