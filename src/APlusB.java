import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class APlusB {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String strN = br.readLine();
		int N = Integer.parseInt(strN);
		ArrayList<Integer> sums = new ArrayList<Integer>();
		
		for(int i = 0; i < N; i++) {
			String add = br.readLine();
			String[] addArr = add.split(" ");
			int sum = Integer.parseInt(addArr[0]) + Integer.parseInt(addArr[1]);
			sums.add(sum);
		}
		for(Integer i : sums) {
			System.out.println(i);
		}
	}

}
