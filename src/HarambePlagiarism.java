import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HarambePlagiarism {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String original = br.readLine();
		String student = br.readLine();
		String strK = br.readLine();
		int K = Integer.parseInt(strK);
		int count = 0;
		for(int i = 0; i < original.length(); i++) {
			if(original.charAt(i) != student.charAt(i)) {
				count++;
			}
			if((original.charAt(i) == ' ' && student.charAt(i) != ' ') || (original.charAt(i) != ' ' && student.charAt(i) == ' ')) {
				System.out.println("No plagiarism");
				System.exit(0);
			}
		
		}
		if(count < K) {
			System.out.println("Plagiarized");
		}
		else {
			System.out.println("No plagiarism");
		}

	}

}
