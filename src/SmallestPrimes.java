import java.util.Scanner;

public class SmallestPrimes {

	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    int n = scanner.nextInt();
	    scanner.close();
	    int i = n;
	    while(true) {
	        if(isPrime(i)) {
	            System.out.println(i);
	            break;
	        }
	        i++;
	    }
	}
	
	public static boolean isPrime(int checkNumber) {
		double root = Math.sqrt(checkNumber);
		if(checkNumber == 1) {
			return false;
		}
		for (int i = 2; i <= root; i++) {
			if (checkNumber % i == 0)
				return false;
		}
		return true;
	}
}