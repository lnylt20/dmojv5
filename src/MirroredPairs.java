import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MirroredPairs {

	public static void main(String[] args) throws IOException {
		System.out.println("Ready");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			String temp = br.readLine();
			if(!temp.equals("  ")) {
				compare(temp);
			}
			else {
				break;
			}
		}
				
	}
	
	public static void compare(String s) {
		if(s.charAt(0) == 'p' && s.charAt(1) == 'q') {
			System.out.println("Mirrored pair");
			
		}
		else if(s.charAt(0) == 'q' && s.charAt(1) == 'p') {
			System.out.println("Mirrored pair");
			
		}
		else if(s.charAt(0) == 'b' && s.charAt(1) == 'd') {
			System.out.println("Mirrored pair");
			
		}
		else if(s.charAt(0) == 'd' && s.charAt(1) == 'b') {
			System.out.println("Mirrored pair");
			
		}
		else {
			System.out.println("Ordinary pair");
		}
		

	}

}
