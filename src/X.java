import java.util.ArrayList;
import java.util.Scanner;

public class X {
	public static void main(String[] args) {
		System.out.println("From: ");
		Scanner scanner = new Scanner(System.in);
		int firstNumber = scanner.nextInt();
		System.out.println("To: ");
		int secondNumber = scanner.nextInt();
		
		ArrayList<Integer> primeNumber = new ArrayList<>();
		
		long startTIme = System.nanoTime();
		
		for (int i = firstNumber; i <= secondNumber; i++) {
			int divider = 2;
			int count = 0;
			while(divider < i){
				if (i % divider == 0) {
					count++;
				}
				
				divider++;
			}
			if (count == 0) {
				primeNumber.add(i);
			}
		}
		
		long endTime = System.nanoTime();
		System.out.println(endTime - startTIme);
		
		System.out.println(primeNumber);
	}
}
