import java.util.Scanner;

public class TimesTables {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		
		for(int i = 1; i <= input; i++) {
			System.out.println(input + " X " + i + " = " + (input*i));
		}

	}

}
