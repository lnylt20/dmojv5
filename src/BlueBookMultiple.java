import java.util.Scanner;

public class BlueBookMultiple {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int first = scanner.nextInt();
		int second = scanner.nextInt();
		if(first % second == 0) {
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}
	}

}
