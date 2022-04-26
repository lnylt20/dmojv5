import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PIB20MarcusHeadBonks {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String N = br.readLine();
		String input = br.readLine();
		String[] splitInput = input.split(" ");
		
		int count = 0;
		for(String s : splitInput) {
			if(Integer.parseInt(s) > 0) {
				count++;
			}
		}
		System.out.println(count);
	}
}
