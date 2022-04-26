package anunratedcontest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class OlympicScoring {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long[] line = Arrays.stream(br.readLine().split(" ")).mapToLong(Long::parseLong).toArray();

		long N = line[0];
		long B = line[1];
		long S = line[2];
		long G = line[3];
		
		long score = B + S * 3 + G * 5;
		
		long output = (N - score)/5 + 1;
		if(output >= 0) {
			System.out.println(output);
		}
		else {
			System.out.println(0);
		}
	}

}
