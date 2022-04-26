import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ListMinimum {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		for(int i = 0; i < N; i++) {
			int temp = scanner.nextInt();
			numbers.add(temp);
		}
		while(numbers.size() != 0) {
			System.out.print(Collections.min(numbers) + " ");
			numbers.remove(Collections.min(numbers));
		}
	}

}
