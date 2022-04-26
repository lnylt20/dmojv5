import java.util.Scanner;

public class CCC04J1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int output = (int) Math.floor(Math.sqrt(num));
		System.out.println("The largest square has side length " + output +".");

	}

}
