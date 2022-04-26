package riolkumockccc;

import java.util.ArrayList;
import java.util.Scanner;

public class S1_Riolku {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String lineOne = scanner.nextLine();
		String word = scanner.nextLine();
		scanner.close();
		String[] splitFirst = lineOne.split(" ");
		int N = Integer.parseInt(splitFirst[0]);
		int C = Integer.parseInt(splitFirst[1]);
		int V = Integer.parseInt(splitFirst[2]);

		
		char[] vowel = "aeiouy".toCharArray();
		char[] consonant = "bcdfghjklmnpqrstvwxyz".toCharArray();
		ArrayList<Character> vowelList = new ArrayList<Character>();
		ArrayList<Character> consonantList = new ArrayList<Character>();

		for(char c : vowel) {
			vowelList.add(c);
		}
		for(char c : consonant) {
			consonantList.add(c);
		}
		int trailingVowels = 0;
		int trailingConsonants = 0;
		boolean valid = true;
		
		for(int i = 0; i < word.length(); i++) {
			char cur = word.charAt(i);
			if(vowelList.contains(cur) && consonantList.contains(cur)) {
				trailingVowels++;
				trailingConsonants++;
			}
			else if(vowelList.contains(cur)) {
				trailingConsonants = 0;
				trailingVowels++;
			}
			else if(consonantList.contains(cur)) {
				trailingVowels = 0;
				trailingConsonants++;
			}
			if((trailingVowels > V) || (trailingConsonants > C)) {
				System.out.println("NO");
				valid = false;
				break;
			}
		}
		if(valid) {
			System.out.println("YES");
		}
	}
}
