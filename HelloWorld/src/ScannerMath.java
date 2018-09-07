import java.util.Scanner;

public class ScannerMath {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Give me a number: ");
		
		int firstNumber = s.nextInt();
		System.out.println("Give me another number: ");
		
		int secondNumber = s.nextInt();
		
		int sum;
		sum = firstNumber + secondNumber;
		
		System.out.println("The first number add the second number is: " + sum);

	}

}