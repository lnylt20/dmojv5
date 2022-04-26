import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DMOPC19TrivialMath {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		String[] lengths = input.split(" ");
		Integer[] l = new Integer[lengths.length];
		for(int i = 0; i < lengths.length; i++) {
			l[i] = Integer.parseInt(lengths[i]);
		}
		if((l[0] + l[1] > l[2]) && (l[1] + l[2] > l[0]) && (l[0] + l[2] > l[1])) {
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}
	}
}
