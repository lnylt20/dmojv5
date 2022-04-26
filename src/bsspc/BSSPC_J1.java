package bsspc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BSSPC_J1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String strS = br.readLine();
		String strShirtSize = br.readLine();
		
		Integer s = Integer.parseInt(strS);
		Integer shirtSize = Integer.parseInt(strShirtSize);
		
		Integer minSize = ((s+2)*3)+16 ;
		
		if(shirtSize >= minSize) {
			System.out.println("Yes it fits!");
		}
		else {
			System.out.println("No, it's too small :(");
		}
	}
}
