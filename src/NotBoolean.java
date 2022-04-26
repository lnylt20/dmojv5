import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NotBoolean {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		String[] splitInput = input.split(" ");

		boolean originalBoolean = Boolean.parseBoolean(splitInput[splitInput.length-1].toLowerCase());
		if(splitInput.length % 2 == 0) {
			if(originalBoolean) {
				System.out.println("False");
			}
			else {
				System.out.println("True");
			}
		}
		else {
			if(originalBoolean) {
				System.out.println("True");
			}
			else {
				System.out.println("False");
			}
		}
	}
}
