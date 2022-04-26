import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class TripleFatLadies {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String strT = br.readLine();
		int t = Integer.parseInt(strT);
		ArrayList<Long> output = new ArrayList<Long>();
		for(int i = 0; i < t; i++) {
			String strInput = br.readLine();
			int input = Integer.parseInt(strInput);			

			while(true) {
				String strSum = Integer.toString(input);
				if(strSum.charAt(strSum.length() - 1) == '2') {
					input = Integer.parseInt(strSum);
					break;
				}
				else {
					input++;
				}
			}
			long j = input;
			while(j < Math.pow(2, 63)) {
				String cubed = Long.toString(j*j*j);
				if(cubed.subSequence(cubed.length()-5, cubed.length()-2).equals("888")) {
					output.add(j);
					break;
				}
				j += 10;
			}
		}
		for(long n : output) {
			System.out.println(n);
		}
	}

}
