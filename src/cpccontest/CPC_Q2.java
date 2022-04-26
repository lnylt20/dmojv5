package cpccontest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class CPC_Q2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String strProblems = br.readLine();
		int numProblems = Integer.parseInt(strProblems);
		
		ArrayList<String[]> pairs = new ArrayList<String[]>();
		
		for(int i = 0; i < numProblems; i++) {
			String temp = br.readLine();
			String[] splitNums = temp.split(" ");
			pairs.add(splitNums);			
		}
		
		for(int i = 0; i < numProblems; i++) {
			Double originalNum = Double.parseDouble(pairs.get(i)[0]);
			Double originalDenom = Double.parseDouble(pairs.get(i)[1]);

			double numsGCD = egcd(originalNum, originalDenom);
			double denom = originalDenom/numsGCD;
			double num = originalNum/numsGCD;
			boolean ifInfinite = findIfInfinite(denom);
			if(ifInfinite) {
				System.out.println("-1");
			}
			else {
				Double val = num/denom;
				Double temp = val - Math.floor(val);
				String strVal = Double.toString(temp);
				System.out.println(strVal.substring(2));
			}
			
		}
	}
	
	public static boolean findIfInfinite(double number){
        int count;

		 for (int i = 2; i<=(number); i++) {
	            count = 0;
	            while (number % i == 0) {
	                number /= i;
	                count++;
	                if(i != 5 && i != 2) {
	                	return true;
	                }
	            }
	            if (count == 0) {
	                continue;
	            }
	        }
		 return false;
	}
	
	public static double egcd(double a, double b) {
	    if (a == 0)
	        return b;

	    while (b != 0) {
	        if (a > b)
	            a = a - b;
	        else
	            b = b - a;
	    }

	    return a;
	}

}
