package animalcontest3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class AnimalContest3P1 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] lineOne = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int A =  lineOne[0];
		int B = lineOne[1];
		int C = lineOne[2];
		int D = lineOne[3];
		
		boolean needSugar = false;
		boolean needToothpaste = false;
		
		if(A < B) {
			needSugar = true;
		}
		if(C < D) {
			needToothpaste = true;
		}
		
		if(needSugar && needToothpaste) {
			System.out.println("Go to the department store");
		}
		else if(needSugar && !needToothpaste) {
			System.out.println("Go to the grocery store");
		}
		else if(!needSugar && needToothpaste) {
			System.out.println("Go to the pharmacy");
		}
		else if(!needSugar && !needToothpaste) {
			System.out.println("Stay home");
		}

	}

}
