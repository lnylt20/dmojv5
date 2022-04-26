import java.util.ArrayList;
import java.util.Scanner;

public class BlueBookGrades {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int T = scanner.nextInt();
		ArrayList<Integer> grades = new ArrayList<Integer>();
		for(int i = 0; i < T; i++) {
			int temp = scanner.nextInt();
			grades.add(temp);
		}
		scanner.close();
		for(int grade : grades) {
			if(grade >= 80 && grade <= 100) {
				System.out.println("A");
			}
			else if(grade >= 70 && grade <= 79) {
				System.out.println("B");
			}
			else if(grade >= 60 && grade <= 69) {
				System.out.println("C");
			}
			else if(grade >= 50 && grade <= 59) {
				System.out.println("D");
			}
			else if(grade >= 0 && grade <= 49) {
				System.out.println("F");
			}
			else {
				System.out.println("X");
			}
		}
	}

}
