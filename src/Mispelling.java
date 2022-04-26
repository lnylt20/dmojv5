import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Mispelling {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String strCount = br.readLine();
		Integer count = Integer.parseInt(strCount);
		
		for(int i = 0; i < count; i++) {
			String input = br.readLine();
			Integer ind = Integer.parseInt(input.substring(0, 1)) - 1;
			String word = input.split(" ")[1];
			String result = word.substring(0, ind) + word.substring(ind+1);
	
			System.out.println(i + 1 + " " + result);
		}
	}

}
