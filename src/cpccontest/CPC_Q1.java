package cpccontest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CPC_Q1 {

	public static void main(String[] args) throws IOException {
		String alpha = "abcdefghijklmnopqrstuvwxyz";
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		char[] arrInput = input.toCharArray();
		for (int i = 0; i < 26; i++) {
        	if(alpha.charAt(i) != arrInput[0] && alpha.charAt(i) != arrInput[1] && alpha.charAt(i) != arrInput[2] && alpha.charAt(i) != arrInput[3] && alpha.charAt(i) != arrInput[4]) {
        		System.out.println(alpha.charAt(i));
        		break;
        	}
            
        }

	}

}
