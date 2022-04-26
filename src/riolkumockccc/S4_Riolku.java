package riolkumockccc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class S4_Riolku {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String strN = br.readLine();
		int N = Integer.parseInt(strN);
		String c = br.readLine();
		Integer[] max = new Integer[4];
		String[] splitC = c.split(" ");
		Integer[][] abGrid = new Integer[N][2];
		for(int i = 0; i < N; i++) {
			max[i] = Integer.parseInt(splitC[i]);

			String temp = br.readLine();
			String[] tempSplit = temp.split(" ");
			abGrid[i][0] = Integer.parseInt(tempSplit[0]);
			abGrid[i][1] = Integer.parseInt(tempSplit[1]);
		}

		//		for(Integer[] a : abGrid) {
		//			System.out.println(Arrays.deepToString(a));
		//		}

		Integer[] currentAmounts = new Integer[N];
		Arrays.fill(currentAmounts, 0);
		int count = 0;
		for(int i = 0; i < N; i++) {
			if(i+1<N) {
				if(currentAmounts[i] >= max[i] && currentAmounts[i+1] >= max[i+1]) {
					break;
				}
			}
			if(currentAmounts[i] < max[i]) {
				currentAmounts[i] += abGrid[i][0];
			}
			if((i < N-1) && currentAmounts[i+1] < max[i+1]) {
				currentAmounts[i+1] += abGrid[i][1];
			}
			count++;
//			System.out.println(Arrays.deepToString(currentAmounts));

		}
		System.out.println(count);

	}
}
