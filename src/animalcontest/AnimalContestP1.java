package animalcontest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AnimalContestP1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		String[] inputValues = input.split(" ");
		Integer square = Integer.parseInt(inputValues[0]);
		Integer circle = Integer.parseInt(inputValues[1]);
		
		if((square * square) > (circle * circle * Math.PI)) {
			System.out.println("SQUARE");
		}
		else {
			System.out.println("CIRCLE");
		}
	}

}
