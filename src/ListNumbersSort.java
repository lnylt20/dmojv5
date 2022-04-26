import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ListNumbersSort {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(new InputStreamReader(System.in));
		int n = scanner.nextInt();
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for(int i = 0; i < n; i++) {
			int temp = scanner.nextInt();
			arr.add(temp);
		}
		Collections.sort(arr);
		for(int i : arr) {
			System.out.print(i + " ");
		}
	}

}
